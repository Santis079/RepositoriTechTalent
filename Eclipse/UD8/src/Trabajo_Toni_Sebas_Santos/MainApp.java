package Trabajo_Toni_Sebas_Santos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MainApp {
	public static void main(String[] args) {

		Producto producto1 = new Producto("Huevos", 4.50, 50, 4);
		Producto producto2 = new Producto("Sal", 2.0, 15, 4);
		Producto producto3 = new Producto("Arroz", 2.50, 30, 4);
		Producto producto4 = new Producto("Atún", 6.0, 18, 4);
		Producto producto5 = new Producto("Fuet", 2.35, 13, 4);
		Producto producto6 = new Producto("Pan", 0.50, 10, 4);
		Producto producto7 = new Producto("Tomates", 4.50, 45, 4);
		Producto producto8 = new Producto("Pimientos", 4.95, 34, 4);
		Producto producto9 = new Producto("Ceboas", 4.80, 15, 4);
		Producto producto10 = new Producto("Ajos", 3.20, 35, 4);

		List<Producto> carrito = new ArrayList<>();

		while (true) {
			String opcion = JOptionPane.showInputDialog(null, "---- SuperMercado ----\n" + "1. Catalogo \n"
					+ "2. Comprar producto\n" + "3. Modo Admin\n" + "4. Salir\n" + "Seleccione una opción:");

			if (opcion == null) {
				return;
			}

			switch (opcion) {
			case "1":
				mostrarProductos(producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8,
						producto9, producto10);
				break;
			case "2":
				comprarProductos(producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8,
						producto9, producto10, carrito);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "Funcionalidad de modo admin aún no implementada.");
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "¡Hasta luego!");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			}
		}
	}

	private static void comprarProductos(Producto producto1, Producto producto2, Producto producto3, Producto producto4,
			Producto producto5, Producto producto6, Producto producto7, Producto producto8, Producto producto9,
			Producto producto10, List<Producto> carrito) {

		while (true) {
			String opcion2 = JOptionPane.showInputDialog(null,
					"---- Cesta Compra ----\n" + "1. Añadir Producto \n" + "2. Eliminar producto\n" + "3. Ver Cesta\n"
							+ "4. Realizar Compra\n" + "5. Volver al Menú Principal\n" + "Seleccione una opción:");

			if (opcion2 == null) {
				return;
			}

			switch (opcion2) {
			case "1":
				String nombreProducto = JOptionPane
						.showInputDialog("Ingrese el nombre del producto a agregar al carrito:");
				int cantidadAgregar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a agregar:"));

				// Buscar el producto por su nombre en el catálogo de productos
				Producto productoEnCatalogo = null;
				for (Producto producto : List.of(producto1, producto2, producto3, producto4, producto5, producto6,
						producto7, producto8, producto9, producto10)) {
					if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
						productoEnCatalogo = producto;
						break;
					}
				}

				// Verificar si se encontró el producto en el catálogo y si está disponible en
				// la cantidad solicitada
				if (productoEnCatalogo != null && productoEnCatalogo.getCantidadDisponible() >= cantidadAgregar) {
					// Agregar una nueva instancia del producto al carrito con la cantidad
					// especificada
					carrito.add(new Producto(productoEnCatalogo.getNombre(), productoEnCatalogo.getPrecio(),
							cantidadAgregar, productoEnCatalogo.getIva()));
					JOptionPane.showMessageDialog(null,
							"Se han añadido " + cantidadAgregar + " unidades de " + nombreProducto + " al carrito");
					// Reducir la cantidad disponible del producto en el catálogo
					productoEnCatalogo
							.setCantidadDisponible(productoEnCatalogo.getCantidadDisponible() - cantidadAgregar);
				} else {
					JOptionPane.showMessageDialog(null,
							"El producto no está disponible en el catálogo o no hay suficiente cantidad.");
				}

				break;
			case "2":
				eliminarProductos(carrito);
				break;
			case "3":
				verCesta(carrito);
				break;
			case "4":
				realizarCompra(carrito);
				break;
			case "5":
				System.out.println("Salir");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			}
		}
	}

	private static void eliminarProductos(List<Producto> carrito) {
		if (carrito.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El carrito está vacío.");
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Productos en el carrito:\n");
		for (int i = 0; i < carrito.size(); i++) {
			sb.append(i + 1).append(". ").append(carrito.get(i).getNombre()).append("\n");
		}

		int indexToDelete;
		try {
			indexToDelete = Integer.parseInt(JOptionPane.showInputDialog(null,
					sb.toString() + "Ingrese el número del producto que desea eliminar:")) - 1;
		} catch (NumberFormatException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un número válido.");
			return;
		}

		if (indexToDelete < 0 || indexToDelete >= carrito.size()) {
			JOptionPane.showMessageDialog(null, "Número de producto no válido.");
			return;
		}

		Producto productoEliminado = carrito.remove(indexToDelete);
		JOptionPane.showMessageDialog(null, "Se ha eliminado " + productoEliminado.getNombre() + " del carrito.");
	}

	private static void verCesta(List<Producto> carrito) {
		if (carrito.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El carrito está vacío.");
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Productos en el carrito:\n");
		for (Producto producto : carrito) {
			sb.append("- ").append(producto.getNombre()).append(": ").append(producto.getCantidadDisponible())
					.append(" unidad(es)\n");
		}

		JOptionPane.showMessageDialog(null, sb.toString());
	}

	private static void realizarCompra(List<Producto> carrito) {
	    if (carrito.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "El carrito está vacío.");
	        return;
	    }

	    double total = 0.0;
	    StringBuilder sb = new StringBuilder();
	    sb.append("Productos en el carrito:\n");
	    for (Producto producto : carrito) {
	        double precioConIva = producto.getPrecio() * (1 + (producto.getIva() / 100.0));
	        total += precioConIva * producto.getCantidadDisponible();
	        sb.append("- ").append(producto.getNombre()).append(": ").append(producto.getCantidadDisponible())
	                .append(" unidad(es) - Precio con IVA: ").append(String.format("%.2f", precioConIva)).append("€\n");

	        // Ajustar la cantidad disponible del producto en el catálogo
	        producto.setCantidadDisponible(0);
	    }

	    // Redondear el total a dos decimales
	    total = Math.round(total * 100.0) / 100.0;
	    sb.append("\nTotal a pagar: ").append(String.format("%.2f", total)).append("€\n");

	    String modoPago = JOptionPane
	            .showInputDialog(null, sb.toString() + "Seleccione el modo de pago (Efectivo/Tarjeta):").toUpperCase();

	    switch (modoPago) {
	        case "EFECTIVO":
	            double efectivoEntregado = Double
	                    .parseDouble(JOptionPane.showInputDialog("Introduzca el monto entregado:"));
	            double cambio = efectivoEntregado - total;
	            // Redondear el cambio a dos decimales
	            cambio = Math.round(cambio * 100.0) / 100.0;
	            if (cambio >= 0) {
	                JOptionPane.showMessageDialog(null, "Pago recibido. Su cambio es: " + cambio);
	            } else {
	                JOptionPane.showMessageDialog(null, "La cantidad entregada es insuficiente.");
	            }
	            break;
	        case "TARJETA":
	            JOptionPane.showMessageDialog(null, "Pago con tarjeta realizado.");
	            break;
	        default:
	            JOptionPane.showMessageDialog(null,
	                    "Método de pago no reconocido (Ingrese 'Efectivo' o 'Tarjeta' la próxima vez).");
	            break;
	    }
	    // Limpiar el carrito después de la compra
	    carrito.clear();
	}



	private static void mostrarProductos(Producto... productos) {
		StringBuilder productosInfo = new StringBuilder();
		productosInfo.append("Lista de productos:\n");
		productosInfo.append("---Catalogo del Supermercado---\n");
		productosInfo.append("----------------------------------------------\n");
		for (Producto producto : productos) {
			if (producto.getCantidadDisponible() > 0) {
				productosInfo.append(producto.getNombre()).append("   ").append(producto.getPrecio()).append("€  ")
						.append("IVA del ").append(producto.getIva()).append("% no aplicado").append("\n");
			}
		}
		JOptionPane.showMessageDialog(null, productosInfo.toString());
	}
}
