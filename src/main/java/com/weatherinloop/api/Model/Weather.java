package com.weatherinloop.api.Model;

import lombok.Data;

@Data
public class Weather {
    public Location location;
    public Current current;
    public Forecast forecast;
    
}
