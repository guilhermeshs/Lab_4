package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    void setUp() {
        retangulo = new Retangulo(4.0, 6.0);
    }

    @Test
    @DisplayName("Teste de Cálculo de Área do Retângulo")
    void testCalcularArea() {
        assertEquals(24.0, retangulo.calcularArea(), 0.001);
    }

    @Test
    @DisplayName("Teste de Cálculo de Perímetro do Retângulo")
    void testCalcularPerimetro() {
        assertEquals(20.0, retangulo.calcularPerimetro(), 0.001);
    }
    @Test
    @DisplayName("Teste de Exceção para Altura ou Largura Inválida")
    void testDimensoesInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -1));
    }
}