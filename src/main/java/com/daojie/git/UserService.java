package com.daojie.git;

import java.util.List;

/**
 * @author dancinghorse
 * @version v0.0.1
 * @date 2020/7/20 - 上午11:41
 */
public class UserService {
	private UserDao userDao = new UserDao();
	public boolean login(User user){
		boolean ret = false;
		User refUser = userDao.selectByName(user.getName());
		if (refUser != null) {
			if (refUser.getPsd().equals(user.getPsd())) {
				ret = true;
			}
		}
		return ret;
	}
	public List<User> findAll(){
		return  userDao.selectAll();
	}
}
