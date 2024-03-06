package UD6;

import javax.swing.JOptionPane;

public class T06_Tarea_04 {

    public static void main(String[] args) {

        int numero = NumEntero("Di un numero para calcular su factorial:");

        long factorial = calcularFactorial(numero);

        if (factorial != -1) {
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
        } else {
            JOptionPane.showMessageDialog(null, "Error no es un numero positivo o ha desbordado el programa");
        }
    }

    private static long calcularFactorial(int numero) {
        if (numero < 0) {
            return -1;
        }

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {

            if (Long.MAX_VALUE / i < resultado) {
                return -1;
            }

            resultado *= i;
        }

        return resultado;
    }

    private static int NumEntero(String mensaje) {
        String TeikaNambah = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(TeikaNambah);
    }
}
