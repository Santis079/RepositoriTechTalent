package UD7;

//import java.util.HashMap;
//import java.util.Map;
//
//public class grupal234 {
//
//	private Map<String, Integer> carrito;
//    private double iva;
//
//    public grupal234() {
//        carrito = new HashMap<>();
//        iva = 0.21; // y
//    }
//
//    public void agregarProducto(String nombre, int cantidad) {
//        carrito.put(nombre, cantidad);
//    }
//
//    public double calcularTotalBruto(Map<String, Double> preciosUnitarios) {
//        double totalBruto = 0;
//        for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
//            String nombreProducto = entry.getKey();
//            int cantidad = entry.getValue();
//            double precioUnitario = preciosUnitarios.get(nombreProducto);
//            totalBruto += cantidad * precioUnitario;
//        }
//        return totalBruto;
//    }
//
//    public double calcularIVA(double totalBruto) {
//        return totalBruto * iva;
//    }
//
//    public double calcularTotalConIVA(double totalBruto) {
//        return totalBruto + calcularIVA(totalBruto);
//    }
//
//    public int calcularNumeroArticulos() {
//        int numeroArticulos = 0;
//        for (int cantidad : carrito.values()) {
//            numeroArticulos += cantidad;
//        }
//        return numeroArticulos;
//    }
//
//    public double procesarPago(double cantidadPagada, double totalConIVA) {
//        return cantidadPagada - totalConIVA;
//    }
//
//    public void mostrarInformacionVenta(double cantidadPagada, Map<String, Double> preciosUnitarios) {
//        double totalBruto = calcularTotalBruto(preciosUnitarios);
//        double totalConIVA = calcularTotalConIVA(totalBruto);
//        
//        System.out.println("IVA aplicado: " + (iva * 100) + "%");
//        System.out.println("Precio total bruto: " + totalBruto);
//        System.out.println("Precio total con IVA: " + totalConIVA);
//        System.out.println("Número de artículos comprados: " + calcularNumeroArticulos());
//        System.out.println("Cantidad pagada: " + cantidadPagada);
//        double cambio = procesarPago(cantidadPagada, totalConIVA);
//        System.out.println("Cambio a devolver al cliente: " + cambio);
//    }
//
//    public static void main1(String[] args) {
//        grupal234 caja = new grupal234();
//        caja.agregarProducto("Leche", 2);
//        caja.agregarProducto("Pan", 3);
//        caja.agregarProducto("Manzanas", 1);
//
//      
//        Map<String, Double> preciosUnitarios = new HashMap<>();
//        preciosUnitarios.put("Leche", 1.20);
//        preciosUnitarios.put("Pan", 0.80);
//        preciosUnitarios.put("Manzanas", 2.50);
//
//        double cantidadPagada = 10.0;
//        caja.mostrarInformacionVenta(cantidadPagada, preciosUnitarios);
//}
//}
//----------------------------------------------------------------------------------------------------------------
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class grupal234 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Double> carrito = new ArrayList<>();
//
//        agregarProductosAlCarrito(carrito, scanner);
//
//        calcularYMostrarInformacion(carrito, scanner);
//    }
//
//    private static void agregarProductosAlCarrito(List<Double> carrito, Scanner scanner) {
//        System.out.println("Bienvenido al supermercado");
//
//        while (true) {
//            System.out.print("Ingrese el precio del producto (o 0 para finalizar): ");
//            double precio = scanner.nextDouble();
//
//            if (precio == 0) {
//                break;
//            }
//
//            carrito.add(precio);
//        }
//    }
//
//    private static void calcularYMostrarInformacion(List<Double> carrito, Scanner scanner) {
//        double totalBruto = 0;
//
//        for (Double precio : carrito) {
//            totalBruto += precio;
//        }
//
//        System.out.print("Ingrese el tipo de IVA (21 o 4): ");
//        int tipoIVA = scanner.nextInt();
//        double porcentajeIVA;
//
//        if (tipoIVA == 21) {
//            porcentajeIVA = 0.21;
//        } else if (tipoIVA == 4) {
//            porcentajeIVA = 0.04;
//        } else {
//            porcentajeIVA = 0.21;
//        }
//
//        double iva = totalBruto * porcentajeIVA;
//
//        double precioTotalConIVA = totalBruto + iva;
//
//        System.out.println("\nResumen de compra:");
//        System.out.println("IVA aplicado: " + tipoIVA + "%");
//        System.out.println("Precio total bruto: " + totalBruto);
//        System.out.println("Precio total con IVA: " + precioTotalConIVA);
//
//        System.out.println("Número de artículos comprados: " + carrito.size());
//
//        System.out.print("Ingrese la cantidad pagada: ");
//        double cantidadPagada = scanner.nextDouble();
//
//        double cambio = cantidadPagada - precioTotalConIVA;
//
//        System.out.println("Cantidad pagada: " + cantidadPagada);
//        System.out.println("Cambio a devolver: " + cambio);
//
//        System.out.println("¡Gracias por su compra!");
//    }
//}
//----------------------------------------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class grupal234 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productos= new HashMap<>();

        BaseDeDatos(productos);

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Consultar stock");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarArticulo(productos, scanner);
                    break;
                case 2:
                    consultarStock(productos, scanner);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void BaseDeDatos(Map<String, Integer> stock) {

        stock.put("Producto1", 10);
        stock.put("Producto2", 5);
        stock.put("Producto3", 8);
        stock.put("Producto4", 15);
        stock.put("Producto5", 12);
        stock.put("Producto6", 7);
        stock.put("Producto7", 20);
        stock.put("Producto8", 9);
        stock.put("Producto9", 6);
        stock.put("Producto10", 11);
    }

    private static void agregarArticulo(Map<String, Integer> stock, Scanner scanner) {
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = scanner.next();

        System.out.print("Ingrese la cantidad a agregar: ");
        int cantidad = scanner.nextInt();

        if (stock.containsKey(nombre)) {
            stock.put(nombre, stock.get(nombre) + cantidad);
        } else {
            stock.put(nombre, cantidad);
        }

        System.out.println("Artículo agregado correctamente.");
    }

    private static void consultarStock(Map<String, Integer> stock, Scanner scanner) {
        System.out.print("Ingrese el nombre del artículo a consultar: ");
        String nombre = scanner.next();

        if (stock.containsKey(nombre)) {
            System.out.println("Stock de " + nombre + ": " + stock.get(nombre));
        } else {
            System.out.println("El artículo no está en el stock.");
        }
    }
}

