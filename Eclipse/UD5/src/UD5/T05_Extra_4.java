package UD5;

import javax.swing.JOptionPane;

public class T05_Extra_4 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número:");
        
        int numero = Integer.parseInt(input);

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, numero + " es un número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número primo.");
        }
    }
}

