package ch05.ex05.case08;

public class ArithMain {
	public static void main(String[] args) {
		Paper paper = new Paper();
		Arith arith = new Arith();
		
		paper.setX(10); // 종이에 10을 적는다.
		arith.toHalf(paper); 
		// arith에게 그 숫자를 반으로 쪼개달라고 종이를 넘겨준다.
		// arith는 숫자가 얼마인지 몰라서 파악하고 쪼개준다.
		System.out.println(paper.getX()); 
		// 반으로 쪼개진 숫자가 적힌 종이의 값을 읽는다.
	}
}