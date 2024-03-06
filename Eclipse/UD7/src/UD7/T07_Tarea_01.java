package UD7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T07_Tarea_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un HashMap para almacenar la nota media de cada alumno
        Map<String, Double> notasMedias = new HashMap<>();

        // Solicitar la entrada de datos del usuario
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Procesar la información de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la nota del alumno " + nombre + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Calcular la nota media y almacenar en el diccionario
            double notaMedia = calcularNotaMedia(notasMedias.getOrDefault(nombre, 0.0), nota, i + 1);
            notasMedias.put(nombre, notaMedia);
        }

        // Mostrar la nota media de cada alumno
        System.out.println("\nNotas Medias:");
        for (Map.Entry<String, Double> entry : notasMedias.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // Método para calcular la nota media acumulativa
    private static double calcularNotaMedia(double notaMediaAcumulativa, double nuevaNota, int numNotas) {
        return (notaMediaAcumulativa * (numNotas - 1) + nuevaNota) / numNotas;
    }
}
