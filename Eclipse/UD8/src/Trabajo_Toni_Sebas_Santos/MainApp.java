package Trabajo_Toni_Sebas_Santos;

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
                    JOptionPane.showMessageDialog(null, "Funcionalidad de compra aún no implementada.");
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

