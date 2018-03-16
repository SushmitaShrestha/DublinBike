package com.example.admin.dublinbike;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sushmita Shrestha(16366) on 7/3/2018.
 */



public class connect_adapter extends ArrayAdapter {

    //array created for list
    List list = new ArrayList();

    public connect_adapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    //adding objects to list
    public void add(Connects object) {
        super.add(object);
        list.add(object);

    }

    //count list size
    @Override
    public int getCount() {
        return list.size();
    }

    //add item to the list
    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row;
        row = convertView;
        ContactHolder contactHolder;

        //if-else condition for list
        if(row==null)
        {
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row = layoutInflater.inflate(R.layout.list,parent,false);

            contactHolder = new ContactHolder();
            contactHolder.text_number = (TextView) row.findViewById(R.id.text_number);
            contactHolder.text_name = (TextView) row.findViewById(R.id.text_name);
            contactHolder.text_address = (TextView) row.findViewById(R.id.text_address);
            contactHolder.text_positionLat = (TextView) row.findViewById(R.id.text_positionLat);
            contactHolder.text_positionLng = (TextView) row.findViewById(R.id.text_positionLng);
            contactHolder.text_banking = (TextView) row.findViewById(R.id.text_banking);
            contactHolder.text_bonus = (TextView) row.findViewById(R.id.text_bonus);
            contactHolder.text_status = (TextView) row.findViewById(R.id.text_status);
            contactHolder.text_contract_name = (TextView) row.findViewById(R.id.text_contract_name);
            contactHolder.text_bike_stands = (TextView) row.findViewById(R.id.text_bike_stands);
            contactHolder.text_available_bike_stands = (TextView) row.findViewById(R.id.text_available_bike_stands);
            contactHolder.text_available_bikes = (TextView) row.findViewById(R.id.text_available_bikes);
            contactHolder.text_last_update = (TextView) row.findViewById(R.id.text_last_update);

            row.setTag(contactHolder);

        }

        else{

            contactHolder = (ContactHolder) row.getTag();
        }

        Connects contacts = (Connects) this.getItem(position);

        contactHolder.text_number.setText(contacts.getNumber());
        contactHolder.text_name.setText(contacts.getName());
        contactHolder.text_address.setText(contacts.getAddress());
        contactHolder.text_positionLat.setText(contacts.getPositionLat());
        contactHolder.text_positionLng.setText(contacts.getPositionLng());
        contactHolder.text_banking.setText(contacts.getBanking());
        contactHolder.text_bonus.setText(contacts.getBonus());
        contactHolder.text_status.setText(contacts.getStatus());
        contactHolder.text_contract_name.setText(contacts.getContract_name());
        contactHolder.text_bike_stands.setText(contacts.getBike_stands());
        contactHolder.text_available_bike_stands.setText(contacts.getAvailable_bike_stands());
        contactHolder.text_available_bikes.setText(contacts.getAvailable_bikes());
        contactHolder.text_last_update.setText(contacts.getLast_update());

        return row;
    }

    //construtor
    static class ContactHolder
    {
        TextView text_number,text_name,text_address,text_positionLat,text_positionLng,text_banking,text_bonus,
                text_status,text_contract_name,text_bike_stands,text_available_bike_stands,text_available_bikes,text_last_update;
    }
}

