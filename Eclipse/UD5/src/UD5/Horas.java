package UD5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horas {

	public static void main(String[] args) {
	Date fecha = new Date();
	SimpleDateFormat formatoHora =new SimpleDateFormat("hh");
	int horaNum = Integer.parseInt(formatoHora.format(fecha));
	
	 switch (horaNum) { //<------------------Te has quedado aqui
	case 0, 1, 2, 3, 4, 5:
        System.out.println("Buenas noches");
        break;
    case 6, 7, 8, 9, 10, 11:
        System.out.println("Buenos días");
        break;
    case 12, 13, 14, 15, 16, 17:
        System.out.println("Buenas tardes");
        break;
    default:
        System.out.println("Buenas noches");
	}
	 System.out.println(horaNum);

	}
}