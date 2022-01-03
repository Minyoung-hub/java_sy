package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("문자열을 입력해주세요 : "); // UX를 고려해서 프로그램을 짜면 좋을 것 같아용
		String s = sc.nextLine();
		System.out.printf("'%s'을(를) 입력하였습니다.\n",s);
		
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt(); sc.nextLine(); 
		// nextInt는 숫자만 받기 때문에 내가 숫자를 다 누르고 엔터를 눌렀던 것이 밑에있는 nextLine이 받았기 때문에 버그가 뜨는 것이었다.
		// 그래서 엔터값을 청소하기 위해 sc.nextLine();를 추가로 코딩한다.
		System.out.printf("'%d'을(를) 입력하였습니다.\n",num);
		
		System.out.print("문자열을 입력해주세요 : ");
		s = sc.nextLine();
		System.out.printf("'%s'을(를) 입력하였습니다.\n",s);
		
		System.out.print("문자를 입력해주세요 : ");
		char c = sc.nextLine().charAt(0); // 내가 입력한 문자열중 가장 첫번째 문자만 c에 넣기 위해서 charAt(0)를 추가로 코딩한다.
		System.out.printf("'%c'을(를) 입력하였습니다.\n",c);
	}

}
