package com.nubes.internship.day_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServiceJDBCImpl implements ContactService {
	private Connection con = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private DatabaseUtil dbUtil = DatabaseUtil.obj;
	Scanner sc = new Scanner(System.in);

	private static final String Add_Contact = "insert into contact(name,mobile,city,id) values(?,?,?,?)";
	private static final String GET_CONTACT = "select name,mobile,city,id from contact";
	private static final String DEL_CONTACT = "delete  from contact where id = ? ";
	private static final String UPD_CONTACT = "update contact set name = ?,mobile = ?,city = ?,id = ? where id = ?";

	@Override
	public Contact addContact(Contact contact) {
		List<Contact> contacts = new ArrayList<>();

		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(Add_Contact);
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getMobile());
			pst.setString(3, contact.getCity());
			pst.setInt(4, contact.getCid());
			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("Added Successfully");
			} else {
				System.out.println("failed to add");
			}
			contacts.add(contact);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

		return null;
	}

	@Override
	public List<Contact> getContacts() {
		//List<Contact> contacts = new ArrayList<>();

		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(GET_CONTACT);
			rs = pst.executeQuery();
			System.out.println(
					" " + "  NAME      " + "   CITY        " + "             MOBILE NO    " + "           ID   ");

			System.out.println("-----------------------------------------------------------------------------------");

			while (rs.next()) {
				System.out.println(
						" " + rs.getString("name").toUpperCase() + "	   ||   " + rs.getString("city").toUpperCase()
								+ "	  ||	" + rs.getString("mobile") + "	  ||   " + rs.getInt("id"));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst, rs);
		}

		return null;
	}

	@Override
	public Contact updateContact(int id) {
		try {
			List<Contact> c = new ArrayList<>();
			for(Contact contacts :c) {
				if(contacts.getCid().equals(id)){
					pst = con.prepareStatement(UPD_CONTACT);
					System.out.println("Enter new name");
					String name = sc.nextLine();
					contacts.setName(name);
					pst.setString(1, name.toUpperCase());
					System.out.println("Enter new Mobile ");
					String mobile = sc.nextLine();
					pst.setString(2, mobile);
					System.out.println("Enter new City ");
					String city = sc.nextLine();
					pst.setString(3, city.toUpperCase());
					System.out.println("Enter new ID");
					int id1 = sc.nextInt();
					pst.setDouble(4, id1);
					pst.setInt(5, id1);
				}
			}
			// private static final String UPD_CONTACT = "update contact set name = ?,mobile
			// = ?,city = ?,id = ? where id = ?";


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

		return null;
	}

	@Override
	public String deleteContact(Integer cid) {
		try {
			if (cid == 0) {
				System.out.println("---**---NO CONTACTS TO DELETE---**---");
			} else {
				con = dbUtil.getConnection();
				pst = con.prepareStatement(DEL_CONTACT);
				pst.setInt(1, cid);
				int rs = pst.executeUpdate();
				if (rs != 0) {
					System.out.println("Deleted Successfully");
				} else {
					System.out.println("Failed To Delete");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

		return null;
	}

	@Override
	public List<Contact> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(Integer cid) {
		

		return null;
	}

	@Override
	public List<Contact> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
