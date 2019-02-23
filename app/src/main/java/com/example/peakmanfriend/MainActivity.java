package com.example.peakmanfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.contentFriend, new com.example.peakmanfriend.MainFragment()).commit();
        }


    } // Main Method
} // Main class
