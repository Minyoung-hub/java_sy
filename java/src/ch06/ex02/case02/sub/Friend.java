package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		// parent.getJuminNum();
		parent.getName();
		// parent.getWealth();
		// parent.addMoney(1000);
		// 패키지 다르고 상속도 아니면 다른 패키지에서 불러온 
		// 클래스의 public제한자만 읽을 수 있다.
	}
}
