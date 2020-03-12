package com.nubes.internship.ProductDatabase;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		ProductMethods pm = new ProductMethodsImpl();

		Scanner sc = new Scanner(System.in);
		// Product obj = new Product();

		while (true) {
			System.out.println("----------------- PRODUCT BOOK--------------------------");
			System.out.println("1. Add  2.View  3.Delete By ID  4.Update By Id 5.Search By ID  6.Exit");
			System.out.println("----------------- PRODUCT BOOK--------------------------");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				pm.addProducts();
				break;
			case 2:
				pm.showProducts();
				break;
			case 3:
				System.out.println(" Enter ID To Delete PRODUCT :");
				int pid = sc.nextInt();
				pm.deleteProducts(pid);
				break;
			case 4:
				System.out.println(" Enter The ID To UPDATE PRODUCT :");
				int u_id = sc.nextInt();
				pm.updateProducts(u_id);
				break;

			case 5:
				System.out.println("--- ENTER ID TO SEARCH PRODUCT ---");
				int s_id = sc.nextInt();
				pm.searchProducts(s_id);
				break;
			case 6:
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
