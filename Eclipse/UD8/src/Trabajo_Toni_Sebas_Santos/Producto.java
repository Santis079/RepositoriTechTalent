package Trabajo_Toni_Sebas_Santos;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;
	private int iva;

    public Producto(String nombre, double precio, int cantidadDisponible, int iva) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public int getIva() {
        return iva;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible
				+ ", iva=" + iva + "]";
	}

    
}
