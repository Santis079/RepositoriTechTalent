package UD5;

import javax.swing.JOptionPane;

public class T05_Tarea_06 {
    public static void main(String[] args) {
     final double TASA_IVA = 0.21;

       String Presio = JOptionPane.showInputDialog("Cuanto cuesta? ");
          
       double precio = Double.parseDouble(Presio);

            double precioFinal = precio + (precio * TASA_IVA);

            JOptionPane.showMessageDialog(null, "El precio final con IVA es: " + precioFinal +"€");

        }
    }
