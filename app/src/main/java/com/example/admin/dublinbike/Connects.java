package com.example.admin.dublinbike;

import java.util.ArrayList;

/**
 * Created by Sushmita Shrestha(16366) on 7/3/2018.
 */

public class Connects  {

    //arrays for making marker in map activity and title on marker
    public static ArrayList<Double> my_lati = new ArrayList<>();
    public static ArrayList<Double> my_lng = new ArrayList<>();
    public static ArrayList<String> my_name = new ArrayList<>();

    private String number,name,address,positionLat,positionLng,banking,bonus,status,contract_name,bike_stands,available_bike_stands,available_bikes,last_update;


    public Connects(String number, String name, String address, String positionLat, String positionLng, String banking,
                    String bonus, String status, String contract_name, String bike_stands,
                    String available_bike_stands,String available_bikes, String last_update)
            //methods
    {
        this.setNumber(number);
        this.setName(name);
        this.setAddress(address);
        this.setPositionLat(positionLat);
        this.setPositionLng(positionLng);
        this.setBanking(banking);
        this.setBonus(bonus);
        this.setStatus(status);
        this.setContract_name(contract_name);
        this.setBike_stands(bike_stands);
        this.setAvailable_bike_stands(available_bike_stands);
        this.setAvailable_bikes(available_bikes);
        this.setLast_update(last_update);


    }

    //getter and setter
    public String getPositionLng() {
        return positionLng;
    }

    public void setPositionLng(String positionLng) {
        this.positionLng = positionLng;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPositionLat() {
        return positionLat;
    }

    public void setPositionLat(String positionLat) {
        this.positionLat = positionLat;
    }

    public String getBanking() {
        return banking;
    }

    public void setBanking(String banking) {
        this.banking = banking;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getBike_stands() {
        return bike_stands;
    }

    public void setBike_stands(String bike_stands) {
        this.bike_stands = bike_stands;
    }

    public String getAvailable_bike_stands() {
        return available_bike_stands;
    }

    public void setAvailable_bike_stands(String available_bike_stands) {
        this.available_bike_stands = available_bike_stands;
    }

    public String getAvailable_bikes() {
        return available_bikes;
    }

    public void setAvailable_bikes(String available_bikes) {
        this.available_bikes = available_bikes;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

