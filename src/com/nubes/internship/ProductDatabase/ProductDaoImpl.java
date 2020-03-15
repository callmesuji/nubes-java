package com.nubes.internship.ProductDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {

	private Connection con = null;
	private PreparedStatement pst = null;
	private Statement st = null;
	private ResultSet rs = null;
	private DatabaseUtil dbUtil = DatabaseUtil.obj;
	Scanner sc = new Scanner(System.in);

	private static final String ADD_PRODUCT = "insert into product(pid,pname,price,discount) values(?,?,?,?)";
	private static final String SHOW_PRODUCT = "select pid,pname,price,discount from product";
	private static final String DELETE_PRODUCT = "delete from product where pid = ? ";
	private static final String UPDATE_PRODUCT = "update product set pname = ?,price = ?,discount = ? where pid = ?";
	private static final String SEARCH_PRODUCT = "select pid,pname,price,discount from product where pid = ?";
	private static final String GET_COUNT = "select count(pid) as count from product";

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
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}
		return product;
	}

	@Override
	public List<Product> showProducts() {
		List<Product> list = new ArrayList<>();
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(SHOW_PRODUCT);
			rs = pst.executeQuery();
			while (rs.next()) {
				Integer pid = rs.getInt("pid");
				String pname = rs.getString("pname");
				Double price = rs.getDouble("price");
				Double discount = rs.getDouble("discount");
				Product product = new Product(pid, pname, price, discount);
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}
		return list;
	}

	@Override
	public Product deleteProduct(Integer pid) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(DELETE_PRODUCT);
			pst.setInt(1, pid);
			int i = pst.executeUpdate();
			if (i == 1) {
				System.out.println("Successfully Deleted");
			} else {
				System.out.println("Please Enter Valid ID");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			dbUtil.close(con, pst);
		}
		return null;
	}

//         UPDATING       PRODUCT 
// 	private static final String UPDATE_PRODUCT = "update product set pname = ?,price = ?,discount = ? where pid = ?";
	@Override
	public Product updateProduct(Product product) {
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(UPDATE_PRODUCT);
			pst.setString(1, product.getPname().toUpperCase());
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

//         SEARCHING       PRODUCT 

// 	private static final String SEARCH_PRODUCT = "select pid,pname,price,discount from product where pid = ?";

	@Override
	public List<Product> searchProduct(Integer pid) {
		List<Product> list = new ArrayList<>();
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(SEARCH_PRODUCT);
			pst.setInt(1, pid);
			rs = pst.executeQuery();
			while (rs.next()) {
				Integer pro_id = rs.getInt("pid");
				String pname = rs.getString("pname");
				Double price = rs.getDouble("price");
				Double discount = rs.getDouble("discount");
				Product product = new Product(pro_id, pname, price, discount);
				list.add(product);
//				System.out.println(rs.getInt("pid") + " " + rs.getString("pname") + " " + rs.getDouble("price") + " "
//						+ rs.getDouble("discount"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}
		return list;
	}

	@Override

	public boolean checkproduct(Integer id) {
		List<Product> list = showProducts();
		for (Product pro : list) {
			if (pro.getPid().equals(id)) {
				return true;
			}
		}
		return false;

	}

// select count(pid) from product;
	@Override
	public int getcount() {
		int count = 0;
		try {
			con = dbUtil.getconnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_COUNT);
			while (rs.next()) {
				count = rs.getInt("count");
				return count;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}
		return count;

	}

}
