package com.example.admin.dublinbike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Sushmita Shrestha(16366) on 12/3/2018.
 */
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
    //on click method to open main activity from home activity
    public void displayLV (View view){

        startActivity(new Intent(HomeActivity.this,MainActivity.class));

    }

    //on click method to open map activity from home activity
    public void displayMV (View view){

        startActivity(new Intent(HomeActivity.this,MapsActivity.class));

    }

    //on click method to open about activity from home activity
    public void displayAV (View view){

        startActivity(new Intent(HomeActivity.this,About.class));

    }
}
