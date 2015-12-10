package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sammie on 12/10/15.
 */
public class Transportation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportation_screen);
    }

    public void GoToLodgingScreen(View v){
        Intent intent = new Intent(this, Lodging.class);
        startActivity(intent);
    }
}
