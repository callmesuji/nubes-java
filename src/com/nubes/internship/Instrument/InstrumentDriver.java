package com.nubes.internship.Instrument;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstrumentDriver {

	public static void main(String[] args) {
		List<Instrument> list = new ArrayList<>();
		Instrument p1 = new Piano();
		Instrument p2 = new Piano();
		Instrument p3 = new Piano();
		Instrument f1 = new Flute();
		Instrument f2 = new Flute();
		Instrument f3 = new Flute();
		Instrument f4 = new Flute();
		Instrument g1 = new Guitar();
		Instrument g2 = new Guitar();
		Instrument g3 = new Guitar();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		list.add(g1);
		list.add(g2);
		list.add(g3);
		// Instrument[] arr = { p1, p2, p3, f1, f2, f3, f4, g1, g2, g3 };
//		for (Instrument i : list) {
//			System.out.println(i.play());
//		}
//		Iterator<Instrument> itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		System.out.println(list);
	}

}
