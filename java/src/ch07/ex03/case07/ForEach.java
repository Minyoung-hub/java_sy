package ch07.ex03.case07;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++) list.add(i);
		
		list.forEach((x)->{
			System.out.print(x + " ");
		});
	}
}