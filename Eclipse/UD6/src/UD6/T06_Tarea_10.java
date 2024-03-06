package UD6;

import java.util.Random;
import java.util.Scanner;

public class T06_Tarea_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("De cuanto quieres el array? ");
        int tamanoArray = scanner.nextInt();

        int[] array = llenarArrayDePrimosRandoms(tamanoArray);

        System.out.println("Los primos random del array son:");
        mostrarArray(array);

        int mayor = encontrarMayor(array);
        System.out.println("El numero mas grande del array es el " + mayor);

        scanner.close();
    }

    private static int[] llenarArrayDePrimosRandoms(int tamanoArray) {
        int[] array = new int[tamanoArray];
        Random random = new Random();

        for (int i = 0; i < tamanoArray; i++) {
            array[i] = generarPrimoAleatorio(random);
        }

        return array;
    }

    private static int generarPrimoAleatorio(Random random) {
        int numeroAleatorio;
        do {
            numeroAleatorio = random.nextInt(100) + 1; 
        } while (!esPrimo(numeroAleatorio));

        return numeroAleatorio;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }
    }

    private static int encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}


