package org.example;


public class FigurasGeometricas {
	
	private Quadrado quadrado;
	private Circulo circulo;
	private Retangulo retangulo;
	
	public Quadrado getQuadrado() {
		return quadrado;
	}

	public void setQuadrado(Quadrado quadrado) {
		this.quadrado = quadrado;
	}

	public Circulo getCirculo() {
		return circulo;
	}

	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}

	public Retangulo getRetangulo() {
		return retangulo;
	}

	public void setRetangulo(Retangulo retangulo) {
		this.retangulo = retangulo;
	}

	public FigurasGeometricas(int alturaRetangulo, int larguraRetangulo, int ladoQuadrado, int raioCirculo){
		this.quadrado = new Quadrado(ladoQuadrado);
		this.circulo = new Circulo(raioCirculo);
		this.retangulo = new Retangulo(alturaRetangulo, larguraRetangulo);
	}

	public String toString(){
		return (this.circulo.toString() + "\n"
				+this.quadrado.toString() + "\n"
				+ this.retangulo.toString());
	}
}