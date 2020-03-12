package com.nubes.internship.CrudOperationsUsingDatabaseConnection;

import java.util.Scanner;

public class CrudOperationsManager {
	public static void main(String[] args) {
		EmployeeStat obj = new EmployeeStat();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("----------------- Contact BOOK--------------------------");
			System.out.println(
					"1. Add  2.View  3.Delete By Name 4.Delete By Salary  5.Update By Name  6.Update By Salary  7.Exit");
			System.out.println("----------------- Contact BOOK--------------------------");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				obj.AddEmployee();
				break;
			case 2:
				obj.ShowEmployee();
				break;
			case 3:
				System.out.println(" Enter Name To Delete Record :");
				String name = sc.nextLine();
				obj.DeleteEmployee(name.toUpperCase());
				break;
			case 4:
				System.out.println(" Enter Salary To Delete Record :");
				Double salary = sc.nextDouble();
				obj.DeleteEmployee(salary);
				break;
			case 5:
				System.out.println("--- ENTER NAME TO UPDATE THE EMPLOYEE RECORD ---");
				String uname = sc.nextLine();
				obj.UpdateEmployee(uname.toUpperCase());
				break;
			case 6:
				System.out.println("--- ENTER SALARY TO UPDATE THE EMPLOYEE RECORD ---");
				Double usalary = sc.nextDouble();
				obj.UpdateEmployee(usalary);
				break;
			case 7:
				System.out.println("Exited Successfully");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Input");
				sc.close();
				break;
			}
		}
	}
}
