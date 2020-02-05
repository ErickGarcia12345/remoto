import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>datos = new ArrayList<String>();
		Scanner sc = new Scanner (System.in);
		Scanner sn = new Scanner (System.in);
		System.out.println("Introduce tu nombre");
		datos.add(sc.nextLine());
		System.out.println("Introduce tu apellido");
		datos.add(sc.nextLine());
		System.out.println("Introduce tu fecha de nacimiento");
		datos.add(sc.nextLine());
		System.out.println("Introduce tu dni");
		datos.add(sc.nextLine());
		System.out.println("Introduce tus estudios previos");
		datos.add(sc.nextLine());
		System.out.println("Introduce tu telefono");
		datos.add(sc.nextLine());
		
	}

}
