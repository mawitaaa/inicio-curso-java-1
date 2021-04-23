package calculo_edad;

import java.util.Scanner;

//ALGORITMO Main
public class Main {

	//HACER
	public static void main(String[] args) {
		final int DESPLAZAMIENTO = 25;
		
		Scanner scan = new Scanner(System.in);
	
		int edad;
		String nombre;
		int calculo;
		
		System.out.println("Ingrese su nombre");
		nombre = scan.nextLine();
		
		System.out.println("Ingrese su edad");
		edad = scan.nextInt();
		
		calculo = edad + DESPLAZAMIENTO;
		
		System.out.println("Hola " + nombre + "! Tu edad en "+DESPLAZAMIENTO + " años será "+ calculo);
		
		
	}
	//FIN HACER

}
