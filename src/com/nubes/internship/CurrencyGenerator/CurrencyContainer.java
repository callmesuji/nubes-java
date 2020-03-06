package com.nubes.internship.CurrencyGenerator;

import java.util.Scanner;

public class CurrencyContainer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Country Name[ IND   USA    UK ]");
		String name = sc.nextLine();
		sc.close();
		Currency obj = getcurrency(name);
		System.out.println(obj.getcurrency());
	}

	private static Currency getcurrency(String name) {
		if (name.equalsIgnoreCase("ind"))
			return new IND();
		else if (name.equalsIgnoreCase("usa"))
			return new USA();
		else if (name.equalsIgnoreCase("uk"))
			return new UK();
		return null;
	}
}
