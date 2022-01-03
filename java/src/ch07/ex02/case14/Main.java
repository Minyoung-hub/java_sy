package ch07.ex02.case14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Dog> house1 = new ArrayList<>();
		List<Dog> house2 = new ArrayList<>();
		List<List<Dog>> houses = new ArrayList<>();
		
		for(int i=0; i<3; i++) house1.add(new Dog("개" + i));
		for(int i=0; i<3; i++) house2.add(new Dog("강아지" + i));
		System.out.println(house1);
		System.out.println(house2);
		
		houses.add(house1);
		houses.add(house2);
		System.out.println(houses);
		
		for(List<Dog> dogs:houses)
			for(Dog dog:dogs) dog.eat();
	}
}