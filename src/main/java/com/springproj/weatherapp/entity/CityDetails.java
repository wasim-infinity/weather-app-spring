package com.springproj.weatherapp.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(columnDefinition = "VARCHAR(50)")
	private String name;

	@Column(columnDefinition = "VARCHAR(50)")
	private String region;

	@Column(columnDefinition = "VARCHAR(50)")
	private String country;

	@Column(columnDefinition = "DOUBLE(16,2)")
	private double lat;

	@Column(columnDefinition = "DOUBLE(16,2)")
	private double lon;

	@Column(columnDefinition = "VARCHAR(50)")
	private String tz_id;

	@Column(columnDefinition = "DOUBLE(16,2)")
	private double temp_c;

	@Column(columnDefinition = "DOUBLE(16,2)")
	private double temp_f;
	
	@Column(columnDefinition = "DATE")
	private LocalDate createdAt;

}
