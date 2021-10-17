package com.github.afmcmorais.citiesapi.countries.repository;

import com.github.afmcmorais.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
