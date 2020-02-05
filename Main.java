import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Estudiante>datos = new ArrayList<Estudiante>();
		Scanner sc = new Scanner (System.in);
		Scanner sn = new Scanner (System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu apellido");
		String apellido = sc.nextLine();
		System.out.println("Introduce tu fecha de nacimiento");
		String fnacimiento = sc.nextLine();
		System.out.println("Introduce tu dni");
		String dni = sc.nextLine();
		System.out.println("Introduce tus estudios previos");
		String estudios = sc.nextLine();
		System.out.println("Introduce tu telefono");
		String tlf = sc.nextLine();
		datos.add(new Estudiante(nombre,apellido,fnacimiento,dni,estudios,tlf));
	}

}
