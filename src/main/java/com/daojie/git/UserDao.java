package com.daojie.git;

/**
 * @author dancinghorse
 * @version v0.0.1
 * @date 2020/7/20 - 上午11:41
 */
public class UserDao {
	User selectByName(String name) {
		if ("Tom".equals(name)) {
			return new User("Tom","123456");
		}else {
			return null;
		}
	}
}
