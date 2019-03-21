package com.x5.controllers;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.x5.services.impl.GismeteoServiceImpl;
import entity.Place;
import entity.Weather;

@RestController
public class PlaceController extends Controller {

	public PlaceController(GismeteoServiceImpl gismeteoSerivce) {
		super(gismeteoSerivce);
	}

	@RequestMapping("/getPlace")
	public ResponseEntity<Place> getPlace(@RequestParam (value="place", defaultValue="Moscow") String place) {
		return new ResponseEntity<Place>(gismeteoSerivce.searchCityByName(place), HttpStatus.OK);				
	}
	
	@GetMapping("/getWeatherByName")
	public ResponseEntity<Weather> getWeatherByName(String code) {
		return new ResponseEntity<Weather>(gismeteoSerivce.getWeatherByName(code), HttpStatus.OK);
	}
	
}
