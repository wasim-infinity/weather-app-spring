package com.springproj.weatherapp.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.springproj.weatherapp.entity.CityDetails;
import com.springproj.weatherapp.repository.CityDetailsRepository;

@Configuration
@Component
public class InsertTableBeanConfiguration {

	@Autowired
	private CityDetailsRepository cityDetailsRepository;

	@Bean
	public void saveAdmin() {
		cityDetailsRepository.deleteAll();
		cityDetailsRepository.truncateTable();
		cityDetailsRepository.save(new CityDetails(0, "LONDON", "City of London, Greater London", "United Kingdom", 51.52, -0.11, "Europe/London", 11, 51.8, LocalDate.of(2023, 1, 8)));
		cityDetailsRepository.save(new CityDetails(0, "HYDERABAD", "SOUTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 8, 48.8, LocalDate.of(2022, 10, 8)));
		cityDetailsRepository.save(new CityDetails(0, "AGARTALA", "NORTH EAST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 9, 45.8, LocalDate.of(2023, 1, 8)));
		cityDetailsRepository.save(new CityDetails(0, "BANGALORE", "SOUTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 10, 46.8, LocalDate.of(2022, 11, 8)));
		cityDetailsRepository.save(new CityDetails(0, "BHOPAL", "CENTRAL INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 12, 47.8, LocalDate.of(2023, 1, 8)));
		cityDetailsRepository.save(new CityDetails(0, "CHENNAI", "SOUTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 15, 53.8, LocalDate.of(2022, 8, 8)));
		cityDetailsRepository.save(new CityDetails(0, "DARJEELING", "EAST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 54, 51.8, LocalDate.of(2022, 7, 8)));
		cityDetailsRepository.save(new CityDetails(0, "GOA", "WEST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 13, 55.8, LocalDate.of(2022, 6, 8)));
		cityDetailsRepository.save(new CityDetails(0, "JAMMU", "NORTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 9, 45.8, LocalDate.of(2023, 10, 8)));
		cityDetailsRepository.save(new CityDetails(0, "KOLKATA", "EAST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 7, 46.8, LocalDate.of(2022, 11, 8)));
		cityDetailsRepository.save(new CityDetails(0, "MUMBAI", "WEST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 8, 44.8, LocalDate.of(2023, 1, 8)));
		cityDetailsRepository.save(new CityDetails(0, "PUNE", "WEST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 11, 43.8, LocalDate.of(2022, 12, 8)));
		cityDetailsRepository.save(new CityDetails(0, "RANCHI", "EAST INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 15, 48.8, LocalDate.of(2022, 4, 8)));
		cityDetailsRepository.save(new CityDetails(0, "AMBALA", "NORTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 16, 49.8, LocalDate.of(2023, 2, 8)));
		cityDetailsRepository.save(new CityDetails(0, "AGRA", "NORTH INDIA", "India", 51.52, -0.11, "Asia/Calcutta", 17, 55.8, LocalDate.of(2022, 1, 8)));
	}

}
