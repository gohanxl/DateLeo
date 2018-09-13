package ar.edu.unlam.pb2.ejercicio5;

public class Persona1 {
	private String nombre = "";
	private String apellido = "";
	private Integer dni = 0;
	private String fechaDeNacimiento = "";
	private String sexo = "H";
	private Double peso = 0.0;
	private Double altura = 0.0;
	private Double masaMuscular = 0.0;
	private Integer edad = 0;
	private final Integer masaMala = -1;
	private final Integer masaNormal = 0;
	private final Integer masaSobre = 1;
	private Boolean mayorDeEdad = true;

	public Persona1() {
		
	}
	
	public Persona1(String nombre, String apellido, String sexo, Double peso, Double altura, Integer edad) { 
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public Persona1(String nombre, Integer edad, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	
	public Double calcularIMC () {
		this.masaMuscular = this.peso / (this.altura*this.altura);	
		return masaMuscular;
	}
	
	public Integer tipoIMC() {
		if (masaMuscular < 20 ) {
			return masaMala;
		}
		if (masaMuscular >= 20 && masaMuscular < 25) {
			
			return masaNormal;
		}
			return masaSobre;
	}
	
	public Boolean esMayorDeEdad() {
		if (edad > 18) {
			mayorDeEdad = true;
		}
		else {
			mayorDeEdad = false;
		}
		return mayorDeEdad;
	}
	
	public void comprobarSexo() {
	if (sexo == "H" || sexo == "F") {
		
	}
	else {
		this.sexo = "H";
		}
	}
	
	public Integer generaDNI() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Double getMasaMuscular() {
		return masaMuscular;
	}

	public void setMasaMuscular(double masaMuscular) {
		this.masaMuscular = masaMuscular;
	}

	public Boolean isMayorDeEdad() {
		return mayorDeEdad;
	}

	public void setMayorDeEdad(boolean mayorDeEdad) {
		this.mayorDeEdad = mayorDeEdad;
	}

	public Integer getMasaMala() {
		return masaMala;
	}

	public Integer getMasaNormal() {
		return masaNormal;
	}

	public Integer getMasaSobre() {
		return masaSobre;
	}

	
	
	@Override
	public String toString() {
		return "Persona1 [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", sexo=" + sexo + ", peso="
				+ peso + ", altura=" + altura + ", masaMuscular=" + masaMuscular + ", masaMala=" + masaMala
				+ ", masaNormal=" + masaNormal + ", masaSobre=" + masaSobre + ", mayorDeEdad=" + mayorDeEdad + "]";
	}
	
}