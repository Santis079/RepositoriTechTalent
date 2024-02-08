package UD5;

import java.util.Scanner;

public class T05_Tarea_4 {
    public static void main(String[] args) {
    	
        Scanner escaner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");

        String radioString = escaner.nextLine();
        double radio = Double.parseDouble(radioString);

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);

       escaner.close();
    }
}