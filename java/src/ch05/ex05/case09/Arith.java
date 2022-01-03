package ch05.ex05.case09;

public class Arith {	
	public Paper toHalf(Paper paper) {
		paper.setX(paper.getX() / 2);
		return paper;
	}
	// return값이 void가 아니면 꼭 return값이 나와야함.
}