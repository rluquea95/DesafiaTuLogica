package DesafiaTuLogica;
import java.util.Scanner;

public class Ejercicio3_DesafiaTuLogicaUd2 {

	public static void main(String[] args) {
		// Ejercicio 3, muestra los múltiplos de 2 o 3 contenidos entre 1 y 100.
		
		Scanner sc = new Scanner (System.in);
		
		int num = 0;
		
		int cont = 0;
		
		do{
			
			System.out.println("Introduce 2 o 3 para ver sus múltiplos:");
			
			num = sc.nextInt();
			
		}while (num!=2 && num!=3);
			
		if (num==2){
			
			System.out.println("\n" + "Los múltiplos de 2 son:");
			
			for (int i=2; i<=100; i+=2) {
				
				System.out.print(i + " ");
				
				cont++;		
			}
		}
		else{
			
			System.out.println("\n" + "Los múltiplos de 3 son: ");
			
			for (int i=3; i<=100; i+=3) {
				
				System.out.print(i + " ");
				
				cont++;
			}
		}
		System.out.println("\n\n" + "El número de múltiplos entre 1 y 100 son: " + cont);
		sc.close();
	}
}
