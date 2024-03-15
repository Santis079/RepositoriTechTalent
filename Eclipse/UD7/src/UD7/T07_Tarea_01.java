package UD7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class T07_Tarea_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Map<String, Double>> notasAlumnos = new HashMap<>();

		System.out.println("Cuantos alumnos hay?");
		int numAlumnos = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Pon el nombre del alumno  " + (i + 1) + ":");
			String nombre = scanner.nextLine();

			Map<String, Double> uds = new HashMap<>();
			for (int j = 0; j < 5; j++) {
				System.out.println("Pon ls nota de la UD" + (j + 1) + " para el alumno " + nombre + ":");
				double nota = scanner.nextDouble();
				scanner.nextLine();
				uds.put("UD" + (j + 1), nota);
			}

			notasAlumnos.put(nombre, uds);
		}

		for (Map.Entry<String, Map<String, Double>> entry : notasAlumnos.entrySet()) {
			String nombreAlumno = entry.getKey();
			Map<String, Double> asignaturas = entry.getValue();

			double sumaNotas = 0;
			for (double nota : asignaturas.values()) {
				sumaNotas += nota;
			}

			double notaMedia = sumaNotas / asignaturas.size();
			System.out.println("La nota media de " + nombreAlumno + " es: " + notaMedia);
		}
		scanner.close();
	}
}
