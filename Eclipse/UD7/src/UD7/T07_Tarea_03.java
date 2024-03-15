package UD7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T07_Tarea_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Base de Datos:");
        System.out.println("Empecemos");

        Map<String, Map<String, Object>> productosMap = new HashMap<>();
        baseDeDatos(productosMap);

        System.out.println("Perfecto!");

        while (true) {
            System.out.println("\n---- Menú Principal ----");
            System.out.println("\n--- ¿Qué quieres hacer? ---");
            System.out.println("1. Añadir artículo");
            System.out.println("2. Consultar artículo");
            System.out.println("3. Listar todos los artículos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    anadirArticulo(productosMap, scanner);
                    break;
                case "2":
                    consultarArticulo(productosMap, scanner);
                    break;
                case "3":
                    mostrarListaProductos(productosMap);
                    break;
                case "4":
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void mostrarListaProductos(Map<String, Map<String, Object>> productosMap) {
        System.out.println("Lista de todos los productos:");
        for (Map.Entry<String, Map<String, Object>> entry : productosMap.entrySet()) {
            String producto = entry.getKey();
            if (!producto.startsWith("producto")) {
                Map<String, Object> datos = entry.getValue();
                int cantidad = (int) datos.get("cantidad");
                double precio = (double) datos.get("precio");

                System.out.println("Producto: " + producto + ", Cantidad: " + cantidad + ", Precio: €" + precio);
            }
        }
    }


    private static void anadirArticulo(Map<String, Map<String, Object>> productosMap, Scanner scanner) {
        System.out.print("Introduzca el nombre del nuevo producto: ");
        String nombreProducto = scanner.nextLine();

        if (productosMap.containsKey(nombreProducto)) {
            System.out.println("El producto ya existe en la base de datos.");
            return;
        }

        Map<String, Object> datosProducto = new HashMap<>();

        System.out.print("Introduzca la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        datosProducto.put("cantidad", cantidad);

        System.out.print("Introduzca el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        datosProducto.put("precio", precio);

        productosMap.put(nombreProducto, datosProducto);

        System.out.println("Producto añadido correctamente.");
    }

    private static void consultarArticulo(Map<String, Map<String, Object>> productosMap, Scanner scanner) {
        System.out.print("Introduzca el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        if (productosMap.containsKey(nombreProducto)) {
            Map<String, Object> datosProducto = productosMap.get(nombreProducto);
            int cantidad = (int) datosProducto.get("cantidad");
            System.out.println("Nos quedan " +cantidad + " articulos de el producto " + nombreProducto);
        } else {
            System.out.println("El producto no existe en la base de datos.");
        }
    }

    public static void baseDeDatos(Map<String, Map<String, Object>> productosMap) {
        Map<String, Object> datosProductos = new HashMap<>();

        datosProductos.put("cantidad", 10);
        datosProductos.put("precio", 10.5);
        productosMap.put("producto1", datosProductos);

        datosProductos = new HashMap<>();
        datosProductos.put("cantidad", 5);
        datosProductos.put("precio", 20.75);
        productosMap.put("producto2", datosProductos);

    }
}


