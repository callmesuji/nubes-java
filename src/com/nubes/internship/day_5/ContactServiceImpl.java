package com.nubes.internship.day_5;

import java.util.ArrayList;

import java.util.List;

public class ContactServiceImpl implements ContactService {

	private List<Contact> contacts = new ArrayList<>();

	@Override
	public Contact addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact is added with the id:" + contact.getCid());
		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		if (contacts.size() == 0) {
			System.out.println("No contacts are added yet. please add contacts");
		}
		return contacts;
	}

	@Override
	public String deleteContact(Integer cid) {
		if(cid == 0) {
			System.out.println("no contacts to delete ");
		}
		
		if (cid != 0) {
			contacts.remove(cid);
		}
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
