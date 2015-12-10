package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by sammie on 12/10/15.
 */
public class Lodging extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lodging_screen);
    }

    public void GoToEntertainmentScreen(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void GoToTransportation(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }
}
