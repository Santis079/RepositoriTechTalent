package UD7;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class T07_Tarea_04 {
	private static final String ADMIN_CONTRA = "supersaiyans";

	public static void main(String[] args) {

		Map<String, Map<String, Object>> stockProductos = new HashMap<>();
		inicializarBaseDeDatos(stockProductos);

		Map<String, Integer> carrito = new HashMap<>();

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
				listarProductos(stockProductos);
				break;
			case "2":
				comprarProducto(stockProductos, carrito);
				break;
			case "3":
				realizarVenta(stockProductos, carrito);
				break;
			case "4":
				modoAdmin(stockProductos);
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "¡Hasta luego!");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			}
		}
	}

	private static void inicializarBaseDeDatos(Map<String, Map<String, Object>> stockProductos) {

		agregarProducto(stockProductos, "Manzanas", 20, 2.5);
		agregarProducto(stockProductos, "Plátanos", 15, 1.8);
		agregarProducto(stockProductos, "Leche", 30, 1.2);
		agregarProducto(stockProductos, "Pan", 25, 0.9);
		agregarProducto(stockProductos, "Huevos", 40, 3.0);
		agregarProducto(stockProductos, "Arroz", 50, 1.5);
		agregarProducto(stockProductos, "Aceite", 35, 2.8);
		agregarProducto(stockProductos, "Azúcar", 45, 1.0);
		agregarProducto(stockProductos, "Sal", 40, 0.8);
		agregarProducto(stockProductos, "Café", 20, 4.0);
	}

	private static void agregarProducto(Map<String, Map<String, Object>> stockProductos, String nombre, int cantidad,
			double precio) {
		Map<String, Object> productoInfo = new HashMap<>();
		productoInfo.put("cantidad", cantidad);
		productoInfo.put("precio", precio);
		stockProductos.put(nombre, productoInfo);
	}

	private static void listarProductos(Map<String, Map<String, Object>> stockProductos) {
		StringBuilder listaProductos = new StringBuilder();
		listaProductos.append("--- Productos Disponibles ---\n");
		for (Map.Entry<String, Map<String, Object>> entry : stockProductos.entrySet()) {
			String nombreProducto = entry.getKey();
			Map<String, Object> productoInfo = entry.getValue();
			int cantidad = (int) productoInfo.get("cantidad");
			double precio = (double) productoInfo.get("precio");
			listaProductos.append(nombreProducto).append(" - Cantidad: ").append(cantidad).append(", Precio: €")
					.append(precio).append("\n");
		}
		JOptionPane.showMessageDialog(null, listaProductos.toString());
	}

	private static void comprarProducto(Map<String, Map<String, Object>> stockProductos, Map<String, Integer> carrito) {
		String nombreProducto = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto que desea comprar:");
		if (nombreProducto == null) {
			return;
		}

		if (!stockProductos.containsKey(nombreProducto)) {
			JOptionPane.showMessageDialog(null, "Producto no encontrado.");
			return;
		}

		Map<String, Object> productoInfo = stockProductos.get(nombreProducto);
		int cantidadDisponible = (int) productoInfo.get("cantidad");

		String cantidadCompraStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea comprar:");
		if (cantidadCompraStr == null) {
			return;
		}
		int cantidadCompra;
		cantidadCompra = Integer.parseInt(cantidadCompraStr);

		if (cantidadCompra <= 0 || cantidadCompra > cantidadDisponible) {
			JOptionPane.showMessageDialog(null, "Cantidad no válida o insuficiente stock.");
			return;
		}

		carrito.put(nombreProducto, carrito.getOrDefault(nombreProducto, 0) + cantidadCompra);
		JOptionPane.showMessageDialog(null, "Producto agregado al carrito.");
	}

	private static void realizarVenta(Map<String, Map<String, Object>> stockProductos, Map<String, Integer> carrito) {
		if (carrito.isEmpty()) {
			JOptionPane.showMessageDialog(null, "El carrito está vacío. No se puede realizar la venta.");
			return;
		}

		double totalVenta = 0.0;
		for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
			String nombreProducto = entry.getKey();
			int cantidadCompra = entry.getValue();
			Map<String, Object> productoInfo = stockProductos.get(nombreProducto);
			double precio = (double) productoInfo.get("precio");
			totalVenta += precio * cantidadCompra;
			int cantidadDisponible = (int) productoInfo.get("cantidad");
			productoInfo.put("cantidad", cantidadDisponible - cantidadCompra);
		}

		JOptionPane.showMessageDialog(null, "Total a pagar: €" + totalVenta);

		String cantidadPagadaStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad pagada por el cliente:");
		if (cantidadPagadaStr == null) {
			return;
		}
		double cantidadPagada;
		cantidadPagada = Double.parseDouble(cantidadPagadaStr);

		double cambio = cantidadPagada - totalVenta;
		if (cambio >= 0) {
			JOptionPane.showMessageDialog(null, "Cambio a devolver: €" + cambio);
			carrito.clear();
		} else {
			JOptionPane.showMessageDialog(null, "Cantidad insuficiente. Venta cancelada.");
		}
	}

	private static void modoAdmin(Map<String, Map<String, Object>> stockProductos) {
		String password = JOptionPane.showInputDialog(null, "Ingrese la contraseña de administrador:");
		if (password == null || !password.equals(ADMIN_CONTRA)) {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta. No tiene acceso al modo administrador.");
			return;
		}

		while (true) {
			String opcion = JOptionPane.showInputDialog(null,
					"---- Modo Administrador ----\n" + "1. Ver total de productos\n" + "2. Editar lista de productos\n"
							+ "3. Salir del modo administrador\n" + "Seleccione una opción:");
			if (opcion == null) {
				return;
			}

			switch (opcion) {
			case "1":
				listarProductos(stockProductos);
				break;
			case "2":
				editarProductos(stockProductos);
				break;
			case "3":
				return;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
			}
		}
	}

	private static void editarProductos(Map<String, Map<String, Object>> stockProductos) {
		String opcion = JOptionPane.showInputDialog(null, "--- Editar lista de productos ---\n"
				+ "1. Agregar producto\n" + "2. Eliminar producto\n" + "Seleccione una opción:");
		if (opcion == null) {
			return;
		}

		switch (opcion) {
		case "1":
			agregarProductoAdmin(stockProductos);
			break;
		case "2":
			eliminarProductoAdmin(stockProductos);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
		}
	}

	private static void agregarProductoAdmin(Map<String, Map<String, Object>> stockProductos) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo producto:");
		if (nombre == null) {
			return;
		}
		String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad del nuevo producto:");
		if (cantidadStr == null) {
			return;
		}
		int cantidad;
		cantidad = Integer.parseInt(cantidadStr);
		String precioStr = JOptionPane.showInputDialog(null, "Ingrese el precio del nuevo producto:");
		if (precioStr == null) {
			return;
		}
		double precio;
		precio = Double.parseDouble(precioStr);
		agregarProducto(stockProductos, nombre, cantidad, precio);
		JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
	}

	private static void eliminarProductoAdmin(Map<String, Map<String, Object>> stockProductos) {
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto que desea eliminar:");
		if (nombre == null) {
			return;
		}
		if (stockProductos.containsKey(nombre)) {
			stockProductos.remove(nombre);
			JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
		} else {
			JOptionPane.showMessageDialog(null, "El producto no existe en la lista.");
		}
	}
}
