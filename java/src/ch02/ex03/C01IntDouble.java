package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1 ;
		double d = 0.0 ;
		
		d = i ; 
		// promotion -> 캐스팅 연산자를 쓰지 않고 자동으로 형변환 되는 것을 뜻함.
		//(작은 크기의 값이 큰 크기의 값으로 변환될 때)
		// i는 4byte d는 8byte
		System.out.println("d : " + d);
		d = (double)i; 
		// casting 연산자를 썼으므로 casting됐다고 한다. 
		// (이것도 작은 크기가 큰 크기로 변환되지만 캐스팅 연산자를 썼기 때문에 캐스팅 했다고 한다.
		System.out.println("d : " + d);
		
		i = (int)d ;
		System.out.println("i : " + i);
		System.out.println("d : " + d);
		// 캐스팅 연산자는 피 연산자를 건드리지 않고 단순히 변환된 타입에 맞춰서 읽고 그 읽어낸 값을 피연산자로 생각하고 변환한다.
		// 변환 후에 그 값을 출력하고 읽어낸 값은 지운다.
		
		
	}

}
