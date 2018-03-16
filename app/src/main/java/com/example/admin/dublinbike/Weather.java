package com.example.admin.dublinbike;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Sushmita Shrestha(16366) on 13/3/2018.
 */

public class Weather extends AppCompatActivity {

    //variables
    TextView cityField, detailsField, currentTemperatureField, humidity_field, pressure_field, weatherIcon, updatedField;

    Typeface weatherFont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

      //  weatherFont = Typeface.createFromAsset(getApplicationContext().getAssets(), "weathericons-regular-webfont.ttf");

        //connect to weather layout
        cityField = (TextView)findViewById(R.id.city);
        updatedField = (TextView)findViewById(R.id.updated);
        detailsField = (TextView)findViewById(R.id.details);
        currentTemperatureField = (TextView)findViewById(R.id.current_temperature);
        humidity_field = (TextView)findViewById(R.id.humidity);
        pressure_field = (TextView)findViewById(R.id.pressure);
        weatherIcon = (TextView)findViewById(R.id.weather);
        weatherIcon.setTypeface(weatherFont);


        //async task
        Function.placeIdTask asyncTask =new Function.placeIdTask(new Function.AsyncResponse() {
            public void processFinish(String weather_city, String weather_description, String weather_temperature, String weather_humidity, String weather_pressure, String weather_updatedOn, String weather_iconText, String sun_rise) {

                cityField.setText(weather_city);
                updatedField.setText(weather_updatedOn);
                detailsField.setText(weather_description);
                currentTemperatureField.setText(weather_temperature);
                humidity_field.setText("Humidity: "+weather_humidity);
                pressure_field.setText("Pressure: "+weather_pressure);
                weatherIcon.setText(Html.fromHtml(weather_iconText));

            }
        });
        asyncTask.execute("53.350140", "-6.266155"); //  asyncTask.execute("Latitude", "Longitude")
        //Log.i("data", "onCreate: weather_city");

    }


}
