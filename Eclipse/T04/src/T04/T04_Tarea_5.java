package T04;

public class T04_Tarea_5 {
    public static void main(String[] args) {
       
        int A = 4;
        int B = 17;
        int C = 12;
        int D = 28;

        System.out.println("Los valores iniciales de las variables son:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);

        int B2 = B;
        B = C;
        C = A;
        A = D;
        D = B2;

       
        System.out.println("Los Valores despues del intercambio son:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
       
}