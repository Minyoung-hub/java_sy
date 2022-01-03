package ch07.ex01.case11.user.dao;

import ch07.ex01.case11.user.domain.User;

public interface UserDao {
	public User getUser(int level);
}