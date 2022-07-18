package com.weatherinloop.api.Model;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Forecastday {
    public String date;
    public int date_epoch;
    public Day day;
    public Astro astro;
    public ArrayList<Hour> hour;
}
