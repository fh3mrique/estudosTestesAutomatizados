package com.estudosTestes;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSoma() {
        Calculator calc = new Calculator();

        Assertions.assertThat(calc.soma(1, 999)).isEqualTo(1000);
    }
}
