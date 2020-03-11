package com.nubes.internship.DataBase;

public class Employee {
	private String name;
	private String city;
	private long mobile;
	private double salary;
	private Integer id;

	public Employee() {
	}

	public Employee(String name, String city, long mobile, double salary) {
		if (this.id == null) {
			this.id = IDGenerator.getId();
		}
		this.name = name;
		this.city = city;
		this.mobile = mobile;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
