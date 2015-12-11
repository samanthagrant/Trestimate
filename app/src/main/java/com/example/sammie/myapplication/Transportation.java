package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by sammie on 12/10/15.
 */
public class Transportation extends Activity implements Spinner.OnItemSelectedListener {

    Spinner tspinner;
    TextView cost;
    static int lastChanged = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportation_screen);

        TextView t = (TextView) findViewById(R.id.TravelDestinations);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.Dates);
        x.setText(MainActivity.TravelDates);

        cost = (TextView) findViewById(R.id.RunningTotalTransportation);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);

        tspinner = (Spinner)findViewById(R.id.tSpinner);
        tspinner.setOnItemSelectedListener(this);

    }

    public void GoToLodgingScreen(View v){
        Intent intent = new Intent(this, Lodging.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0){
        }
        else if (position == 1) {
            Toast.makeText(Transportation.this, "Plane Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 300;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);

        }
        else if (position == 2) {
            Toast.makeText(Transportation.this, "Train Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 200;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 3) {
            Toast.makeText(Transportation.this, "Bus Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 100;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 4) {
            Toast.makeText(Transportation.this, "Drive Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 170;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
