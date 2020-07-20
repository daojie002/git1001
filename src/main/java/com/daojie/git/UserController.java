package com.daojie.git;

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
	public void logout(){
		System.out.println("session清除，登出成功");
	}

	public static void main(String[] args) {
		UserController userController = new UserController();
		userController.login(new User("T1om","1234516"));
	}

}
