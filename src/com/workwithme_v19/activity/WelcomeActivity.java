package com.workwithme_v19.activity;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.example.workwithme_v19.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class WelcomeActivity extends Activity {

  private Button btn_login,btn_signup;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    fullScreen();
    setContentView(R.layout.activity_welcome);
    btn_login = (Button)findViewById(R.id.btn_login);
    btn_signup = (Button)findViewById(R.id.btn_signup);

    btn_login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
    btn_signup.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
  
  }


  private void fullScreen(){
    requestWindowFeature(Window.FEATURE_NO_TITLE);
  }
}
