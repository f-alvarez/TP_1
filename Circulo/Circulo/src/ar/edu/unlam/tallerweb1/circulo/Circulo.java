package ar.edu.unlam.tallerweb1.circulo;

public class Circulo {

	private Double radio;
	
			
	public Circulo(Double radio){
		
		this.radio = radio;
		
	}
	
		
	public Double CalcularArea(){
		
		 return this.radio*radio*Math.PI;
			
	}
	
	public Double CalcularPerimetro(){
		return this.radio*2*Math.PI;
	}


}
