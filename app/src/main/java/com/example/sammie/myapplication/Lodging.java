<<<<<<< HEAD
package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sammie on 12/10/15.
 */
public class Lodging extends Activity implements Spinner.OnItemSelectedListener {

    Spinner lodSpinner;
    TextView cost;
    static int lastChanged = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lodging_screen);

        TextView t = (TextView) findViewById(R.id.TravelDestinationsLodging);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.DatesLodging);
        x.setText(MainActivity.TravelDates);

        cost = (TextView) findViewById(R.id.RunningTotalLodging);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);

        lodSpinner = (Spinner)findViewById(R.id.lodgeSpinner);
        lodSpinner.setOnItemSelectedListener(this);
    }

    public void GoToEntertainmentScreen(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void GoToTransportation(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0){
        }
        else if (position == 1) {
            Toast.makeText(Lodging.this, "Hotel Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 500;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);

        }
        else if (position == 2) {
            Toast.makeText(Lodging.this, "Friends/Family Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 100;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 3) {
            Toast.makeText(Lodging.this, "Finding a Place Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 250;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 4) {
            Toast.makeText(Lodging.this, "Bridge Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 0;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
=======
package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sammie on 12/10/15.
 */
public class Lodging extends Activity implements Spinner.OnItemSelectedListener {

    Spinner lodSpinner;
    TextView cost;
    static int lastChanged = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lodging_screen);

        TextView t = (TextView) findViewById(R.id.TravelDestinationsLodging);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.DatesLodging);
        x.setText(MainActivity.TravelDates);

        cost = (TextView) findViewById(R.id.RunningTotalLodging);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);

        lodSpinner = (Spinner)findViewById(R.id.lodgeSpinner);
        lodSpinner.setOnItemSelectedListener(this);
    }

    public void GoToEntertainmentScreen(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void GoToTransportation(View v){
        Intent intent = new Intent(this, Entertainment.class);
        startActivity(intent);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0){
        }
        else if (position == 1) {
            Toast.makeText(Lodging.this, "Hotel Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 500;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);

        }
        else if (position == 2) {
            Toast.makeText(Lodging.this, "Friends/Family Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 100;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 3) {
            Toast.makeText(Lodging.this, "Finding a Place Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 250;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
        else if (position == 4) {
            Toast.makeText(Lodging.this, "Bridge Chosen", Toast.LENGTH_LONG).show();
            MainActivity.runningTotal -= lastChanged;
            lastChanged = 0;
            MainActivity.runningTotal += lastChanged;
            String TransportCost = "$" + MainActivity.runningTotal;
            cost.setText(TransportCost);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
>>>>>>> 72a44f5b9aef083050dc90794963fd6529f7a689
