package com.github.afmcmorais.countries.repository;

import com.github.afmcmorais.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
