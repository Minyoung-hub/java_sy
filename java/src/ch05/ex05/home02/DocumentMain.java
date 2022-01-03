package ch05.ex05.home02;

import java.util.Scanner;

public class DocumentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Copier copier = new Copier();
		Document doc = new Document();
		
		doc.write("태백산맥", 
				"빨치산도 대한민국의 역사이다.", 
				1983, 9, 12, 3);
	}
}
