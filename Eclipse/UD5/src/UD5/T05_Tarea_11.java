package UD5;

import javax.swing.JOptionPane;

public class T05_Tarea_11 {

    public static void main(String[] args) {
        String diaSemanaString = JOptionPane.showInputDialog("Inserte un dia de la semana:");

        String mensajeResultado;

        switch (diaSemanaString.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                mensajeResultado = "Es un dia laboral.";
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                mensajeResultado = "No es un dia laboral.";
                break;
            default:
                mensajeResultado = "Dia no valido.";
                break;
        }

        JOptionPane.showMessageDialog(null, mensajeResultado);
    }
}

