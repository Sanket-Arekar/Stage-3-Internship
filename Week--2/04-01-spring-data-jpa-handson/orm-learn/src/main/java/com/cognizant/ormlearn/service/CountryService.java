package com.cognizant.ormlearn.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Transactional
	public List<Country> getAllCountries() {

		return countryRepository.findAll();
	}

	@Transactional
	public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

		Optional<Country> result = countryRepository.findById(countryCode);

		try {
			if (!result.isPresent()) {
				throw new CountryNotFoundException("Country NOT found");
			}
		} catch (CountryNotFoundException ex) {
			ex.getMessage();
		}

		Country country = result.get();

		return country;
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(String countryCode, String countryName) throws CountryNotFoundException {
		Optional<Country> result = countryRepository.findById(countryCode);

		if (result.isPresent()) {
			Country country = result.get();
			country.setName(countryName);
			countryRepository.save(country);
		} else {
			throw new CountryNotFoundException("Country NOT found");
		}
	}

	@Transactional
	public void deleteCountry(String id) {
		countryRepository.deleteById(id);
	}
}
