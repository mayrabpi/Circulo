package programaCirculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println ("dame un radio");
		
		int  radio=entrada.nextInt();
		Circulo circulo1 = new Circulo(radio);
		int opcion;
		
		do {
			System.out.println ("0 para salir \n" + "1 - calcular el area \n" + "2 - calcular perimetro \n");
			
			System.out.println ("por favor dime una opción");
			
			 opcion = entrada.nextInt();
			
			if (opcion == 1) {
				circulo1.CalcularArea();
				System.out.println ("el area del circulo de " + radio + " es " + circulo1.getArea());
				
				
				
				
			}else if (opcion ==2) {
				circulo1.calcularPerimetro();
				System.out.println ("el area del perimetro de " + radio + " es " + circulo1.getPerimetro());
				
				
				
			}
			
			
			
			
		}while(opcion !=0);
		System.out.println ("Adios");
		
		
		
		
	}

}
