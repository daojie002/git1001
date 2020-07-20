package com.daojie.git;

import java.util.List;

/**
 * @author dancinghorse
 * @version v0.0.1
 * @date 2020/7/20 - 上午11:41
 */
public class UserController {
	private UserService userService = new UserService();

	public void login(User user){
		boolean login = userService.login(user);
		if (login) {
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
		}
	}
	public void fingAll(){
		List<User> all = userService.findAll();
		for (User user : all) {
			System.out.println(user.getName());
		}
	}

	public static void main(String[] args) {
		UserController userController = new UserController();
		userController.fingAll();
	}

}
