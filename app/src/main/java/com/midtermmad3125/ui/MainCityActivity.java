package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.SplashscreenActivity;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONObject;

public class MainCityActivity extends AppCompatActivity

{
private TextView cname;
private TextView clat;
private TextView clon;
private TextView cpopulation;
private Button w;
private TextView c;
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
        c = findViewById(R.id.txtcitycode);
        getJsonData();

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainCityActivity.this, WeatherDetailsActivity.class);
                startActivity(mIntent);
            }
        });


    }


    public void getJsonData ()
    {
        String JsonData = ReadJSONUtils.loadJSONFromAsset(this,"moscow_weather.json");

        try
        {
            JSONObject Data = new JSONObject(JsonData);
            JSONObject object= Data.getJSONObject("city");
            String cityid = object.getString("name");
            cname.setText(object.getString("name"));

            JSONObject cityCoordObject= object.getJSONObject("coord");
            clon.setText("Longitude: "+cityCoordObject.getString("lon"));
            clat.setText("Latitude: "+cityCoordObject.getString("lat"));

            c.setText("Country: "+object.getString("country"));
            cpopulation.setText("population: "+object.getString("population"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
