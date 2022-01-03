package ch07.ex01.case11.user.service;

import ch07.ex01.case11.user.dao.UserDao;
import ch07.ex01.case11.user.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User findUser(int level) {
		User user = null;
		if(level<5) user = userDao.getUser(level);
		else user = userDao.getUser(5);
		return user;
	}
}