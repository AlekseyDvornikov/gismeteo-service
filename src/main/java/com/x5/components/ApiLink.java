package com.x5.components;

import entity.Place;
import entity.Weather;

public interface ApiLink {
	
	public Place loadPlaceByName(String name);
	
	public Weather getWeather(String url);

}
