package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		
		// byte c = a + b ;
		byte c = (byte)(a + b);
		System.out.printf("c : %d\n", c);
		// c = (byte)(c + 1);
		
		c++; 
		/* 타입의 변환없이 데이터 값 자체를 변환시켜준다. 위의 식 보다 성능에 도움 됨.
		 * 그러므로 1씩 증가시키거나 감소시킬때는 그냥 ++ 연산자를 쓰자. */
		System.out.printf("c : %d\n", c);
		
		double d = a / b;
		System.out.printf("d : %.1f\n", d);
		/* Overflow 발생. 0.5가 Overflow되서 버려졌다. 
		 * 나누기를 실행하는 과정에서 발생한다.
		 * 오른쪽에서 먼저 1.0이 만들어진 후 d에 값이 할당되다. */
		
		d = (double) a / b;
		System.out.printf("d : %.1f\n", d);
		/* Overflow 발생이 버그라고 생각한다면 이렇게 할 수도 있다.
		 * a를 캐스팅하고 double형인 a와 int형인 b를 연산해서 promotion될 수 있게 한다. */
		
		d = 1.0 * a / b ;
		System.out.printf("d : %.1f\n", d);
		// 1.0*a = 3.0으로 promotion된다. 3.0/b도 b가 promotion되므로 1.5가 출력된다.
		
		//나쁜예
		d = (double)(a / b) ;
		System.out.printf("d : %.1f\n", d);
		
		//나쁜예2
		d = a / b * 1.0;
		System.out.printf("d : %.1f\n", d);
		// 순서대로 계산하기 때문에 1.0을 앞에 곱해줘서 promotion될 수 있도록 해야함.
	}

}
