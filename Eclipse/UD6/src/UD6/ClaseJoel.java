package UD6;

import java.util.Scanner;

public class ClaseJoel {

	public static void main(String[] args) {
		int matrix[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un valor");
		
	
		 for (int i = 0; i<10; i++) {
			int numero = sc.nextInt(); 
			matrix[i]=numero;
		 }
		 System.out.println(matrix[6]);
		 


	}

}
