package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sammie on 12/10/15.
 */
public class Entertainment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertainment_screen);

        TextView t = (TextView) findViewById(R.id.DestinationsEnter);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.DatesEnter);
        x.setText(MainActivity.TravelDates);

        TextView cost = (TextView) findViewById(R.id.RunningTotalEnter);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);
    }

    public void GoToFinalScreen(View v){
        Intent intent = new Intent(this, Final.class);
        startActivity(intent);
    }

}
