package UD8;

import java.util.Scanner;

public class T08_Tarea_02 {
	private int longitud;
	private String contraseña;

	// Por defecto
	public T08_Tarea_02() {
		this.longitud = 8;
		generarContraseña();
	}

	// Con la longitudd
	public T08_Tarea_02(Scanner scanner) {
		System.out.print("¿De cuantos caracteres quieres la contraseña? ");
		this.longitud = scanner.nextInt();
		generarContraseña();
	}

	private void generarContraseña() {
		StringBuilder contraseñaGenerada = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			char caracter = (char) ((Math.random() * 26) + 'a');
			contraseñaGenerada.append(caracter);
		}
		this.contraseña = contraseñaGenerada.toString();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarContraseña();
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Contraseña: " + contraseña;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		T08_Tarea_02 contraseña1 = new T08_Tarea_02();
		System.out.println(contraseña1);

		T08_Tarea_02 contraseña2 = new T08_Tarea_02(scanner);
		System.out.println(contraseña2);

		scanner.close();
	}
}
