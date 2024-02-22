package UD6;

import javax.swing.JOptionPane;

public class T06_Tarea_03 {

    public static void main(String[] args) {
      
        String pidenumeros= JOptionPane.showInputDialog("Ingrese un numero:");
        
        int numero = Integer.parseInt(pidenumeros);

        if (esPrimo(numero)) {
            JOptionPane.showMessageDialog(null, numero + " es un numero primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un numero primo.");
        }
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
}
