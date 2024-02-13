package UD5;
import javax.swing.JOptionPane;

public class T05_Tarea_13 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese los operandos y el signo aritmético
        int operando1 = obtenerOperando("Ingrese el primer operando (entero):");
        int operando2 = obtenerOperando("Ingrese el segundo operando (entero):");
        String operacion = obtenerOperacion();

        // Realizar la operación según el signo aritmético
        double resultado = calcularResultado(operando1, operando2, operacion);

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
    }

    // Método para obtener un operando entero desde el usuario
    private static int obtenerOperando(String mensaje) {
        String strOperando = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(strOperando);
    }

    // Método para obtener la operación desde el usuario
    private static String obtenerOperacion() {
        return JOptionPane.showInputDialog("Ingrese el signo aritmético (+, -, *, /, ^, %):");
    }

    // Método para realizar la operación y devolver el resultado
    private static double calcularResultado(int operando1, int operando2, String operacion) {
        double resultado = 0.0; // Inicializar el resultado con un valor predeterminado

        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                // Verificar que el divisor no sea cero
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    mostrarError("Error: No se puede dividir por cero.");
                    System.exit(0); // Salir del programa si hay un error
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                // Verificar que el divisor no sea cero
                if (operando2 != 0) {
                    resultado = operando1 % operando2;
                } else {
                    mostrarError("Error: No se puede calcular el módulo con divisor cero.");
                    System.exit(0); // Salir del programa si hay un error
                }
                break;
            default:
                mostrarError("Error: Signo aritmético no válido.");
                System.exit(0); // Salir del programa si hay un error
        }

        return resultado;
    }

    // Método para mostrar mensajes de error
    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
