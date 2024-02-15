package UD6;

public class clase2 {

	public static void main(String[] args) {
		int num[]=rellenarArrayDesde(5);
		imprimirArray(num);
		
	}

	private static void imprimirArray(int lista[]) {
	for(int i=0;i<lista.length;i++) {
		System.out.println(lista[i]);
	}
		
	}

	private static int[] rellenarArrayDesde(int a) {
		int num[]=new int[18];
		for(int i=0;i<num.length;i++) {
			num[i]=a;
			a++;
		}
		return num;
	}

}
