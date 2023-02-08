package com.springproj.weatherapp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StringUtils;

public class CommonUtils {

	public static Resource loadFileAsResource(String fileName, File file) throws Exception {
		try {

			fileName = StringUtils.cleanPath(file.getAbsolutePath());

			Path filePath = file.toPath();
			Resource resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;
			} else {
				throw new Exception("File not found " + fileName);
			}
		} catch (MalformedURLException ex) {
			throw new Exception("File not found " + fileName, ex);
		}

	}
	
	public static final LocalDate stringToDate(String s, String dateFormat) {

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(format.parse(s));
			s = format.format(c.getTime());
			Date d = format.parse(s);
			System.out.println("date >> "+d);
			LocalDate date = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			System.out.println("local date >>> "+date);
			return date;
			

		} catch (ParseException e) {
			// e.printStackTrace();
			return null;
		}
	}

}
