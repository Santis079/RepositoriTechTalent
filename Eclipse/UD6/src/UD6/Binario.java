package UD6;

import javax.swing.JOptionPane;

public class Binario {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número decimal
        int numeroDecimal = obtenerNumeroEntero("Ingrese un número decimal:");

        // Convertir el número a binario y mostrar el resultado
        String numeroBinario = convertirDecimalABinario(numeroDecimal);
        JOptionPane.showMessageDialog(null, "El número binario es: " + numeroBinario);
    }

    // Método para convertir un número decimal a binario
    private static String convertirDecimalABinario(int numero) {
        if (numero == 0) {
            return "0"; // El binario de 0 es 0
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo); // Insertar el residuo al principio del StringBuilder
            numero /= 2;
        }

        return binario.toString();
    }

    // Método para obtener un número entero del usuario
    private static int obtenerNumeroEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}