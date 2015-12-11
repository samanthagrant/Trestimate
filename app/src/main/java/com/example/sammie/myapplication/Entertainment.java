package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sammie on 12/10/15.
 */
public class Entertainment extends Activity {
    
    CheckBox tourBox, musuemBox, parkBox, barBox, nightLifeBox;
    int tourVal, mVal, parkVal, barVal, nightVal;
    static int totalVal = 0;
    TextView cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.entertainment_screen);

        TextView t = (TextView) findViewById(R.id.DestinationsEnter);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.DatesEnter);
        x.setText(MainActivity.TravelDates);

        cost = (TextView) findViewById(R.id.RunningTotalEnter);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);

        nightLifeBox = (CheckBox) findViewById(R.id.clubs_checkBox);
        nightLifeBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    nightVal = 100;
                    MainActivity.runningTotal += 100;
                    String TransportCost = "$" + MainActivity.runningTotal;
                    cost.setText(TransportCost);
                }
                else{
                    nightVal = 0;
                    MainActivity.runningTotal -= 100;
                    String TransportCost = "$" + MainActivity.runningTotal;
                    cost.setText(TransportCost);
                }
            }
        });

        musuemBox = (CheckBox) findViewById(R.id.musuem_checkBox);
        musuemBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true){
                mVal = 20;
                MainActivity.runningTotal += 20;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            else{
                mVal = 0;
                MainActivity.runningTotal -= 20;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
        }
        });

        parkBox = (CheckBox) findViewById(R.id.parks_checkBox);
        parkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true){
                parkVal = 10;
                MainActivity.runningTotal += 10;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            else{
                parkVal = 0;
                MainActivity.runningTotal -= 10;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            }
        });

        barBox = (CheckBox) findViewById(R.id.drinking_checkBox);
        barBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true){
                barVal = 50;
                MainActivity.runningTotal += 50;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            else{
                barVal = 0;
                MainActivity.runningTotal -= 50;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
             }
        });

        tourBox = (CheckBox) findViewById(R.id.tour_checkBox);
        tourBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked == true){
                tourVal = 75;
                MainActivity.runningTotal += 75;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            else{
                tourVal = 0;
                MainActivity.runningTotal -= 75;
                String TransportCost = "$" + MainActivity.runningTotal;
                cost.setText(TransportCost);
            }
            }
        });
    }


    public void GoToFinalScreen(View v){
        totalVal = tourVal + mVal + parkVal + barVal + nightVal;

        Intent intent = new Intent(this, Final.class);
        startActivity(intent);
    }

}
