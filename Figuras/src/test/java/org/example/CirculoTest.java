package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo(5.0);
    }

    @Test
    @DisplayName("Teste de Cálculo de Área do Círculo")
    void testCalcularArea() {
        assertEquals(Math.PI * 25, circulo.calcularArea(), 0.001);
    }

    @Test
    @DisplayName("Teste de Cálculo de Perímetro do Círculo")
    void testCalcularPerimetro() {
        assertEquals(2 * Math.PI * 5.0, circulo.calcularPerimetro(), 0.001);
    }

    @Test
    @DisplayName("Teste de Exceção para Raio Inválido")
    void testRaioInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(0));
        assertThrows(IllegalArgumentException.class, () -> new Circulo(-1));
    }
}
