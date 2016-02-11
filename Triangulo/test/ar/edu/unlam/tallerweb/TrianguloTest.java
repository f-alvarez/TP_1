package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

			@Test
		
			public void testArea() {
				Triangulo triangulo = new Triangulo(4d, 4d);		
				triangulo.calcularArea();
				
				assertEquals(8,triangulo.calcularArea().intValue());
			
		}
		
		@Test
		
		public void testPerimetro(){
			Triangulo triangulo = new Triangulo(4d, 4d);		
			triangulo.calcularPerimetro();
			
			assertEquals(12,triangulo.calcularPerimetro().intValue());
			
		}

	}