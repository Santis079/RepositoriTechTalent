package UD8;

public class T08_Tarea_01 {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;

	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';

	// Por defecto
	public T08_Tarea_01() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = SEXO_HOMBRE;
		this.peso = 0;
	}

	// Nombre, edad y sexo
	public T08_Tarea_01(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "";
		this.sexo = sexo;
		this.peso = 0;
	}

	// Con todo
	public T08_Tarea_01(String nombre, int edad, String dni, char sexo, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", Sexo: " + sexo + ", Peso: " + peso;
	}

	public static void main(String[] args) {
		T08_Tarea_01 persona1 = new T08_Tarea_01();
		System.out.println(persona1);

		T08_Tarea_01 persona2 = new T08_Tarea_01("Juan", 30, SEXO_HOMBRE);
		System.out.println(persona2);

		T08_Tarea_01 persona3 = new T08_Tarea_01("Sara", 25, "48273213F", SEXO_MUJER, 55);
		System.out.println(persona3);
	}
}