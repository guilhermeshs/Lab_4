package org.example;

public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) {

		//System.out.println("Altura do Retangulo - largura do Retangulo - Lado do Quadrado - Raio do Circulo");

		try {
			FigurasGeometricas figuras = new FigurasGeometricas(10, 5, 10, 25);
			System.out.println(figuras.toString());


		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
