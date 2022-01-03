package ch05.ex05.case17;

public class Cooker {
	public void wash(Noodle noodle) {} // 목적어에 해당하는 것은 파라미터로
	public void wash(Cucumber cucumber) {}
	public void boil(Noodle noodle) {}
	public SpicyNoodle mix(Noodle noodle, Cucumber cucumber, Gochujang gochujang) {
		return new SpicyNoodle();
	}
	
	public SpicyNoodle cook(Noodle noodle, Cucumber cucumber, Gochujang gochujang) {
		this.wash(noodle);
		this.wash(cucumber);
		this.boil(noodle);
		return this.mix(noodle, cucumber, gochujang); // mix안에 return 값이 존재 하므로 여기에 return을 붙여준다.
	}
}