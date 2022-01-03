package ch06.ex05.case06;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	// static 이기 때문에 객체 생성없이 바로 사용할 수 있다.
	static final String MAKER = "LG";
	final int WEIGHT = 10;
	LocalDate MANUFACTURE_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperture();
	String getModelName();
}