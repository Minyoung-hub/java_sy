package ch05.ex02.home;

public class Memo {
	private String msg;
	private String name;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return msg + " from " + name;
	}

}
