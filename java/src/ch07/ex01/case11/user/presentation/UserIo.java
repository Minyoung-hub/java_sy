package ch07.ex01.case11.user.presentation;

import ch07.ex01.case11.user.domain.User;
import ch07.ex01.case11.user.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		int level = 0;
		User user = null;
		String isRepeat = "";
		
		do {
			level = Console.inNum("등급을 입력하세요.");
			user = userService.findUser(level);
			Console.info(user);
			isRepeat = Console.inStr("또 다른 사용자를 찾을까요?");
		}while(isRepeat.equals("y"));
	}
}