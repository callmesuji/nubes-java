package com.nubes.internship.day_5;

import java.util.List;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		ContactService service = new ContactServiceImpl(); // new ContactServiceJDBCImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------- Contact BOOK--------------------------");
			System.out.println("1. Add 2.View 3.Delete 4.Update 5.Search 6.Sort 7.exit");
			System.out.println("----------------- Contact BOOK--------------------------");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter the name :");
				String name = sc.nextLine();
				System.out.println("Enter the mobile:");
				String mobile = sc.nextLine();
				System.out.println("Enter the city name:");
				String city = sc.nextLine();
				Contact contact = new Contact(name, mobile, city);
				service.addContact(contact);
				break;
			case 2:
				List<Contact> list = service.getContacts();
				for (Contact c : list) {
					System.out.println(c.getCid() + " " + c.getName() + " " + c.getMobile() + " " + c.getCity());
				}
				break;
			case 3:
				System.out.println("Enter The Id to Delete Contact :");
				Integer cid = sc.nextInt();
				if (cid != 0) {
					//list.remove(c);

				}

			case 7:
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please enter choice 1-7 only");
			}
		}
	}
}
