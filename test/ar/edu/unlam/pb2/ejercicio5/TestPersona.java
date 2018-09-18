package ar.edu.unlam.pb2.ejercicio5;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPersona {

	
	@Test
	public void estaEnSuPesoIdeal(){
		
		
		Persona1 Roberto = new Persona1("Roberto", "Lac", "H", 80.00, 1.80, 1997, 10, 4);
		
		Roberto.calcularIMC();
		
		Integer valorEsperado = 0;
		Integer valorObtenido = Roberto.tipoIMC();
		
		
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void esMayorDeEdad(){
		
		
		Persona1 Lucas = new Persona1("Lucas", "Lac", "H", 80.00, 1.80, 1997, 15, 8);
		
		
		assertTrue(Lucas.esMayorDeEdad());
		
	}	
	
}
