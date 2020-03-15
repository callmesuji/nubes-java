package com.nubes.internship.CrudOperationsUsingDatabaseConnection;

import java.sql.*;   
import java.util.Scanner;

public class EmployeeStat {
	private static final String ADD_EMP = "insert into employee(name,city,mobile,salary) values(?,?,?,?)"; // 1
	private static final String EMP_INFO = "select name,city,mobile,salary from employee";// 2
	private static final String DEL_EMP_NAME = "delete from employee where name = ?"; // 3
	private static final String DEL_EMP_SALARY = "delete from employee where salary = ?"; // 4
	private static final String UPD_EMP_NAME = "update employee set name = ?,city = ?,mobile = ?,salary = ? where name = ?"; // 5
	private static final String UPD_EMP_SALARY = "update employee set name = ?,city =?,mobile = ?,salary = ? where salary = ?"; // 6

//    ADDING    EMPLOYEES                                                 		    1

	public void AddEmployee() {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pst = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			System.out.println("<<=----**----=>> YOU  CHOOSE  TO  ADD  EMPLOYEES! <<=----**----=>>");
			System.out.println("Enter Name :");
			String name = sc.nextLine().toUpperCase();
			System.out.println("Enter City :");
			String city = sc.nextLine().toUpperCase();
			System.out.println("Enter Mobile Number :");
			Long mobile = sc.nextLong();
			System.out.println("Enter Salary :");
			Double salary = sc.nextDouble();
			Employee emp1 = new Employee(name.toUpperCase(), city.toUpperCase(), mobile, salary);

			pst = con.prepareStatement(ADD_EMP);
			pst.setString(1, emp1.getName().toUpperCase());
			pst.setString(2, emp1.getCity().toUpperCase());
			pst.setLong(3, emp1.getMobile());
			pst.setDouble(4, emp1.getSalary());
			int i = pst.executeUpdate();
			if (i != 0) {
				System.out.println("Successfully Added");
				System.out.println();
			} else {
				System.out.println("Failed To Add");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

	}

//	DISPLAYING    EMLOYEES															2
	public void ShowEmployee() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			st = con.createStatement();
			rs = st.executeQuery(EMP_INFO);
			System.out.println("<<=----**----=>> YOU   CHOOSE   TO   VIEW   EMPLOYEES! <<=----**----=>>");
			System.out.println();
			System.out.println(
					" " + "  NAME      " + "   CITY        " + "             MOBILE NO    " + "           SALARY   ");
			System.out.println("-----------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.println(
						" " + rs.getString("name").toUpperCase() + "	   ||   " + rs.getString("city").toUpperCase()
								+ "	  ||	" + rs.getString("mobile") + "	  ||   " + rs.getDouble("salary"));
			}
			System.out.println();
		} catch (SQLException e) {
			System.out.println("no");
			e.printStackTrace();
		} finally {
			dbUtil.close(con, st, rs);
		}
	}

//   	DELETE  EMPLOYEES  USING    NAME											3
	public void DeleteEmployee(String ename) {
		Connection con = null;
		PreparedStatement pst = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			System.out.println("<<=----**----=>> YOU CHOOSE TO DELETE EMPLOYEES BY NAME! <<=----**----=>>");
			System.out.println();
			pst = con.prepareStatement(DEL_EMP_NAME);
			pst.setString(1, ename.toUpperCase());
			int j = pst.executeUpdate();
			if (j != 0) { //==1
				System.out.println("Successfully Deleted");
				System.out.println();
			} else {
				System.out.println("Not Deleted");
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}
	}

//      DELETE  EMLOYEES  USING    SALARY											4
	public void DeleteEmployee(Double salary) {
		Connection con = null;
		PreparedStatement pst = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(DEL_EMP_SALARY);
			pst.setDouble(1, salary);
			int j = pst.executeUpdate();
			if (j != 0) {
				System.out.println("Successfully Deleted");
			} else {
				System.out.println("Not Deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}
	}

//	UPDATIG   EMPLOYEES  USING  NAME 															5
	public void UpdateEmployee(String name) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement pst = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(UPD_EMP_NAME);
			System.out.println("Enter new name");
			String uname = sc.nextLine();
			pst.setString(1, uname.toUpperCase());
			System.out.println("Enter new City ");
			String ucity = sc.nextLine();
			pst.setString(2, ucity.toUpperCase());
			System.out.println("Enter new Mobile ");
			Long umobile = sc.nextLong();
			pst.setLong(3, umobile);
			System.out.println("Enter new Salary");
			Double usalary = sc.nextDouble();
			pst.setDouble(4, usalary);
			pst.setString(5, name);
			int k = pst.executeUpdate();
			if (k != 0) {
				System.out.println("Updated Successfully");
			} else {
				System.out.println("Not Updated");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);

		}

	}

//	UPDATIG   EMPLOYEES  USING  SALARY													6

	public void UpdateEmployee(Double sal) {
		Scanner sc = new Scanner(System.in);

		Connection con = null;
		PreparedStatement pst = null;
		DataBaseUtil dbUtil = DataBaseUtil.obj;
		try {
			con = dbUtil.getconnection();
			pst = con.prepareStatement(UPD_EMP_SALARY);
			System.out.println("Enter Name To Update");
			String uname = sc.nextLine();
			pst.setString(1, uname.toUpperCase());
			System.out.println("Enter new City ");
			String ucity = sc.nextLine();
			pst.setString(2, ucity.toUpperCase());
			System.out.println("Enter new Mobile ");
			Long umobile = sc.nextLong();
			pst.setLong(3, umobile);
			System.out.println("Enter new Salary ");
			Double usalary = sc.nextDouble();
			pst.setDouble(4, usalary);
			pst.setDouble(5, sal);
			int k = pst.executeUpdate();
			if (k != 0) {
				System.out.println("Updated Successfully");
			} else {
				System.out.println("Not Updated");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtil.close(con, pst);
		}

	}
}