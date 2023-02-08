package com.springproj.weatherapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproj.weatherapp.entity.CityDetails;
import com.springproj.weatherapp.response.CityWeatherResponse;

@Service
public interface WeatherAppService {

	List<CityWeatherResponse> fetchCityWeatherDtls(String city, String weatherDate);

	List<CityDetails> getAllCityDtls();

}
