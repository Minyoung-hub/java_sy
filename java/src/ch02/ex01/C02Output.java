package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); //괄호 안에 있는 값을 parameter(매개변수)라고 한다.
		//Ctrl+S 누르면 저장됨(습관들이자) -> byte code가 생성됨
		System.out.println(score); //println이라는 메소드를 콜한다. println은 System 안에 out안에 있다. println 과 System은 직접적이지 않고, out과 직접적이다.
		System.out.println(100+1);
		System.out.println((int)(Math.random()*100)); //파라미터로 다른메소드를 콜할 수 있다.
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n"); //\n이 줄바꿈이 아니라 print메소드가 \n을 줄바꿈으로 인식한다.
		
		System.out.printf("%b, %c, %d, %.1f, %s \n", true, 'a', 10, 10.15, "hello"); //첫번째 파라미터에 String타입의 값을 써준다. 
		/* %b->boolean타입의 값만 호출, %c->char타입의 값만 호출, %d->정수형 호출, 
		 * %f->실수형 호출 (실수형은 소수점 몇자리까지 사용할지 설정해주는게 중요) 반올림됨
		 * %s->string타입의 값만 호출, args=arguments
		 * char타입은 문자하나만 가능 문자여러개 쓰려면 String 써야함
		 * 예를들어 char타입을 쓰면 'ag'라고 했을 때 에러뜸
		 */
		System.out.printf("%5b, %-5c, %d, %5.2f, %s \n", true, 'a', 10, 10.15, "hello");
		//-를 넣으면 왼쪽 정렬된다.
		
		String name = "권민영";
		int age = 23;
		System.out.printf("%s은 %d살 입니다.", name, age);
		System.out.println();
		System.out.println(name+"은 "+age+"살 입니다.");
	}

}
