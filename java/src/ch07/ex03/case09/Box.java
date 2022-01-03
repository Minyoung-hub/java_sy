package ch07.ex03.case09;

public class Box {
	public <T> T getLastVal(T[] array) {
		return array[array.length-1];
	}
}