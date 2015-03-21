package com.workwithme.userDataUtils;

import android.R.string;

public class UserInfo {

  /**
   * @author Chen Zhuo
   * User basic Info
   */

  public int userId;
  public String userName;
  public String userPassport;
  public String userEmail;
  public String userLocation;
  public boolean userGender;

  public boolean isUserGender() {
    return userGender;
  }

  public void setUserGender(boolean userGender) {
    this.userGender = userGender;
  }

  public String getUserLocation() {
    return userLocation;
  }

  public void setUserLocation(String userLocation) {
    this.userLocation = userLocation;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public int getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassport() {
    return userPassport;
  }

  public void setUserPassport(String userPassport) {
    this.userPassport = userPassport;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
