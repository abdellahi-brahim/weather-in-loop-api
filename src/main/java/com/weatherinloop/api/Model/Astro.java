package com.weatherinloop.api.Model;

import lombok.Data;

@Data
public class Astro {
    public String sunrise;
    public String sunset;
    public String moonrise;
    public String moonset;
    public String moon_phase;
    public String moon_illumination;
}
