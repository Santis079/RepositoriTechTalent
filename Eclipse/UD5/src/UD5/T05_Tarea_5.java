package UD5;
import javax.swing.JOptionPane;

public class T05_Tarea_5 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingresa un número entero:");

        int numero = Integer.parseInt(input);

        String mensaje;
        if (numero % 2 == 0) {
            mensaje = "El número " + numero + " es divisible por 2.";
        } else {
            mensaje = "El número " + numero + " no es divisible por 2.";
        }

        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
