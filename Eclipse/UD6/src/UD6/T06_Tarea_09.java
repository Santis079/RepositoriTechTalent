package UD6;

import javax.swing.JOptionPane;

public class T06_Tarea_09 {

    public static void main(String[] args) {
      
        int tamañoArray = obtenerNumeroEntero("Ingrese el tamaño del array:");

        int[] array = new int[tamañoArray];

        llenarArrayConAleatorios(array);

        mostrarArrayYSuma(array);
    }

    private static void llenarArrayConAleatorios(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void mostrarArrayYSuma(int[] array) {
        System.out.println("Índice\tValor");

        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
            suma += array[i];
        }

        System.out.println("\nLa suma de todos los valores es: " + suma);
    }

    private static int obtenerNumeroEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
