package com.nubes.internship.Instrument;

public class Flute implements Instrument {

	@Override
	public String play() {
		return "Flute is playing toot toot toot toot";
	}

	@Override
	public String toString() {
		return "" + play() + "]";
	}

}
