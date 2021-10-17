package com.github.afmcmorais.states.repositories;

import com.github.afmcmorais.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
