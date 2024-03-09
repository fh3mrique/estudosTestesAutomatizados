package com.estudosTestes.domain;
/*Import estático para facilitar os teste*/

import static com.estudosTestes.common.PlanetConstants.PLANET;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    @MockBean
    private PlanetRepository planetRepository;

    @Test
    //Convenção de nomes dos metódos de teste
    //operação_estado_retorno
    public void createPlanet_WithValidData_ReturnsPlanets() {

        //ARRANGE: Prepara o ambiente de teste, incluindo a configuração de objetos,
        // variáveis e condições necessárias para executar o teste.
        Mockito.when(planetRepository.save(PLANET)).thenReturn(PLANET);

        //ACT: Executa a ação ou operação que está sendo testada, aplicando a lógica
        // ou o método sob teste.
        Planet sut = planetService.create(PLANET);

        //ASSERTION: Verifica se o resultado da ação realizada durante o "Act"
        // está de acordo com o esperado, por meio de afirmações ou verificações
        // de condições específicas
        assertThat(sut).isEqualTo(PLANET);
    }
}
