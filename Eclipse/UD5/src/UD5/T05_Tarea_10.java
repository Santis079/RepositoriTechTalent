package UD5;
import javax.swing.JOptionPane;

public class T05_Tarea_10 {

    public static void main(String[] args) {
        // Pedir al usuario el número de ventas a introducir
        int VentasNumerito = cogerint("numerodeventas:");

        // Inicializar la variable para la suma de ventas
        double sumaVentas = 0.0;

        // Pedir al usuario las ventas y sumarlas
        for (int i = 1; i <= VentasNumerito; i++) {
            double venta = obtenerNumeroReal("Ingrese la venta #" + i + ":");
            sumaVentas += venta;
        }

        // Mostrar la suma de todas las ventas
        JOptionPane.showMessageDialog(null, "La suma de todas las ventas es: " + sumaVentas);
    }

    // Método para obtener un número entero del usuario
    private static int cogerint(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    // Método para obtener un número real del usuario
    private static double obtenerNumeroReal(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}

