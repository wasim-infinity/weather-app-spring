package com.springproj.weatherapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springproj.weatherapp.entity.CityDetails;
import com.springproj.weatherapp.response.CityWeatherResponse;
import com.springproj.weatherapp.service.WeatherAppService;

@RestController
@RequestMapping("/api")
public class WeatherAppController {

	@Autowired
	private WeatherAppService weatherAppService;

	@GetMapping("/get-city-weather-dtls")
	public List<CityWeatherResponse> fetchCityWeatherDtls(@RequestParam String city,
			@RequestParam(required = false) String weatherDate) {

		return weatherAppService.fetchCityWeatherDtls(city.toUpperCase().trim(), weatherDate.trim());
	}

	@GetMapping("/get-all-city-dtls")
	public List<CityDetails> getAllCityDtls() {
		return weatherAppService.getAllCityDtls();
	}

}
