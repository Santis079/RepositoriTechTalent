package UD8;

public class T08_Tarea_03 {
	protected double precioBase;
	protected String color;
	protected char consum;
	protected double peso;

	public static final String COLORPORDEFECTO = "blanco";
	public static final char AFPORDEFECTO = 'F';
	public static final double PRECIOPORDEFECTO = 100;
	public static final double PESOPORDEFECTO = 5;

	public static final String[] COLORES_DISPONIBLES = { "blanco", "negro", "rojo", "azul", "gris" };

	// Por defecto
	public T08_Tarea_03() {
		this.precioBase = PRECIOPORDEFECTO;
		this.color = COLORPORDEFECTO;
		this.consum = AFPORDEFECTO;
		this.peso = PESOPORDEFECTO;
	}

	// Precio y peso
	public T08_Tarea_03(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLORPORDEFECTO;
		this.consum = AFPORDEFECTO;
		this.peso = peso;
	}

	// Con todo
	public T08_Tarea_03(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		colorinchi(color);
		consumotacto(consumoEnergetico);
		this.peso = peso;
	}

	private void colorinchi(String color) {
		boolean colorValido = false;
		for (String colorDisponible : COLORES_DISPONIBLES) {
			if (colorDisponible.equalsIgnoreCase(color)) {
				colorValido = true;
				break;
			}
		}
		if (colorValido) {
			this.color = color.toLowerCase();
		} else {
			this.color = COLORPORDEFECTO;
		}
	}

	private void consumotacto(char consumoEnergetico) {
		if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
			this.consum = consumoEnergetico;
		} else {
			this.consum = AFPORDEFECTO;
		}
	}

	@Override
	public String toString() {
		return "Precio Base: " + precioBase + "€, Color: " + color + ", Consumo Energético: " + consum + ", Peso: "
				+ peso + "kg";
	}

	public static void main(String[] args) {
		T08_Tarea_03 electrodomestico1 = new T08_Tarea_03();
		System.out.println(electrodomestico1);

		T08_Tarea_03 electrodomestico2 = new T08_Tarea_03(200, 10);
		System.out.println(electrodomestico2);

		T08_Tarea_03 electrodomestico3 = new T08_Tarea_03(150, "azul", 'A', 8);
		System.out.println(electrodomestico3);
	}
}
