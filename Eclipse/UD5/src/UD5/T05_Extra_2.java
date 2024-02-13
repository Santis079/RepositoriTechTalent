package UD5;

public class T05_Extra_2 {

    public static void main(String[] args) {
    	
        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.println("Tabla de multiplicar del " + num1 + ":");

            for (int num2 = 0; num2 <= 10; num2++) {
                int resultado = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + resultado);
            }        
        }
    }
}