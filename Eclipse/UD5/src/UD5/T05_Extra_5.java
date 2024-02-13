package UD5;

import javax.swing.JOptionPane;

public class T05_Extra_5 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        String input = JOptionPane.showInputDialog("Ingrese un número:");

        // Verificar si la entrada es un número válido
        if (input.matches("\\d+")) {
            // Convertir la cadena de entrada a un número entero
            int numero = Integer.parseInt(input);

            // Verificar si el número es primo
            boolean esPrimo = verificarPrimo(numero);

            // Mostrar el resultado con JOptionPane
            JOptionPane.showMessageDialog(null, numero + (esPrimo ? " es un número primo." : " no es un número primo."));
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
        }
    }

    // Método para verificar si un número es primo
    private static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // El número no es primo si tiene un divisor distinto de 1 y él mismo
                return false;
            }
        }

        // El número es primo si no tiene divisores distintos de 1 y él mismo
        return true;
    }
}

