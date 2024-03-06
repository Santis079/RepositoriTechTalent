package UD6;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class T06_Tarea_11 {
    public static void main(String[] args) {
        int tamaño = obtenerTamañoArray();

        int[] array1 = new int[tamaño];
        int[] array2 = new int[tamaño];

        llenarArrayConNumerosAleatorios(array1);
        llenarArrayConNumerosAleatorios(array2);

        mostrarContenidoArray("Array 1", array1);
        mostrarContenidoArray("Array 2", array2);

        int[] arrayResultado = multiplicarArraysElementoPorElemento(array1, array2);

        mostrarContenidoArray("El resultado de la multipicacion de los arrays es \n ", arrayResultado);
    }

    private static int obtenerTamañoArray() {
        String input = JOptionPane.showInputDialog("Cuanto quieres que midan los arrays:");
        return Integer.parseInt(input);
    }

    private static void llenarArrayConNumerosAleatorios(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    private static void mostrarContenidoArray(String nombreArray, int[] array) {
        System.out.println(nombreArray + ": " + Arrays.toString(array));
    }

    private static int[] multiplicarArraysElementoPorElemento(int[] array1, int[] array2) {
        int[] arrayResultado = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrayResultado[i] = array1[i] * array2[i];
        }

        return arrayResultado;
    }
}
