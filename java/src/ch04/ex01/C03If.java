package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 20;
		
		if(hour < 12) 
			System.out.println("Good Morning");
		else if(hour < 18)
			System.out.println("Good Afternoon");
		else if(hour < 21)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		
		hour = 10;
		String bow = "";
		if(hour < 12) bow = "Good Morning";
		else if(hour < 18) bow = "Good Afternoon";
		else if(hour < 21) bow = "Good Evening";
		else bow = "Good Night";
		System.out.println(bow);
		// 블록 안에 문장이 하나인 경우 위 처럼 쓰면 더 효율적인 코드가 된다.
	}	
}
