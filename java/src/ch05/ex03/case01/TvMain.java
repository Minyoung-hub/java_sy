package ch05.ex03.case01;

public class TvMain {
	public static void main(String[] args) {
		Tv myTv = null;
		myTv = new Tv(); // 메소드 쓸때마다 괄호 붙여야된다. 객체 만들때 new이용하면된다.
		myTv.setChannel(7);
		myTv.setPower(true);
		myTv.setColor("red");
		
		myTv.channelUp();
		System.out.println("channel : " + myTv.getChannel());
		myTv.channelDown();
		System.out.println("channel : " + myTv.getChannel());
	}

}
