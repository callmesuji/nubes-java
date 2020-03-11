package com.nubes.internship.day_5;

import java.util.List;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		ContactService service = new ContactServiceJDBCImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------- Contact BOOK--------------------------");
			System.out.println("1. Add  2.View  3.Delete  4.Update  5.sort  6.Search  By Id 7.Search By Name  8.exit");
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
				if (service.getContacts().isEmpty()) {
					System.out.println("No Contacts To View Add Contacts");
				} else {
					List<Contact> list = service.getContacts();
					for (Contact c : list) {
						System.out.println(c.getCid() + " " + c.getName() + " " + c.getMobile() + " " + c.getCity());
					}
				}
				break;
			case 3:
				if (service.getContacts().isEmpty()) {
					System.out.println("No Contacts To Delete Add Contacts");
				} else {
					System.out.println("Enter The Id to Delete Contact :");
					Integer id = sc.nextInt();
					System.out.println(service.deleteContact(id));
				}
				break;

			case 4:

				if (service.getContacts().isEmpty()) {
					System.out.println("No Contact To Update Add Contacts");
				} else {
					System.out.println("Enter The Id To Update Contact :");
					Integer u_id = sc.nextInt();
					List<Contact> list1 = service.getContacts();
					for (Contact c1 : list1) {
						if (c1.getCid().equals(u_id)) {
							System.out.println(service.updateContact(c1));
							break;
						}
					}
				}
				break;
			case 5:
				service.sortByName();
				break;
			case 6:
				if (service.getContacts().isEmpty()) {
					System.out.println("No Contacts To Search By ID Add Contacts");
				} else {

					System.out.println("Enter The Id To Get Contact :");
					Integer g_id = sc.nextInt();
					if (g_id < 999) {
						System.out.println("Enter Id above 1000");
					}
					List<Contact> g_list = service.getContacts();
					for (Contact c1 : g_list) {
						if (c1.equals(service.getContact(g_id))) {
							System.out.println(c1);
							break;
						}
					}
				}

				break;

			case 7:
				if (service.getContacts().isEmpty()) {
					System.out.println("No Contacts To Search By Name Add Contacts");
				} else {
					System.out.println("Enter The Name To Get Contact : ");
					String s_name = sc.nextLine();
					List<Contact> name_list = service.search(s_name);
					for (Contact name_contact : name_list) {
						System.out.println(name_contact);
					}
				}

				break;
			case 8:
				System.out.println("Exited Successfully");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter choice 1-7 only");
				break;
			}
		}
	}
}
