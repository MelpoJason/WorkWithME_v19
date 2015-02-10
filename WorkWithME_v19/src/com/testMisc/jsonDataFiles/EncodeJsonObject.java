package com.testMisc.jsonDataFiles;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by Chen Zhuo on 2/10/2015.
 */
public class EncodeJsonObject {
  public static void main(String[] args) {
    String jsonString =
        "{\"name\":\"WorkWithMe\",\"number\":2,\"user\":[{\"id\":3,\"name\":\"Eric\"},{\"id\":4,\"name\":\"Lyang\"}]}";
    Group encodeGroup = JSON.parseObject(jsonString, Group.class);
    System.out.println(encodeGroup.getName() + " " + encodeGroup.getNumber());
    List<User> userList = encodeGroup.getUser();
    for(int i = 0; i < 2 ; i++){
      User user = userList.get(i);
      System.out.println(user.getName() + " " + user.getId());
    }
    
  }
}

