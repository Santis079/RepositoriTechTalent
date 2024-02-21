package UD5;

import javax.swing.JOptionPane;

public class T05_Extra_5 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Ingrese un número:");


        if (input.matches("\\d+")) {

            int numero = Integer.parseInt(input);

            boolean esPrimo = verificarPrimo(numero);

            JOptionPane.showMessageDialog(null, numero + (esPrimo ? " es un número primo." : " no es un número primo."));
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
        }
    }

    private static boolean verificarPrimo(int numero) {
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
}

