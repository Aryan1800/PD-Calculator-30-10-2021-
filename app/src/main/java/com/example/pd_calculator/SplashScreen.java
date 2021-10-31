package com.example.pd_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();//to hide the tool bar in the Splash Screen

        Thread thread  = new Thread(){//in one app to work multiple work in one time we use 'Thread'.(This is a Class)

            public void run(){
                try{
                    sleep(3000);

                }
                catch (Exception e){
                       e.printStackTrace();//this is the mother of all exception

                }
                finally {
                    Intent intent = new Intent(SplashScreen.this , MainActivity.class);//this is to go for one Activity to another Activity
                    startActivity(intent);

                }

            }

        };thread.start();
    }
}