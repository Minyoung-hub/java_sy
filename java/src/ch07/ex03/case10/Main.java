package ch07.ex03.case10;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		// Cabinet<C> cabinet3 = new Cabinet<>();
		
		B[] list1 = {new B(), new B()};
		C[] list2 = {new C(), new C()};
		D[] list3 = {new D(), new D()};
		
		// cabinet1.getFinal(list1);
		cabinet1.getFinal(list2);
		cabinet1.getFinal(list3);
	}
}