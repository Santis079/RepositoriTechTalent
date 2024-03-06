package UD6;

import javax.swing.JOptionPane;
import java.util.Random;

public class T06_Tarea_02 {

    public static void main(String[] args) {
        int min = numerito("De que numero? :");
        int max = numerito("Hasta que numero? :");

        int cuantos = numerito2("Ingrese la cantidad de números a generar:");

        Random(min, max, cuantos);
    }

    private static void Random(int minimo, int maximo, int cantidad) {
        Random random = new Random();

        System.out.println("Números aleatorios generados:");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt((maximo - minimo) + 1) + minimo;
            System.out.println(numeroAleatorio);
        }
    }

    private static int numerito2(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static int numerito(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
