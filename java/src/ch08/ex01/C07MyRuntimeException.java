package ch08.ex01;

class LengthException extends Exception{
	public LengthException(String msg) {
		super(msg);
	}
}

class MemberException extends RuntimeException{
	public MemberException(String msg) {
		super(msg);
	}
}
public class C07MyRuntimeException {
	public static void main(String[] args) {
		//
		
		try{
			throw new LengthException("길이 초과.");
		}catch(LengthException e) {
			e.printStackTrace();
		}
		throw new MemberException("회원 아님.");
	}
}