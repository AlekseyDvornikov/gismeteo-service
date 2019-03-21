package com.x5.utils;

public class Utils {
	
	public enum PLACE_TYPES{
		T{
			public String cityName() { 
				return "Town";
			}
		},
		C{
			public String cityName() { 
				return "City";
			}
		},
		A{
			public String cityName() { 
				return "Airport";
			}
		},
		M{
			public String cityName() { 
				return "Meteo";
			}
		};
		
		public abstract String cityName();
	}
	
	

}
