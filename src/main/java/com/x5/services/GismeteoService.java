package com.x5.services;

import entity.Place;
import entity.Weather;

public interface GismeteoService {
	
	Place searchCityByCoord(double lat, double lon);
	
	Place searchCityByIp(String ipPlace);
	
	Place searchCityByName(String placeName);
	
	Weather getCurrentWeather(String code);
	
	Weather getForecastWeather(Place place);
	
}
