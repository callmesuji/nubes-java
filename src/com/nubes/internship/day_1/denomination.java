package com.nubes.internship.day_1;

/*Write a program to accept a four digit number from the user and display its denomination.*/
/*Example: 5698
Output: 5*1000 =5000
6*100 =600
9*10 =90
8*1 =8*/
import java.util.Scanner;

public class denomination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int a, b, c;
		while (num != 0) {
			if (num >= 1000) {
				a = num / 1000;
				System.out.println(a + "*" + 1000 + "=" + (a * 1000));
				break;

			} else if (num >= 100) {
				b = num / 100;
				System.out.println(b + "*" + 100 + "=" + (b * 100));
				break;
			} else if (num >= 10) {
				c = num / 10;
				System.out.println(c + "*" + 10 + "=" + (c * 10));
				break;
			}

		}
		sc.close();
	}

}
