package com.springproj.weatherapp.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherApplicationConstants {
	
	public static final Map<String, String> CityCurrentTemperatureMap;
	static {
		Map<String, String> CityCurrentTempMap = new HashMap<String, String>();
			CityCurrentTempMap.put("LONDON","11");
			CityCurrentTempMap.put("HYDERABAD","21");
			CityCurrentTempMap.put("AGARTALA","31");
			CityCurrentTempMap.put("BANGALORE","14");
			CityCurrentTempMap.put("BHOPAL","15");
			CityCurrentTempMap.put("CHENNAI","26");
			CityCurrentTempMap.put("DARJEELING","27");
			CityCurrentTempMap.put("GOA","28");
			CityCurrentTempMap.put("JAMMU","19");
			CityCurrentTempMap.put("KOLKATA","10");
			CityCurrentTempMap.put("MUMBAI","11");
			CityCurrentTempMap.put("PUNE","12");
			CityCurrentTempMap.put("RANCHI","13");
			CityCurrentTempMap.put("AMBALA","14");
			CityCurrentTempMap.put("AGRA","15");
			CityCurrentTemperatureMap = Collections.unmodifiableMap(CityCurrentTempMap);
			
	}

}
