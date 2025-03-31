package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FigurasGeometricasTest {

    private FigurasGeometricas figuras;

    @BeforeEach
    void setUp() {
        figuras = new FigurasGeometricas(4, 6, 5, 3);
    }

    @Test
    @DisplayName("Teste de Instanciação das Figuras Geométricas")
    void testInstanciacao() {
        assertEquals(5, figuras.getQuadrado().getLado(), 0.001);
        assertEquals(3, figuras.getCirculo().getRaio(), 0.001);
        assertEquals(4, figuras.getRetangulo().getAlturaRetangulo(), 0.001);
        assertEquals(6, figuras.getRetangulo().getLarguraRetangulo(), 0.001);
    }

    @Test
    void testToString() {
        String expectedOutput = "Raio do circulo 3.0, Área de 28.27, Perímetro de 18.85\n" +
                "Lado do quadrado 5.0, Area de 25.0, Perimetro de 20.0\n" +
                "Altura do retangulo 4.0, Largura do retangulo 6.0, Area de 24.0, Perimetro de 20.0";
        assertEquals(expectedOutput, figuras.toString());
    }
}
