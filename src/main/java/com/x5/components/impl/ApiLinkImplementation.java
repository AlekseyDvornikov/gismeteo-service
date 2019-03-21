package com.x5.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.x5.components.ApiLink;

import entity.Place;
import entity.Weather;


@Service("appLinkComponent")
public class ApiLinkImplementation implements ApiLink {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${forecast-3h-by-coord}")
	String getForecast3hByCoord; //https://api.gismeteo.net/v2/weather/forecast/
	
	@Value("${forecast-6h-by-coord}")
	String getForecast6hByCoord; //https://api.gismeteo.net/v2/weather/forecast/by_day_part
	
	@Value("${forecast-24h-by-coord}")
	String getForecast24hByCoord; //https://api.gismeteo.net/v2/weather/forecast/aggregate
		
	@Value("${current-weather-by-object}")
	String getWeatherByObject;          //https://api.gismeteo.net/v2/weather/current
	
	@Value("${search-cities-by-coord}")
	String searchCitiesByCoord;         //https://api.gismeteo.net/v2/search/cities/?latitude=54.35&longitude=52.52&limit=10
	
	@Value("${search-cities-by-name}")
	String searchCitiesByName;          //https://api.gismeteo.net/v2/search/cities/?query=
	
	@Value("${search-cities-by-ip}")
	String searchCitiesByIp;            //https://api.gismeteo.net/v2/search/cities/?ip=8.8.8.8
	
	@Override
	public Place loadPlaceByName(String name) {		
		return restTemplate.getForObject(null, Place.class);
	}

	@Override
	public Weather getWeather(String url) {
		return restTemplate.getForObject(null, Weather.class);
	}
	
	
	
}
