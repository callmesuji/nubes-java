package com.nubes.internship.day_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public enum DatabaseUtil {
	obj;

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ContactEmployee?autoReconnect=true&useSSL=false", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(Connection con, Statement st) {
		try {
			if (st != null && con != null) {
				st.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null && con != null) {
				st.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, PreparedStatement pst) {
		try {
			if (pst != null && con != null) {
				pst.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
