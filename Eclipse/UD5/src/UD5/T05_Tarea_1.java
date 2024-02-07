package UD5;

public class T05_Tarea_1 {

	public static void main(String[] args) {
		int X=5;
		int Y=8;
			System.out.println("X es : " + X);
			System.out.println("Y es : " + Y);
			
			String pregunta=(X>Y) ? "X>Y"
                    : (X<Y) ? "Y<X"
                    : "X=Y";
			System.out.println(pregunta);

	}

}
public class ComparacionVariables {
    public static void main(String[] args) {
        // Declarar dos variables numéricas y asignarles valores
        int numero1 = 10;
        int numero2 = 5;

        // Mostrar los valores iniciales
        System.out.println("Valor de la variable 1: " + numero1);
        System.out.println("Valor de la variable 2: " + numero2);

        // Comparar las variables
        if (numero1 > numero2) {
            System.out.println("La variable 1 es mayor que la variable 2.");
        } else if (numero1 < numero2) {
            System.out.println("La variable 2 es mayor que la variable 1.");
        } else {
            System.out.println("Ambas variables son iguales.");
        }
    }
}
