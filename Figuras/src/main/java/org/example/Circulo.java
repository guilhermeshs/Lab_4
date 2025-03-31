package org.example;

public class Circulo implements Figuras {

	private double raio;

	public Circulo(double raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("O raio do círculo deve ser maior que zero!");
		}
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		if (raio <= 0) {
			throw new IllegalArgumentException("O raio do círculo deve ser maior que zero!");
		}
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public String toString() {
		return String.format("Raio do circulo "+ getRaio() +", Área de %.2f, Perímetro de %.2f", calcularArea(), calcularPerimetro());
	}

}