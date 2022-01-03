package ch03.ex07;

import java.util.Scanner;

public class C02StrCompare {
	public static void main(String[] args) {
		System.out.println('a' == 'a');
		System.out.println("a" == "a");
		System.out.println("a" == "b");
		
		String s = "a";
		System.out.println(s == "a");
		
		s = new String("a");
		System.out.println(s == "a"); // 어떨때는 true 어떨때는 false를 리턴한다.
		System.out.println(s.equals("a"));
		// 문자열끼리 비교할 때는 equals()함수 쓴다.
	}
}
