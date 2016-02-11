package ar.edu.unlam.tallerweb1.circulo;

import static org.junit.Assert.*;

import org.junit.Test;

	public class CirculoTest {

		@Test
		public void testCalcularAreaCirculo() {
			
			Circulo miCirculo = new Circulo(1.2);
			
			Double esperado=4.52;
			
			 assertEquals(esperado, miCirculo.calcularArea(), 0.1); 
			
		}
		
		@Test
		public void testCalcularPerimetroCirculo() {
			
			Circulo miCirculo = new Circulo(1.2);
			
			Double esperado=7.54;
			
			 assertEquals(esperado, miCirculo.calcularPerimetro(), 0.1); 
			 
		}

	}
