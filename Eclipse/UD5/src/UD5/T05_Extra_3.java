package UD5;

import javax.swing.JOptionPane;

public class T05_Extra_3 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(input);

        if (numero >= 0) {
            int suma = 0;
            for (int i = numero; i>0; i--) {
                suma += i;
            }

            JOptionPane.showMessageDialog(null, "La suma de los números anteriores al " + numero + " es: " + suma);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número positivo.");
        }
    }
}


