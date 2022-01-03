package ch08.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03TryCatchFinally {
	public static void main(String[] args) {
		PrintWriter out = null;
		//앱 바깥으로 데이터를 출력하는 클래스
		int[] list = {1, 2, 3};
		
		//엑셉션이 발생할 가능성이 있는 코드를  트라이 안에 넣어줌.
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i=0; i<list.length; i++)
				out.println("list[" + i + "]" + list[i]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 exception.");
		}catch(IOException e) {
			System.out.println("파일 Exception.");
		}finally {
			if(out!=null)out.close();
			//성공 실패와 관련없이 늘 해야하는 작업.
		}
		System.out.println("End.");
	}
}