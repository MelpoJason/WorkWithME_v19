package com.testMisc.jsonDataFiles;
import com.alibaba.fastjson.*;

/**
 * Created by Chen Zhuo on 2/9/2015.
 */
public class UserConvert {
 
  
  public static void  main(String[] args){
    Group testGroup = new Group();
    ;
      testGroup.setName("WorkWithMe");
      testGroup.setNumber(15);

      User jason = new User();
      jason.setName("jason");
      jason.setId(01);
      User melpo = new User();
      melpo.setId(02);
      melpo.setName("melpo");

      testGroup.getUser().add(jason);
      testGroup.getUser().add(melpo);
    
    
    String jsonString = JSON.toJSONString(testGroup);
    System.out.print(jsonString);
  }
}
