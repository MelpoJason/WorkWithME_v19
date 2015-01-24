package com.workwithme.userDataUtils;

import android.R.string;

public class UserBasicInfo {

	/**
	 * @author Chen Zhuo
	 * User basic Info
	 */
	
	public int userId;
	public string userName;
	public string userPassport;

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public string getUserName() {
		return userName;
	}
	public void setUserName(string userName) {
		this.userName = userName;
	}
	public string getUserPassport() {
		return userPassport;
	}
	public void setUserPassport(string userPassport) {
		this.userPassport = userPassport;
	}
}
