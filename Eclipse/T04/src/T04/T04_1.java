package T04;

public class T04_1 {

	public static void main(String[] args) {
		
		int operador=10;
		int x=0;			
		operador++;	
		operador++;
		operador--;
		x=operador++;
		x=++operador;
				
				System.out.println(operador);
				System.out.println(operador++);
				System.out.println(++operador);
	}

}