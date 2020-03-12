package com.nubes.internship.ProductDatabase;

import java.sql.*;

public enum DatabaseUtil {
	obj;

	public Connection getconnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product?autoReconnect=true&useSSL=false",
					"root", "root");
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
