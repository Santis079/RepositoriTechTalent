package UD8;

//Declaración de la interfaz
interface Forma {
 double area(); // Método abstracto para calcular el área
 double perimetro(); // Método abstracto para calcular el perímetro
}

//Clase que implementa la interfaz Forma para un círculo
class Circulo implements Forma {
 private double radio;

 public Circulo(double radio) {
     this.radio = radio;
 }

 // Implementación del método area para calcular el área de un círculo
 @Override
 public double area() {
     return Math.PI * radio * radio;
 }

 // Implementación del método perimetro para calcular el perímetro de un círculo
 @Override
 public double perimetro() {
     return 2 * Math.PI * radio;
 }
}

//Clase que implementa la interfaz Forma para un rectángulo
class Rectangulo implements Forma {
 private double lado1;
 private double lado2;

 public Rectangulo(double lado1, double lado2) {
     this.lado1 = lado1;
     this.lado2 = lado2;
 }

 // Implementación del método area para calcular el área de un rectángulo
 @Override
 public double area() {
     return lado1 * lado2;
 }

 // Implementación del método perimetro para calcular el perímetro de un rectángulo
 @Override
 public double perimetro() {
     return 2 * (lado1 + lado2);
 }
}

//Clase principal con el método main para probar las clases anteriores
public class ClaseProfe {
 public static void main(String[] args) {
     Circulo circulo = new Circulo(5);
     System.out.println("Área del círculo: " + circulo.area());
     System.out.println("Perímetro del círculo: " + circulo.perimetro());

     Rectangulo rectangulo = new Rectangulo(4, 6);
     System.out.println("Área del rectángulo: " + rectangulo.area());
     System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
 }
}