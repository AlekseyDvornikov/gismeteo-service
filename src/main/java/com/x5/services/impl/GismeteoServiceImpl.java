package com.x5.services.impl;

import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x5.components.ApiLink;
import com.x5.components.impl.ApiLinkImplementation;
import com.x5.services.GismeteoService;

import entity.Place;
import entity.Weather;

@Service
public class GismeteoServiceImpl implements GismeteoService {
	
	private ApiLink apiLink;
	
	@Autowired
	public GismeteoServiceImpl(ApiLinkImplementation apiLink) {
		this.apiLink = apiLink;
		
	}
	
	public ArrayList<Weather> getWeatherList(){
		return null;
	}

	@Override
	public Place searchCityByCoord(double lat, double lon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Place searchCityByIp(String ipPlace) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Place searchCityByName(String placeName) {		
		return apiLink.loadPlaceByName(placeName);
		
	}

	@Override
	public Weather getForecastWeather(Place place) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getCurrentWeather(String code) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Weather getWeatherByName(String placeName) {
		Place place = searchCityByName(placeName);
//		Weather weatherEntity = new Weather(null, null, null, null);;
//		if (place.isFounded()) {
//		   weatherEntity = apiLink.getWeather(null);
//		}
//		return weatherEntity;
		return null;
	}
	

}
