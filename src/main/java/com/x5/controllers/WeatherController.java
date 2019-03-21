package com.x5.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.x5.services.impl.GismeteoServiceImpl;

import entity.Weather;

public class WeatherController extends Controller{

	public WeatherController(GismeteoServiceImpl gismeteoSerivce) {
		super(gismeteoSerivce);
	}
	
	@GetMapping("/getWeatherByCode")
	public ResponseEntity<Weather> getWeatherByCode(String code) {
		return new ResponseEntity<Weather>(gismeteoSerivce.getCurrentWeather(code), HttpStatus.OK);
	}

}
