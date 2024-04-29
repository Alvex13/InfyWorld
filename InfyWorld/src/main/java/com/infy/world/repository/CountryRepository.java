package com.infy.world.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.world.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{

}
