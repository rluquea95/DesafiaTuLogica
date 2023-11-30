package DesafiaTuLogica;
import java.util.Scanner;

public class Ejercicio2_DesafiaTuLogicaUd2 {

	public static void main(String[] args) {
		// Ejercicio 2, muestra los 20 números sucesivos al número introducido.
		
		Scanner sc = new Scanner (System.in);
		
		int num = 0;
		
		do{
			System.out.print("Introduce un número positivo: ");
			num = sc.nextInt();
		}while(num<0);

		System.out.println("\n" + "Los siguientes 20 números son:");
		
		for (int i=num; i<=num+20; i++){
			System.out.print(i + " ");
		}
		sc.close();
	}
}
