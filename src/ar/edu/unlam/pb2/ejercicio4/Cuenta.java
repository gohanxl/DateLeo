package ar.edu.unlam.pb2.ejercicio4;

public class Cuenta {
	
	String titular = "";
	Double saldo = 0.0;
	
	public Cuenta(String titular) {
		
	}
	
	
	
	public Cuenta (String titular, Double saldo) {
		
	}
	
	public void depositar(Double cantidad) {
		
		if(cantidad > 0) {
		this.saldo = saldo + cantidad;
		}
		
	}
	
	public void retirar(Double cantidad) {
		
		if(cantidad < saldo) {
			
			this.saldo -= cantidad;
			
		}
	}
}			
