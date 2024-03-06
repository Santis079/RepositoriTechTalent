package UD6;

import java.util.Scanner;

public class T06_Tarea_08 {

    public static void main(String[] args) {
        int[] array = new int[10];

        rellenarArray(array);
        mostrarArray(array);
    }

    private static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Di 10 numeros para llenar el array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Di el valor de la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }

    private static void mostrarArray(int[] array) {
        System.out.println("\nLos numeros en el array son:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }
    }
}

