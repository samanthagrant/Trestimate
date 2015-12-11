package com.example.sammie.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sammie on 12/10/15.
 */
public class Final extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_screen);

        TextView t = (TextView) findViewById(R.id.DestinationsFinal);
        t.setText(MainActivity.Destinations);

        TextView x = (TextView) findViewById(R.id.DatesFinal);
        x.setText(MainActivity.TravelDates);

        TextView cost = (TextView) findViewById(R.id.RunningTotalFinal);

        String TransportCost = "$" + MainActivity.runningTotal;
        cost.setText(TransportCost);

        TextView trans_cost = (TextView) findViewById(R.id.transFinal);

        String TranspoCost = "$" + Transportation.lastChanged;
        trans_cost.setText(TranspoCost);

        TextView LodgeCost = (TextView) findViewById(R.id.lodgeFinal);

        String lcost = "$" + Lodging.lastChanged;
        LodgeCost.setText(lcost);

        TextView eCost = (TextView) findViewById(R.id.entertainTotal);

        String etcost = "$" + Entertainment.totalVal;
        eCost.setText(etcost);
    }

}
