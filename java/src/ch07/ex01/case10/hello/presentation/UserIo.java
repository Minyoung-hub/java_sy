package ch07.ex01.case10.hello.presentation;

import ch07.ex01.case10.hello.service.UserService;

public class UserIo { //화면처리객체
	private UserService userService;
	
	public UserIo(UserService userService){
		this.userService = userService;
	}
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
	public void say() {
		System.out.println(userService.greet());
	}
	// 인사말을 던져주기만 할뿐 출력을 하지는 않는다.
}