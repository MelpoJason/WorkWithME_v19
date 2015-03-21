package com.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Gallery;
import com.example.workwithme_v19.R;

/**
 * Created by Chen Zhuo on 2/10/2015.
 */
public class IntroductionActivity extends Activity {
  private Gallery mGallery;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_introduction);
  }
}
