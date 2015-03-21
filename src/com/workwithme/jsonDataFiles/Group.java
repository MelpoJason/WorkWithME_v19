package com.workwithme.jsonDataFiles;

import java.util.*;

/**
 * Created by Chen Zhuo on 2/9/2015.
 */
public class Group {
  private int number;
  private String name;
  private List<User> user = new ArrayList<User>();

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public List<User> getUser() {
    return user;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUser(List<User> user) {
    this.user = user;
  }


}
