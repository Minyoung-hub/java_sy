package ch02.ex02.string;

public class C01 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum : %d\n", sum);
	
		String concat = "" + a + b + c ; 
		/* 좌우의 데이터타입이 같아야 작동할 수 있는데 왼쪽은 string이고 오른쪽은 int라서 컴파일에러가 난다. 
		 * 그렇기 때문에 ""을 넣어줘서 자동으로 int 타입인 1, 2, 3를 string 타입으로 자동 형변환 하게 한다.
		 * "" + 1 -> "1", "1" + 2 -> "1" + "2" -> "12", "12" + 3 -> "12" + "3" -> "123"
		 */
		System.out.println("concat: "+ concat);
		
		String a2 = ""+ a ;
		System.out.println("a2: "+ a2);
		
		concat = a + b + "" + c;
		System.out.println("concat: "+ concat);
		// 1 + 2 -> 3, 3 + "" -> "3", "3" + 3 -> "3" + "3" -> "33"
		
		String dialog = "Jhon said, " + "\"hello\""; // 특수문자 앞에 역슬래쉬 붙이면 일반문자가 된다. (일반문자와 특수문자간의 전환)
		System.out.println(dialog);
	}

}
