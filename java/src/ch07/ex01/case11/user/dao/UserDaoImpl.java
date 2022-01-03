package ch07.ex01.case11.user.dao;

import ch07.ex01.case11.user.domain.User;

public class UserDaoImpl implements UserDao {
	@Override
	public User getUser(int level) {
		return new User("최한석", level * 100);
	}
}