package org.example;

public class Retangulo implements Figuras {

	private double alturaRetangulo;
	private double larguraRetangulo;

	public Retangulo(double altura, double largura) {
		if (altura <= 0 || largura <= 0) {
			throw new IllegalArgumentException("A altura e a largura do retângulo devem ser positivas!");
		}
		this.alturaRetangulo = altura;
		this.larguraRetangulo = largura;
	}

	public double getAlturaRetangulo() {
		return alturaRetangulo;
	}

	public void setAlturaRetangulo(double alturaRetangulo) {
		if (alturaRetangulo < 0) {
			throw new IllegalArgumentException("A altura do retângulo não pode ser negativa!");
		}
		this.alturaRetangulo = alturaRetangulo;
	}

	public double getLarguraRetangulo() {
		return larguraRetangulo;
	}

	public void setLarguraRetangulo(double larguraRetangulo) {
		if (larguraRetangulo < 0) {
			throw new IllegalArgumentException("A largura do retângulo não pode ser negativa!");
		}
		this.larguraRetangulo = larguraRetangulo;
	}

	@Override
	public double calcularArea() {
		return alturaRetangulo * larguraRetangulo;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * alturaRetangulo) + (2 * larguraRetangulo);
	}

	@Override
	public String toString() {
		return ("Altura do retangulo " + getAlturaRetangulo() + ", Largura do retangulo "+ getLarguraRetangulo() + ", Area de " + calcularArea() + ", Perimetro de " + calcularPerimetro());
	}
}