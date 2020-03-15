package com.nubes.internship.ProductDatabase;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		ProductMethods productmethods = new ProductMethodsImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------- PRODUCT BOOK--------------------------");
			System.out.println("1. Add  2.View  3.Delete By ID  4.Update By Id 5.Search By ID  6.Exit");
			System.out.println("----------------- PRODUCT BOOK--------------------------");
			if (sc.hasNextInt()) {
				int ch = sc.nextInt();
				sc.nextLine();
				switch (ch) {
				case 1:
					productmethods.addProducts();
					
					
					while (true) {
						System.out.println("DO YOU WANT TO CONTINUE (y | n)");
						String s = sc.nextLine();
						if (s == "n" || s == "n") {
							System.out.println("THANK YOU!");
							System.exit(0);
						} else {
							break;
						}
					}
					
					
					break;
				case 2:
					productmethods.showProducts();
					
					
					while (true) {
						System.out.println("DO YOU WANT TO CONTINUE (y | n)");
						String s = sc.next();
						if (s.length() > 1) {
							System.out.println("ENTER VALID INPUT");
						} else if (s.equals("n") || s.equals("N")) {
							System.out.println("THANK YOU!");
							System.exit(0);
						} else if (s.equals("y") || s.equals("Y")) {
							break;
						} else {
							System.out.println("PLEASE ENTER VALID INPUT");
							System.out.println("---------***--------------");
						}
					}
					
					
					break;
				case 3:
					System.out.println(" Enter ID To Delete PRODUCT :");
					if(sc.hasNextInt()) {
						int pid = sc.nextInt();
						productmethods.deleteProducts(pid);						
					}else {
						System.out.println("ENTER ONLY INTEGER");
						sc.next();
						break;
					}
					
					
					while (true) {
						System.out.println("DO YOU WANT TO CONTINUE (y | n)");
						char c = sc.next().charAt(0);
						if (c == 'n' || c == 'N') {
							System.out.println("THANK YOU!");
							System.exit(0);
						} else {
							break;
						}
					}
					
					
					break;
				case 4:
					System.out.println(" Enter The ID To UPDATE PRODUCT :");
					if(sc.hasNextInt()) {
					int u_id = sc.nextInt();
					productmethods.updateProducts(u_id);
					}else {
						System.out.println("ENTER ONLY INTEGER");
						sc.next();
						break;
					}
					
					while (true) {
						System.out.println("DO YOU WANT TO CONTINUE (y | n)");
						char c = sc.next().charAt(0);
						if (c == 'n' || c == 'N') {
							System.out.println("THANK YOU!");
							System.exit(0);
						} else {
							break;
						}
					}
					
					
					break;
				case 5:
					System.out.println("--- ENTER ID TO SEARCH PRODUCT ---");
					if(sc.hasNextInt()) {
					int s_id = sc.nextInt();
					productmethods.searchProducts(s_id);
					}else {
						System.out.println("ENTER ONLY INTEGER");
						sc.next();
						break;
					}
					
					while (true) {
						System.out.println("DO YOU WANT TO CONTINUE (y | n)");
						char c = sc.next().charAt(0);
						if (c == 'n' || c == 'N') {
							System.out.println("THANK YOU!");
							System.exit(0);
						} else {
							break;
						}
					}
					
					
					break;
				case 6:
					System.out.println("Exited Successfully");
					sc.close();
					System.exit(0);
					break;

				default:
					System.out.println("PLEASE ENTER VALID INPUT");
					sc.close();
					break;
				}
			} else {
				System.out.println("PLEASE ENTER ONLY INTEGERS!");
				sc.next();
				continue;
			}
		}
	}

}
