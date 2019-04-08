package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

public class MainCityActivity extends AppCompatActivity

{
private TextView cname;
private TextView clat;
private TextView clon;
private TextView cpopulation;
private Button w;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cname = findViewById(R.id.txtcityname);
        clat = findViewById(R.id.txtcitylat);
        clon = findViewById(R.id.txtcitylon);
        cpopulation = findViewById(R.id.txtcityp);
        w = findViewById(R.id.btnweather);
    }
}
