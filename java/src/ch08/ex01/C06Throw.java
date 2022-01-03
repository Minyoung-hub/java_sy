package ch08.ex01;

public class C06Throw {
	public void first() {
		try {
			second();
		}catch(Exception e) {
			System.out.println("first(): AtithmeticException.");
		}
	}
	public void second() throws Exception{
		third();
		
	}
	
	public void third() throws Exception{
		int i = 3/0;
	}
	
	public static void main(String[] args) {
		C06Throw t = new C06Throw();
		t.first();
	}
}
