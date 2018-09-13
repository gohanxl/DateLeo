package ar.edu.unlam.pb2.ejercicio5;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPersona {

	
	@Test
	public void estaEnSuPesoIdeal(){
		
		Persona1 Roberto = new Persona1("Roberto", "Sanchez", "H", 80.00, 1.78, 40);
		
		Roberto.calcularIMC();
		
		Integer valorEsperado = 1;
		Integer valorObtenido = Roberto.tipoIMC();
		
		
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
}
