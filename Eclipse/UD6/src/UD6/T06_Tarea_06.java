package UD6;

import java.util.Scanner;

public class T06_Tarea_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Di un numero entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, di un numero entero positivo.");
        } else {
            int cantidadDigitos = contarDigitos(numero);
            System.out.println("El numero de digitos en " + numero + " es: " + cantidadDigitos);
        }

        scanner.close();
    }

    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; 
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}
