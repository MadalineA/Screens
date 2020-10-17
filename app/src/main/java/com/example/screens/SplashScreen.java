package com.example.screens;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

public static int SPLASH_TIME_OUT = 3000;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);


        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.work));
        videoView.start();
        new Handler().postDelayed(new Runnable() {


/*
 * Showing splash screen with a timer. This will be useful when you
 * want to show case your app logo / company
 */

@Override
public void run() {
        // This method will be executed once the timer is over
        // Start your app main activity
        Intent i = new Intent(SplashScreen.this, MyAppIntroActivity.class);
        startActivity(i);

        // close this activity
        finish();
        }
        }, SPLASH_TIME_OUT);
        }
        }



















//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//import android.graphics.Color;
//
//import android.os.Bundle;
//import android.view.View;



//import gr.net.maroulis.library.EasySplashScreen;
//
//public class SplashScreen extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_splashsreen);
//
//        EasySplashScreen config = new EasySplashScreen(SplashScreen.this)
//                .withFullScreen()
//                .withTargetActivity(MyAppIntroActivity.class)
//                .withSplashTimeOut(4000)
//                .withBackgroundColor(Color.parseColor("#efefef"))
//                 .withHeaderText("hello")
//                .withFooterText("Copyright 2020")
//                 .withBeforeLogoText("hello")
//                .withLogo(R.drawable.welcome);
//                //.withAfterLogoText();
//
//
//        //change text color
//        config.getHeaderTextView().setTextColor(Color.BLACK);
//        config.getFooterTextView().setTextColor(Color.BLACK);
//        config.getBeforeLogoTextView().setTextColor(Color.BLACK);
//        config.getBeforeLogoTextView().setTextSize(32);
//
//        //finally create the view
//        View easySplashScreenView = config.create();
//        setContentView(easySplashScreenView);
//
//
////        getWindow().setFormat(PixelFormat.TRANSLUCENT);
////        VideoView videoHolder = new VideoView(this);
//////if you want the controls to appear
////        videoHolder.setMediaController(new MediaController(this));
////        Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
////                + R.raw.work); //do not add any extension
//////if your file is named sherif.mp4 and placed in /raw
//////use R.raw.sherif
////        videoHolder.setVideoURI(video);
////        setContentView(videoHolder);
////        videoHolder.start();
////
////
////
////    }
//
//    }
//}