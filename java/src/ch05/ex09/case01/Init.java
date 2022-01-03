package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static { // static 초기화 블럭
		s = 1;
		System.out.println("static{}");
	}
	
	{ // instance 초기화 블럭
		i = 1; s = 1;
		System.out.println("{}");
	}
	
	public Init() {
		i = 1; s = 1;
		System.out.println("Init{}");
	}
	
	public Init(String s) {
		System.out.println("Init(" + s + ")");
	}
}
