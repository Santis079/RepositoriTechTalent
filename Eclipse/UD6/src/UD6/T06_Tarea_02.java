package UD6;

import javax.swing.JOptionPane;
import java.util.Random;

public class T06_Tarea_02 {

    public static void main(String[] args) {
        int minimo = numerito("Ingrese el valor mínimo del rango:");
        int maximo = numerito("Ingrese el valor máximo del rango:");

        int cuantos = numerito2("Ingrese la cantidad de números a generar:");

        Random(minimo, maximo, cuantos);
    }

    // Método para generar números aleatorios en el rango especificado
    private static void Random(int minimo, int maximo, int cantidad) {
        Random random = new Random();

        System.out.println("Números aleatorios generados:");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt((maximo - minimo) + 1) + minimo;
            System.out.println(numeroAleatorio);
        }
    }

    // Método para obtener un número entero del usuario
    private static int numerito2(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    // Método para obtener un número del usuario
    private static int numerito(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
