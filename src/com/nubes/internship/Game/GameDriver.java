
package com.nubes.internship.Game;

/*Create an Interface Game which is having start,play,and stop methods.Create classes Car,Bike,Bicycle 
*by implementing Game interface.Create an array of 10 Games.Generate 10 random numbers in the range 1 to 3.
* If random number is 1–add Car,2-add Bike,3-add Bicyle objects to the array.Process the elements from the 
* array and display details of each object.
Hint:to generate the random number use Math class api.*/

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
		System.out.println("1.Car   2.Bike   3.Bicycle");
		System.out.println("---------------------------------");
		System.out.println("Random Number Generated Is : " + num);
		System.out.println("---------------------------------");
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
