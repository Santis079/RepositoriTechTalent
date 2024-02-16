package UD6;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Buscaminas!");
        System.out.print("Ingrese el tamaño del tablero (n x n): ");
        int tamañoTablero = scanner.nextInt();

        char[][] tablero = crearTablero(tamañoTablero);
        colocarMinas(tablero, tamañoTablero);
        mostrarTablero(tablero);

        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.print("Ingrese la fila: ");
            int fila = scanner.nextInt();

            System.out.print("Ingrese la columna: ");
            int columna = scanner.nextInt();

            juegoTerminado = revelarCasilla(tablero, fila, columna, tamañoTablero);

            if (juegoTerminado) {
                System.out.println("¡Juego Terminado! Has perdido.");
            } else {
                mostrarTablero(tablero);
            }
        }

        scanner.close();
    }

    // Método para crear el tablero
    private static char[][] crearTablero(int tamaño) {
        return new char[tamaño][tamaño];
    }

    // Método para colocar minas aleatoriamente en el tablero
    private static void colocarMinas(char[][] tablero, int tamaño) {
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            int fila = random.nextInt(tamaño);
            int columna = random.nextInt(tamaño);

            tablero[fila][columna] = 'M';
        }
    }

    // Método para mostrar el tablero
    private static void mostrarTablero(char[][] tablero) {
        System.out.println("\nTablero:");

        for (char[] fila : tablero) {
            for (char c : fila) {
                if (c == 0) {
                    System.out.print("_ ");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }

    // Método para revelar una casilla del tablero
    private static boolean revelarCasilla(char[][] tablero, int fila, int columna, int tamaño) {
        if (tablero[fila][columna] == 'M') {
            return true; // Has tocado una mina, el juego termina
        }

        // Contar minas adyacentes y actualizar el tablero
        int minasAdyacentes = contarMinasAdyacentes(tablero, fila, columna, tamaño);
        tablero[fila][columna] = Character.forDigit(minasAdyacentes, 10);

        return false;
    }

    // Método para contar minas adyacentes a una casilla
    private static int contarMinasAdyacentes(char[][] tablero, int fila, int columna, int tamaño) {
        int contadorMinas = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nuevaFila = fila + i;
                int nuevaColumna = columna + j;

                if (nuevaFila >= 0 && nuevaFila < tamaño && nuevaColumna >= 0 && nuevaColumna < tamaño
                        && tablero[nuevaFila][nuevaColumna] == 'M') {
                    contadorMinas++;
                }
            }
        }

        return contadorMinas;
    }
}
