package UD6;

import javax.swing.JOptionPane;

public class copiasumafactorial {

    public static void main(String[] args) {

        int numero = obtenerNumeroEntero("Ingrese un número para calcular su factorial:");

        long factorial = calcularFactorial(numero);
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }

    private static long calcularFactorial(int numero) {
        if (numero < 0) {
            return -1; 
        }

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    private static int obtenerNumeroEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
