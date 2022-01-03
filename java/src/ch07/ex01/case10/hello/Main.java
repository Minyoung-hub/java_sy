package ch07.ex01.case10.hello;

import ch07.ex01.case10.hello.presentation.UserIo;
import ch07.ex01.case10.hello.service.UserService;
import ch07.ex01.case10.hello.service.UserServiceEng;
import ch07.ex01.case10.hello.service.UserServiceKor;

public class Main {
	public static void main(String[] args) {
		UserService userKor = new UserServiceKor();
		UserService userEng = new UserServiceEng();
		
		UserIo userIo = new UserIo(userKor);
		userIo.say();
		
		userIo.setUserService(userEng);
		userIo.say();
	}
}