package UD5;
public class HorasEjercicio{
	
	public static void main(String[] args) {
        
        int hora = 20; 


        System.out.println("Hora puesta: " + hora);

        if (hora >= 0 && hora < 12) {
            System.out.println("Buenos Días");
        } else if (hora >=12 && hora <=19) {
            System.out.println("Buenas Tardes");
        }else if (hora>=20 && hora <24) {
        	System.out.println("Buenas Noches");
        }else 
        	System.out.println("No es una hora valida");
        }
	}    