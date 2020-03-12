package com.nubes.internship.ProductDatabase;

import java.sql.*; 
import java.util.List;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {

	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private DatabaseUtil dbUtil = DatabaseUtil.obj;
	Scanner sc = new Scanner(System.in);

	private static final String ADD_PRODUCT = "insert into product(pid,pname,price,discount) values(?,?,?,?)";
	private static final String SHOW_PRODUCT = "select * from product";
	private static final String DELETE_PRODUCT = "delete  from product where pid = ? ";
	private static final String UPDATE_PRODUCT = "update product set pname = ?,price = ?,discount = ? where pid = ?";
	private static final String SEARCH_PRODUCT = "select * from product where pid = ?";

	@Override
	public Product addProduct(Product product) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(ADD_PRODUCT);
			pst.setInt(1, product.getPid());
			pst.setString(2, product.getPname());
			pst.setDouble(3, product.getPrice());
			pst.setDouble(4, product.getDiscount());
			int i = pst.executeUpdate();
			if (i == 1) {
				System.out.println("Products Added Successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}
		return null;
	}

	@Override
	public List<Product> showProducts() {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(SHOW_PRODUCT);
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("pid") + " " + rs.getString("pname") + " " + rs.getDouble("price") + " "
						+ rs.getDouble("discount"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}
		return null;
	}

	@Override
	public Product deleteProduct(Product product) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(DELETE_PRODUCT);
			pst.setInt(1, product.getPid());
			int i = pst.executeUpdate();
			if (i !=0) {
				System.out.println("Successfully Deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			dbUtil.close(con, pst);
		}
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(UPDATE_PRODUCT);
			pst.setString(1, product.getPname());
			pst.setDouble(2, product.getPrice());
			pst.setDouble(3, product.getDiscount());
			pst.setInt(4, product.getPid());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

		return null;
	}

	@Override
	public Product searchProduct(Product product) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(SEARCH_PRODUCT);
			pst.setInt(1, product.getPid());
			rs = pst.executeQuery();
			System.out.println(rs.getInt("pid") + " " + rs.getString("pname") + " " + rs.getDouble("price") + " "
					+ rs.getDouble("discount"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}
		return null;
	}

}
