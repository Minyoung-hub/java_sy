package ch07.ex02.home;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<Stationery> bag = new ArrayList<>();
		bag.add(new Eraser());
		bag.add(new Pencil());

		for(Stationery stationery: bag) {
			if(stationery instanceof Eraser)
				((Eraser)stationery).erase();
			if(stationery instanceof Pencil)
				((Pencil)stationery).write();
		}
	}
}