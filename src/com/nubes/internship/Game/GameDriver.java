
package com.nubes.internship.Game;

public class GameDriver {
	public static void main(String[] args) {
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

		int num = (int) (Math.ceil(Math.random() * 3));

		Game[] arr = { g1, g2, g3, g4, g5, g6, g7, g8, g9, g10 };
		System.out.println("Random Generated Number Is :" + num);

		for (Game g : arr) {
			if (num == 1) {
				if (g instanceof Car) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("--------");
				}
			} else if (num == 2) {
				if (g instanceof Bike) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("--------");
				}
			} else if (num == 3) {
				if (g instanceof Bicycle) {
					System.out.println(g.start());
					System.out.println(g.play());
					System.out.println(g.stop());
					System.out.println("--------");
				}
			}
		}

	}

}
