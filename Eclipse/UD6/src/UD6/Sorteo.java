package UD6;

import javax.swing.JOptionPane;

public class Sorteo {

    public static void main(String[] args) {
        String[] participantes = new String[3];

        for (int i = 0; i < 3; i++) {
            participantes[i] = JOptionPane.showInputDialog("Ingrese el nombre del participante " + (i + 1) + ":");
        }

        StringBuilder listaParticipantes = new StringBuilder("Lista de participantes:\n");
        for (int i = 0; i < participantes.length; i++) {
            listaParticipantes.append((i + 1)).append(". ").append(participantes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaParticipantes.toString());

        int indiceGanador = (int) (Math.random() * participantes.length);
        String ganador = participantes[indiceGanador];
        JOptionPane.showMessageDialog(null, "¡El ganador del sorteo es: " + ganador + "!");
    }
}

//import java.util.Scanner;
//
//public class Sorteo {
//
//    public static void main(String[] args) {
////		Ejercicio del sorteo
////		Pedir 3 strings por pantalla 
////		Realizar un recorrido del array y mostrar los 3 participantes
////		en una lista y a continuación con método Math.random
////		rango del indice 0 al 2 (lenght-1) te arroje un ganador.
//    	
//        Scanner scanner = new Scanner(System.in);
//        String[] participantes = new String[3];
//
//        // Pedir los nombres de los participantes
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Ingrese el nombre del participante " + (i + 1) + ": ");
//            participantes[i] = scanner.nextLine();
//        }
//
//        // Mostrar los participantes
//        System.out.println("\nLista de participantes:");
//        for (String participante : participantes) {
//            System.out.println("- " + participante);
//        }
//
//        // Realizar el sorteo
//        int indiceGanador = (int) (Math.random() * participantes.length);
//        String ganador = participantes[indiceGanador];
//        System.out.println("\n¡El ganador del sorteo es: " + ganador + "!");
//    }
//}
























//import javax.swing.JOptionPane;
//import java.util.Random;
//
//public class Sorteo {
//
//    public static void main(String[] args) {
//        // Solicitar al usuario ingresar 3 strings
//        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer participante:");
//        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo participante:");
//        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre del tercer participante:");
//
//        // Realizar el sorteo
//        String[] participantes = {nombre1, nombre2, nombre3};
//        String ganador = participantes[generarIndiceAleatorio(participantes.length)];
//
//        // Mostrar el resultado con JOptionPane
//        JOptionPane.showMessageDialog(null, "¡El ganador del sorteo es: " + ganador + "!");
//    }
//
//    // Método para generar un índice aleatorio
//    private static int generarIndiceAleatorio(int maximo) {
//        Random random = new Random();
//        return random.nextInt(maximo);
//    }
//}



//import java.util.Scanner;
//import java.util.Random;

//public class Sorteo {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Solicitar al usuario ingresar 3 strings
//        System.out.println("Ingrese los nombres de los participantes para el sorteo:");
//        System.out.print("Primer nombre: ");
//        String nombre1 = scanner.nextLine();
//        System.out.print("Segundo nombre: ");
//        String nombre2 = scanner.nextLine();
//        System.out.print("Tercer nombre: ");
//        String nombre3 = scanner.nextLine();
//
//        // Realizar el sorteo
//        String ganador = sorteo(nombre1, nombre2, nombre3);
//
//        // Mostrar el resultado
//        System.out.println("¡El ganador del sorteo es: " + ganador + "!");
//
//        scanner.close();
//    }
//
//    // Método para realizar el sorteo
//    private static String sorteo(String nombre1, String nombre2, String nombre3) {
//        String[] participantes = {nombre1, nombre2, nombre3};
//
//        // Generar un índice aleatorio para seleccionar al ganador
//        Random random = new Random();
//        int indiceGanador = random.nextInt(participantes.length);
//
//        return participantes[indiceGanador];
//    }
//}

