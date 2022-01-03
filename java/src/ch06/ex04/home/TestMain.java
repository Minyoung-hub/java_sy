package ch06.ex04.home;

public class TestMain {
	public static void main(String[] args) {
		Actor actor = new Actor();
		Singer singer = new Singer();
		
		singer.perform();
		actor.perform();
	}
}