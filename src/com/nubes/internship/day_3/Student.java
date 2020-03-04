package com.nubes.internship.day_3;

/*Write a program to create class Student with id, name, address , display(),Student(id,name). 
Create several objects and initialize them. Display the details of each student and finally display the number of 
student objects that are created.*/
public class Student {
	int id;
	String name;
	String address;
	static int noOfObjects = 0;
	{
		noOfObjects++;
	}

	public void display() {
		System.out.println("Id      : " + id);
		System.out.println("Name    : " + name);
		System.out.println("Address : " + address);
		System.out.println("-------------------------");

	}

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1001, "Rajesh", "Anantapur,  Pincode: 515001");
		Student s2 = new Student(1002, "Suresh", "Vijayawada, Pincode: 515002");
		Student s3 = new Student(1003, "Mahesh", "Raichur, Pincode: 515003");
		Student s4 = new Student(1004, "Veresh", "Manipur, Pincode: 515004");
		Student s5 = new Student(1005, "sujith", "Udaipur, Pincode: 515005");
		System.out.println("The No Of Objects Created Is : " + Student.noOfObjects); // 5
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();

	}

}
