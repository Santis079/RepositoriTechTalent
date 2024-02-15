package UD6;

import javax.swing.JOptionPane;

public class T06_Tarea_01 {

    public static void main(String[] args) {

        String cosa = JOptionPane.showInputDialog("Que figura quieres calcularle el area? (circulo, triangulo, cuadrado):");

        double area = 0.0;

        switch (cosa.toLowerCase()) {
            case "circulo":
                double radio = Numerito("Radio: ");
                area = AreaCirculo(radio);
                break;

            case "triangulo":
                double base = Numerito("Base: ");
                double altura = Numerito("Altura: ");
                area = AreaTriangulo(base, altura);
                break;

            case "cuadrado":
                double lado = Numerito("Lado: ");
                area = AreaCuadrado(lado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "figura no valida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El area del " + cosa + " es: " + area);
    }


    private static double AreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    private static double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static double AreaCuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    private static double Numerito(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}
