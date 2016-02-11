package ar.edu.unlam.tallerweb;

public class Triangulo {
	
	private Double base;
	
	private Double altura;
	
	public Triangulo ( Double base, Double altura){
		
		this.base = base;
		this.altura = altura;
	}
	
	
	
	public Double calcularArea() {

		return (this.base * this.altura) / 2;
	}
	
	public Double calcularPerimetro() {

		return base * 3;
	}
}

