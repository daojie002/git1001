package com.daojie.git;

import java.util.ArrayList;
import java.util.List;

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
	List<User> selectAll(){
		List<User> list = new ArrayList<>();
		list.add(new User("Tom","123456"));
		list.add(new User("Jerry","123456"));
		list.add(new User("Tony","123456"));
		list.add(new User("Peter","123456"));
		return list;
	}
}
