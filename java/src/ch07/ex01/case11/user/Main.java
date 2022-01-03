package ch07.ex01.case11.user;

import ch07.ex01.case11.user.dao.UserDao;
import ch07.ex01.case11.user.dao.UserDaoImpl;
import ch07.ex01.case11.user.presentation.Console;
import ch07.ex01.case11.user.presentation.UserIo;
import ch07.ex01.case11.user.service.UserService;
import ch07.ex01.case11.user.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("시스템을 시작합니다.");
		userIo.play();
		Console.info("시스템을 종료합니다.");
	}
}