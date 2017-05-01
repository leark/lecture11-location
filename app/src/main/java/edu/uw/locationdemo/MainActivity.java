package edu.uw.locationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LOCATION";

    private TextView textLat;
    private TextView textLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLat = (TextView)findViewById(R.id.txt_lat);
        textLng = (TextView)findViewById(R.id.txt_lng);


    }

}
