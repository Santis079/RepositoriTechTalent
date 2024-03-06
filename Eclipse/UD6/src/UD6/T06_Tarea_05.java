package UD6;

import java.util.Scanner;

public class T06_Tarea_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Di un numero decimal: ");
        
        int numeroDecimal = scanner.nextInt();

        String binario = convertirABinario(numeroDecimal);

        System.out.println("El numero " +numeroDecimal +" en binario es: " + binario);

        scanner.close();
    }

    private static String convertirABinario(int numeroDecimal) {
        if (numeroDecimal == 0) {
            return "0";
        }

        StringBuilder resultado = new StringBuilder();

        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            resultado.insert(0, residuo);
            numeroDecimal /= 2;
        }

        return resultado.toString();
    }
}
