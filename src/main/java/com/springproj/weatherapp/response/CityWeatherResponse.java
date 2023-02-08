package com.springproj.weatherapp.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CityWeatherResponse {

	public CityWeatherResponse() { 
	}

	CityLocation location;

	CurrentTemp current;

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CityLocation {
		String name;
		String region;
		String country;
		Double lat;
		Double lon;
		String tz_id;
		String localtime_epoch;
		LocalDateTime localtime;
	}

	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class CurrentTemp {
		Double temp_c;
		Double temp_f;
	}

}
