package com.example.admin.dublinbike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Sushmita Shrestha(16366) on 7/3/2018.
 */

public class display_listview extends AppCompatActivity {

    //variables
    String json_string;
    connect_adapter connect_adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_listview);

        listView = (ListView) findViewById(R.id.listView);

        //adding adapter to my list view
        connect_adapter = new connect_adapter(this,R.layout.list);
        listView.setAdapter(connect_adapter);

        //opeing new intent
        json_string = getIntent().getExtras().getString("json_data");

        try {

            //jsonObject = new JSONObject(json_string);
            //  jsonArray = jsonObject.getJSONArray("");
            JSONArray json = new JSONArray(json_string);


            int count = 0;

            String number,name,address,positionLat,positionLng,banking,bonus,status,contract_name,bike_stands,available_bike_stands,available_bikes,last_update;

            while (count<json.length())
            {
                JSONObject JO = json.getJSONObject(count);
                JSONObject ab = JO.getJSONObject("position");
                //creating latitude and longitude from position
                ab.get("lat");
                ab.get("lng");

//                Log.i("latitude", jb.getString("lat"));

                // adding values to the arrays for marker and title
                Connects.my_lati.add((double)ab.get("lat"));
                Connects.my_lng.add((double)ab.get("lng"));
                Connects.my_name.add((String)JO.get("name"));

                number = JO.getString("number");
                name = JO.getString("name");
                address = JO.getString("address");
                positionLat= ab.getString("lat");
                positionLng = ab.getString("lng");
                banking = JO.getString("banking");
                bonus = JO.getString("bonus");
                status = JO.getString("status");
                contract_name = JO.getString("contract_name");
                bike_stands = JO.getString("bike_stands");
                available_bike_stands = JO.getString("available_bike_stands");
                available_bikes = JO.getString("available_bikes");
                last_update = JO.getString("last_update");

                Connects contacts = new Connects("Station Number: "+ number,"Name: "+name,
                        "Address: "+address,"Latitude: "+positionLat,"Longitude: "+positionLng,
                        "Banking: "+banking,"Bonus: "+bonus,"status: "+status,
                        "contractName: "+contract_name, "bikeStands: "+bike_stands,
                        "availableStands: "+available_bike_stands,
                        "availableBikes: "+available_bikes, "lastUpdate: "+last_update);
                connect_adapter.add(contacts);


                count++;
            }


        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}


