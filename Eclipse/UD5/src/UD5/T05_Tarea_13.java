package UD5;									
import javax.swing.JOptionPane;

public class T05_Tarea_13 {

    public static void main(String[] args) {
        int operando1 = obtenerOperando("Ingrese el primer operando (entero):");
        int operando2 = obtenerOperando("Ingrese el segundo operando (entero):");
        String operacion = obtenerOperacion();

        double resultado = calcularResultado(operando1, operando2, operacion);

        JOptionPane.showMessageDialog(null, "El resultado de la operaciohn es: " + resultado);
    }

    private static int obtenerOperando(String mensaje) {
        String strOperando = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(strOperando);
    }

    private static String obtenerOperacion() {
        return JOptionPane.showInputDialog("Ingrese el signo aritmetico (+, -, *, /, ^, %):");
    }

    private static double calcularResultado(int operando1, int operando2, String operacion) {
        double resultado = 0.0;

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
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    mostrarError("Error: No se puede dividir por cero.");
                    System.exit(0);
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                if (operando2 != 0) {
                    resultado = operando1 % operando2;
                } else {
                    mostrarError("Error: No se puede calcular el módulo con divisor cero.");
                    System.exit(0);
                }
                break;
            default:
                mostrarError("Error: Signo aritmético no válido.");
                System.exit(0);
        }

        return resultado;
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
