package com.weatherinloop.api.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weatherinloop.api.Model.Weather;
import com.weatherinloop.api.config.FeignConfig;

import feign.Headers;

@FeignClient(name = "weather", url = "${api.baseUrl}/forecast.json", configuration = FeignConfig.class)
public interface WeatherProxy {

    @RequestMapping(method = RequestMethod.GET, value = "?q={name}&days=5")
    @Headers(value = "Content-Type: application/json")
    public Weather getWeather(@PathVariable("name") String name);

}
