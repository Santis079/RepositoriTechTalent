package UD5;
import javax.swing.JOptionPane;

public class UD5_marc {

	public static void main(String[] args) {

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showInternalMessageDialog(null, 
				"Bien, tu nombre es " + nombre);

	}

}