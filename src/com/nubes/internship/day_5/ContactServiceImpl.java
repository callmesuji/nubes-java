package com.nubes.internship.day_5;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
	Scanner sc = new Scanner(System.in);

	private List<Contact> contacts = new ArrayList<>();

	@Override
	public Contact addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact is added with the id:" + contact.getCid());
		return contact;
	}

	@Override
	public List<Contact> getContacts() {

		return contacts;
	}

	@Override
	public String deleteContact(Integer id) {

		for (Contact c : contacts) {
			if (c.getCid() == 0) {
				System.out.println("No Contact To Delete");
			} else if (id.equals(c.getCid())) {
				contacts.remove(c);
				return "Contact Deleted Successfully";
			}
		}
		return "no contact found to Delete";
	}

	@Override
	public Contact updateContact(Contact contact) {

		System.out.println("Enter the name :");
		String name = sc.nextLine();
		contact.setName(name);
		System.out.println("Enter the mobile:");
		String mobile = sc.nextLine();
		contact.setMobile(mobile);
		System.out.println("Enter the city name:");
		String city = sc.nextLine();
		contact.setCity(city);
		return contact;
	}

	@Override
	public List<Contact> search(String name) {

		List<Contact> list = new ArrayList<Contact>();
		for (Contact c : contacts) {
			if (name.equalsIgnoreCase((c.getName()))) {
				list.add(c);
			}
		}
		return list;
	}

	@Override
	public Contact getContact(Integer cid) {

		for (Contact c : contacts) {
			if (cid != c.getCid()) {
				System.out.println("No Contact Found");
			}
			if (cid.equals(c.getCid()))
				return c;
		}
		return null;
	}

	@Override
	public List<Contact> sortByName() {
		if (contacts.size() == 0) {
			System.out.println("No Contacts To Sort Please Add minimum 2 Contacts To Sort");
		} else if (contacts.size() == 1) {
			System.out.println("Please Add One More Contact To Sort");
		} else {
			Collections.sort(contacts, new SortByName());
			System.out.println("Sorted Successfully");
			return contacts;
		}
		return null;
	}
}
