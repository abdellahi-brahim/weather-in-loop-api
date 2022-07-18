package com.weatherinloop.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.weatherinloop.api.Model.Weather;
import com.weatherinloop.api.Proxy.WeatherProxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/api/weather", produces = { MediaType.APPLICATION_JSON_VALUE })
public class WeatherRestController {

    @Autowired
    WeatherProxy weatherProxy;

    @GetMapping("{name}")
    @ResponseBody
    public Weather getWeather(@PathVariable("name") String name) {
        return weatherProxy.getWeather(name);
    }

}
