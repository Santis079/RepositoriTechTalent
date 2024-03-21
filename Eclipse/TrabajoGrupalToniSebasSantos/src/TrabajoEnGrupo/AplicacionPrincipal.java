package TrabajoEnGrupo;

import javax.swing.JOptionPane;

public class AplicacionPrincipal {

	public static void main(String[] args) {
		
		while (true) {
			String opcion = JOptionPane.showInputDialog(null,
					"---- Menú Principal ----\n" + "1. Ver lista de productos\n" + "2. Comprar producto\n"
							+ "3. Realizar venta\n" + "4. Modo Administrador\n" + "5. Salir\n"
							+ "Seleccione una opción:");

			if (opcion == null) {

				return;
			}

			switch (opcion) {
			case "1":
				System.out.println("lista de productos");
				//que se muestre el catalogo y ale 
				break;
			case "2":
				System.out.println("Comprar productos");
				//que se muestre el catalogo y que puedas escrubir que quieres
				
				
				break;
			case "3":
				System.out.println("realizar venta");
				//que liste el carrito que se cree te diga el precio total te pregunte con cuanto ha pagado te de el cambio y lo descuente del stock
				
				break;
			case "4":
				System.out.println("Admin");
				//que llame a un metodo que acceda a un submenu que te permita editar al base de datos
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "¡Hasta luego!");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			}
		}
	}

	}

