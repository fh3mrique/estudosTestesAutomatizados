package com.estudosTestes.web;

import com.estudosTestes.domain.Planet;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet create(Planet planet){
       return planetRepository.save(planet);
    }
}
