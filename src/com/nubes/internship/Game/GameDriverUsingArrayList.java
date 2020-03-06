package com.nubes.internship.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDriverUsingArrayList {
	public static void main(String[] args) {
		List<Game> list = new ArrayList<Game>();
		Game g1 = new Car();
		Game g2 = new Car();
		Game g3 = new Car();
		Game g4 = new Bike();
		Game g5 = new Bike();
		Game g6 = new Bike();
		Game g7 = new Bike();
		Game g8 = new Bicycle();
		Game g9 = new Bicycle();
		Game g10 = new Bicycle();
		list.add(g1);
		list.add(g2);
		list.add(g3);
		list.add(g4);
		list.add(g5);
		list.add(g6);
		list.add(g7);
		list.add(g8);
		list.add(g9);
		list.add(g10);
		int num = (int) (Math.ceil(Math.random() * 3));
		System.out.println("1.Car   2.Bike   3.Bicycle");
		System.out.println("---------------------------------");
		System.out.println("Random Number Generated Is : " + num);
		System.out.println("---------------------------------");// System.out.println();
		for (Game g : list) {
			if (num == 1) {
				if (g instanceof Car) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("---------");
				}

			} else if (num == 2) {
				if (g instanceof Bike) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("---------");
				}

			} else if (num == 3) {
				if (g instanceof Bicycle) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("---------");
				}

			}

		}
	}

}
