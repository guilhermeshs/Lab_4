package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    private Quadrado quadrado;

    @BeforeEach
    void setUp() {
        quadrado = new Quadrado(4.0);
    }

    @Test
    @DisplayName("Teste de Cálculo de Área do Quadrado")
    void testCalcularArea() {
        assertEquals(16.0, quadrado.calcularArea(), 0.001);
    }

    @Test
    @DisplayName("Teste de Cálculo de Perímetro do Quadrado")
    void testCalcularPerimetro() {
        assertEquals(16.0, quadrado.calcularPerimetro(), 0.001);
    }

    @Test
    @DisplayName("Teste de Exceção para Lado Inválido")
    void testLadoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(0));
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(-1));
    }
}
