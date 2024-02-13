package UD5;
import javax.swing.JOptionPane;

public class T05_Tarea_11 {

    public static void main(String[] args) {
        String contraseña = "miContraseña123";

        int intentos = 3;

        while (intentos > 0) {
            String introduce = JOptionPane.showInputDialog("Introduce la contraseña:");

            if (introduce != null && introduce.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "¡Enhorabuena! Contraseña correcta.");
                break;
            } else {
                intentos--;
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            JOptionPane.showMessageDialog(null, "Se agotaron los intentos. La aplicación se cerrará.");
        }
    }
}

