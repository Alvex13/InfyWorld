package com.infy.world.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.world.entity.Country;
import com.infy.world.repository.CountryRepository;

@Service
public class CountryService {

	
	@Autowired
	private CountryRepository repo;
	
	
	
	public Country getCountry(int no) {
		
		return repo.findById(no).orElse(new Country());
	}
}
