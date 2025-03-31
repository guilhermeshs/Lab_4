package org.example;

public class Quadrado implements Figuras{


	private double lado;

	public Quadrado (double lado) {
		if(lado <= 0) {
			throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
		}
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		if(lado <= 0) {
			throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
		}
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}


	public String toString(){
		return ("Lado do quadrado " + getLado() +", Area de " + calcularArea() + ", Perimetro de " + calcularPerimetro());
	}
}
