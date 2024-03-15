package UD8;
public class Frutas {
	
	public String nombre;
	public String color;
	public double precio;
	
	

	public Frutas() {
		this.nombre="";
		this.color="";
		this.precio=0.0;
		
	}
	

	public Frutas(String nombre) {
		this.nombre = nombre;
		this.color="";
		this.precio=0.0;
	}
	
	public Frutas(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	

	public Frutas(String nombre, String color, double precio) {
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}



	public static void main(String[] args) {
		
		
		Frutas manzana = new Frutas();
		Frutas platano = new Frutas("Platano");
		Frutas arandanos = new Frutas("Arandanos","lila");
		Frutas albaricoque = new Frutas("Albaricoque","naranja",10.15);

		System.out.println("Mi primera fruta tiene el nombre:" + manzana.nombre
				+ ", tiene un color igual a " + manzana.color 
				+ "y un precio de " + manzana.precio +"€");
		System.out.println("Mi primera fruta tiene el nombre:" + platano.nombre
				+ ", tiene un color igual a " + platano.color 
				+ "y un precio de " + platano.precio +"€");
		System.out.println("Mi primera fruta tiene el nombre:" + arandanos.nombre
				+ ", tiene un color igual a " + arandanos.color 
				+ "y un precio de " + arandanos.precio +"€");
		System.out.println("Mi primera fruta tiene el nombre:" + albaricoque.nombre
				+ ", tiene un color igual a " + albaricoque.color 
				+ " y un precio de " + albaricoque.precio +"€");

	}

}
