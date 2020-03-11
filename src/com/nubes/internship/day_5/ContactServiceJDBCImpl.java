package com.nubes.internship.day_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactServiceJDBCImpl implements ContactService {
	private static final String Add_Contact = "insert into contact(name,mobile,city,id) values(?,?,?,?))";
	private static final String Delete_Contact = "create table contact(e_name varchar(200),e_mobno long,e_city varchar(200),e_id long)";

	@Override
	public Contact addContact(Contact contact) {
		List<Contact> contacts = new ArrayList<>();
		Connection con = null;
		PreparedStatement pst = null;
		DatabaseUtil dbUtil = DatabaseUtil.obj;

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
		}

		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContact(Integer cid) {
		// TODO Auto-generated method stub
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
