package com.nubes.internship.ipl;

public class Player {
	private String name;
	private String role;
	private String label;
	private double price;

	public Player() {
	}

	public Player(String name, String role, String label, double price) {
		super();
		this.name = name;
		this.role = role;
		this.label = label;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
