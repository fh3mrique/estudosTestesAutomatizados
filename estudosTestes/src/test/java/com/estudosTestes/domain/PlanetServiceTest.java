package com.estudosTestes.domain;
/*Import estático para facilitar os teste*/

import static com.estudosTestes.common.PlanetConstants.PLANET;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    @Test
    //Convenção de nomes dos metódos de teste
    //operação_estado_retorno
    public void createPlanet_WithValidData_ReturnsPlanets() {
        /*sut => system under test*/
        Planet sut = planetService.create(PLANET);

        Assertions.assertThat(sut).isEqualTo(PLANET);
    }
}
