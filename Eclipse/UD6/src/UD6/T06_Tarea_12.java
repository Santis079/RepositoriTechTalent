package UD6;
import javax.swing.JOptionPane;
import java.util.Random;

public class T06_Tarea_12 {
    public static void main(String[] args) {

        int longoArray = arrasa("De que tamaño quieres el array?");

        int[] num = new int[longoArray];

        aleta(num);

        int numerito = obtenerDigito("Que terminacion estas buscando?");

        acabado(num, numerito);
    }

    private static void aleta(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300) + 1;
            System.out.println(array[i]);
        }
    }

    private static int arrasa(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static int obtenerDigito(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static void acabado(int[] array, int digito) {
        System.out.println("Los numeros que acaban en " + digito + " son:");
        for (int numero : array) {
            if (numero % 10 == digito) {
                System.out.println(numero);
            }
        }
    }
}

