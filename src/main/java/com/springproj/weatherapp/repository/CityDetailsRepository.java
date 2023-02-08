package com.springproj.weatherapp.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springproj.weatherapp.entity.CityDetails;

@Repository
@Transactional
public interface CityDetailsRepository extends JpaRepository<CityDetails, Long> {

	@Modifying(clearAutomatically = true)
	@Query(value = "ALTER TABLE city_details AUTO_INCREMENT = 1", nativeQuery = true)
	void truncateTable();

	CityDetails findByName(String city);

	CityDetails findByNameAndCreatedAt(String city, LocalDate date);

}
