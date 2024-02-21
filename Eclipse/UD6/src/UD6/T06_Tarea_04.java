package UD6;

import javax.swing.JOptionPane;

public class T06_Tarea_04 {

    public static void main(String[] args) {

        int numero = obtenerNumeroEntero("Ingrese un número para calcular su factorial:");

        int factorial = calcularFactorial(numero);

        if (factorial != -1) {
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede calcular el factorial. Ingrese un número no negativo.");
        }
    }

    private static int calcularFactorial(int numero) {
        if (numero < 0) {
            return -1;
        }

        int resultado = 1;

        for (int i = 1; i <= numero; i++) {

            if (Integer.MAX_VALUE / i < resultado) {
                return -1;
            }

            resultado *= i;
        }

        return resultado;
    }


    private static int obtenerNumeroEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
