package com.estudosTestes.web;

import com.estudosTestes.domain.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
}
