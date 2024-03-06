package UD6;

import java.util.Scanner;

public class T06_Tarea_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos euros quieres convertir? ");
        double cantidadEuros = scanner.nextDouble();

        System.out.print("En que divisa los quieres? (DOLAR, LIBRA, YEN): ");
        scanner.nextLine();
        String monedaDestino = scanner.nextLine().toUpperCase();

        double resultado = convertirDivisa(cantidadEuros, monedaDestino);

        if (resultado == -1) {
            System.out.println("Error no se puede cambiar.");
        } else {
            System.out.println(+cantidadEuros + "v€ son: " +resultado +" " +monedaDestino );
        }

        scanner.close();
    }

    private static double convertirDivisa(double cantidadEuros, String monedaDestino) {
        switch (monedaDestino) {
            case "DOLAR":
                return cantidadEuros * 1.206;
            case "LIBRA":
                return cantidadEuros * 0.86;
            case "YEN":
                return cantidadEuros * 129.852;
            default:
                return -1;
        }
    }
}
