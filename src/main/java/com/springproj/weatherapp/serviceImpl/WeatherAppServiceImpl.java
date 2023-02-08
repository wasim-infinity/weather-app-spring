package com.springproj.weatherapp.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproj.weatherapp.entity.CityDetails;
import com.springproj.weatherapp.repository.CityDetailsRepository;
import com.springproj.weatherapp.response.CityWeatherResponse;
import com.springproj.weatherapp.service.WeatherAppService;
import com.springproj.weatherapp.utils.CommonUtils;
import com.springproj.weatherapp.utils.WeatherApplicationConstants;

@Service
public class WeatherAppServiceImpl implements WeatherAppService {

	@Autowired
	private CityDetailsRepository cityDetailsRepository;

	@Override
	public List<CityWeatherResponse> fetchCityWeatherDtls(String city, String weatherDate) {
		String[] allCityNames = city.split(",");
		List<CityWeatherResponse> cityWeatherResponseList = new ArrayList<CityWeatherResponse>();
		if (weatherDate.isEmpty()) {
			for (String cityName : allCityNames) {
				CityDetails cityData = cityDetailsRepository.findByName(cityName);
				if (!Objects.isNull(cityData)) {
					cityWeatherResponseList.add(CityWeatherResponse.builder()
							.location(CityWeatherResponse.CityLocation.builder().name(cityData.getName())
									.region(cityData.getRegion()).country(cityData.getCountry()).lat(cityData.getLat())
									.lon(cityData.getLon()).tz_id(cityData.getTz_id()).localtime(LocalDateTime.now())
									.localtime_epoch("1613896955").build())
							.current(CityWeatherResponse.CurrentTemp.builder()
									.temp_c(Double.parseDouble(
											WeatherApplicationConstants.CityCurrentTemperatureMap.get(cityName)))
									.temp_f(cityData.getTemp_f()).build())
							.build());

				} else {
					CityWeatherResponse cityWeatherResponse = new CityWeatherResponse();
					cityWeatherResponse.setCurrent(new CityWeatherResponse.CurrentTemp());
					cityWeatherResponse.setLocation(new CityWeatherResponse.CityLocation());
					cityWeatherResponseList.clear();
					cityWeatherResponseList.add(cityWeatherResponse);
					return cityWeatherResponseList;

				}
			}
			return cityWeatherResponseList;
		} else {
			CityDetails cityDtlsByDate = cityDetailsRepository.findByNameAndCreatedAt(city,
					CommonUtils.stringToDate(weatherDate + " 00:00:00", "dd-MM-yyyy HH:mm:ss"));
			cityWeatherResponseList.add(CityWeatherResponse.builder()
					.location(CityWeatherResponse.CityLocation.builder().name(cityDtlsByDate.getName())
							.region(cityDtlsByDate.getRegion()).country(cityDtlsByDate.getCountry())
							.lat(cityDtlsByDate.getLat()).lon(cityDtlsByDate.getLon()).tz_id(cityDtlsByDate.getTz_id())
							.localtime(LocalDateTime.now()).localtime_epoch("1613896955").build())
					.current(CityWeatherResponse.CurrentTemp.builder().temp_c(cityDtlsByDate.getTemp_c())
							.temp_f(cityDtlsByDate.getTemp_f()).build())
					.build());
			return cityWeatherResponseList;
		}

	}

	@Override
	public List<CityDetails> getAllCityDtls() {

		List<CityDetails> cityWeatherDtlsList = cityDetailsRepository.findAll();
		if (!Objects.isNull(cityWeatherDtlsList)) {
			return cityWeatherDtlsList;
		}
		return null;
	}

}
