package com.nubes.internship.CurrencyGenerator;

/*
Create interface Currency with getCurrency method.Create classes India,USA,UK by implementing the
Currency interface.Createclass CurrencyContainer,Currency getCurrency(String country)
(Method return type Currency).getCurrency(string country) Based on the country name it must return
particular country object. If country is not valid it should throw IllegalArgumentException.
Create class CurrencyClient with main method and prompt user to enter country name. By using country name,
get Currency object by invoking the CurrencyContainer getCurrency( ) without creating object of CurrencyContainer
 and display the currency name by invoking getCurrency( ) Currency interface.*/

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
