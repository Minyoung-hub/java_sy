package ch05.ex05.home02;

import java.time.LocalDate;

public class Document {
	public void title(String name) {
		System.out.println("제   목 : " + name);
	}
	public void content(String sentence) {
		System.out.println("내   용 : " + sentence);
	}
	public void creationDate(int year, int month, int day) {
		System.out.println("작성일 : " + LocalDate.of(year, month, day));
	}
	public void page(int number) {
		System.out.print("페이지 : " + number);
	}

	public void write(String name, String sentence, 
			int year, int month, int day, int number) {
		this.title(name);
		this.content(sentence);
		this.creationDate(year, month, day);
		this.page(number);
	}
}