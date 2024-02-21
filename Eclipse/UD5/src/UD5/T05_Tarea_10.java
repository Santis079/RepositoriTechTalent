package UD5;
import javax.swing.JOptionPane;

public class T05_Tarea_10 {

    public static void main(String[] args) {
    	
        int VentasNumerito = cogerint("numero de ventas: ");

        double sumaVentas = 0.0;

        for (int i = 1; i <= VentasNumerito; i++) {
            double venta = cogerdouble("Ingrese la venta #" + i + ":");
            sumaVentas += venta;
        }
 
        JOptionPane.showMessageDialog(null, "La suma de todas las ventas es: " + sumaVentas +"€");
    }

    private static int cogerint(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static double cogerdouble(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}