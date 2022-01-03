package ch08.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryWithResource {
	public static void main(String[] args) {
		int[] list = {1, 2, 3};
		try(PrintWriter out = 
				new PrintWriter(new FileWriter("c:/DEV/1.txt"));
			PrintWriter out2 = 
					new PrintWriter(new FileWriter("c:/DEV/2.txt"))) {
			for(int i=0; i<list.length; i++) {
				out.println("list[" + i + "]: " + list[i]);
				out2.println("list[" + i + "]: " + list[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 exception.");
		}catch(IOException e) {
			System.err.println("파일 Exception.");
		}
		System.out.println("End");
	}
}