package ch07.ex03.case12;

@TypeAnotation(name="calss", value=1)
public class MyClass {
	@MethodAnotation(name="method", value=2)
	public void process() {}
	
	public void processParam(
			@ParamAnotation(name = "parameter1", value = 31) String param,
			@ParamAnotation(name = "parameter2", value = 32) Integer num) {}
	
	@FieldAnotation (name="field", value=41)
	@Field2Anotation (name="field2", value=42)
	public String memberField;
}
