package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	
	@Autowired
	private static CountryService countryService;

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	private static void getAllCountriesTest() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("IN");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");
	}

	private static void testAddCountry() throws CountryNotFoundException {

		Country c1 = new Country();
		c1.setCode("TC");
		c1.setName("Test Country");

		countryService.addCountry(c1);

		LOGGER.info("Start");
		Country country = countryService.findCountryByCode("TC");
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");
	}

	private static void testUpdateCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		countryService.updateCountry("TC", "I N D I A");
		LOGGER.debug("Update successfull");
		LOGGER.info("End");
	}

	private static void testDeleteCountry() throws CountryNotFoundException {
		LOGGER.info("Start");
		countryService.deleteCountry("TC");
		LOGGER.debug("Delete successfull");
		LOGGER.info("End");
	}

	public static void main(String[] args) throws CountryNotFoundException {
		/*
		 * SpringApplication.run(OrmLearnApplication.class, args);
		 * 
		 * LOGGER.info("Inside main");
		 */

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();

//		getAllCountriesTest();

//		testAddCountry();

//		testUpdateCountry();

//		testDeleteCountry();
	}

}
