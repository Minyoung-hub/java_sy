package ch06.ex04.case04;

public class Phone {
	private String modelName;
	
	public Phone(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Phone) {
			// instanceof왼쪽에는 객체 오른쪽에는 연산자
			return this.modelName.equals(((Phone) obj).modelName);
			//여기 있는 이퀄스는 스트링클래스 안에 있는 이퀄스로 문구를 비교한다.
		}else {
			return false;
		}
	}
}