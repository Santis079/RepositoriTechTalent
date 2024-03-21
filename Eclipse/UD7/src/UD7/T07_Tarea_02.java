package UD7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T07_Tarea_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Producto> carrito = new ArrayList<>();

		String nombreProducto;
		double cantidad, precio;

		do {
			System.out.print("Ingrese el nombre del producto (o 'fin' para finalizar): ");
			nombreProducto = scanner.nextLine();

			if (!nombreProducto.equalsIgnoreCase("fin")) {
				System.out.print("Ingrese la cantidad del producto '" + nombreProducto + "': ");
				cantidad = scanner.nextDouble();

				System.out.print("Ingrese el precio del producto '" + nombreProducto + "': ");
				precio = scanner.nextDouble();
				scanner.nextLine();

				carrito.add(new Producto(nombreProducto, cantidad, precio));
			}
		} while (!nombreProducto.equalsIgnoreCase("fin"));

		System.out.print("Ingrese el porcentaje de IVA a aplicar (4 o 21): ");
		int porcentajeIVA = scanner.nextInt();

		if (porcentajeIVA != 4 && porcentajeIVA != 21) {
			System.out.println("Error: Porcentaje de IVA no válido. Se aplicará el 21% por defecto.");
			porcentajeIVA = 21;
		}

		double iva = porcentajeIVA / 100.0;
		double precioTotalBruto = calcularPrecioTotal(carrito);
		double precioTotalConIVA = precioTotalBruto * (1 + iva);

		System.out.println("\nInformación de la Venta:");
		System.out.println("IVA Aplicado: " + porcentajeIVA + "%");
		System.out.println("Precio Total Bruto: " + round(precioTotalBruto, 2) + " €");
		System.out.println("Precio Total con IVA: " + round(precioTotalConIVA, 2) + " €");
		System.out.println("Número de Artículos Comprados: " + carrito.size());

		System.out.print("Ingrese la cantidad pagada por el cliente: ");
		double cantidadPagada = scanner.nextDouble();

		double cambio = cantidadPagada - precioTotalConIVA;
		System.out.println("Cambio a Devolver: " + round(cambio, 2) + " €");

		scanner.close();
	}

	private static double calcularPrecioTotal(List<Producto> carrito) {
		double precioTotal = 0;
		for (Producto producto : carrito) {
			precioTotal += producto.getCantidad() * producto.getPrecio();
		}
		return precioTotal;
	}

	private static class Producto {
		private double cantidad;
		private double precio;

		public Producto(String nombre, double cantidad, double precio) {
			this.cantidad = cantidad;
			this.precio = precio;
		}

		public double getCantidad() {
			return cantidad;
		}

		public double getPrecio() {
			return precio;
		}
	}

	private static double round(double value, int places) {
		double scale = Math.pow(10, places);
		return Math.round(value * scale) / scale; }}
	

