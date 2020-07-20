package com.daojie.git;

/**
 * @author dancinghorse
 * @version v0.0.1
 * @date 2020/7/20 - 上午11:44
 */
public class User {
	private String name;
	private String psd;

	public User(String name, String psd) {
		this.name = name;
		this.psd = psd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public User() {
	}
}
