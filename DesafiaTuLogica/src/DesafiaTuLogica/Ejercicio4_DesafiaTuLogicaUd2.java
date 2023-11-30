package DesafiaTuLogica;
import java.util.Scanner;

public class Ejercicio4_DesafiaTuLogicaUd2 {

	public static void main(String[] args) {
		// Ejercicio 4, compara 3 números y los ordena de mayor a menor o viceversa.
		
		Scanner sc = new Scanner (System.in);
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		String orden = "";
		
		int peque = 0, medi = 0, grande = 0;
		
		System.out.println("Introduce 3 números para ordenarlos de forma ascendente o descendente. No pueden repetirse." + "\n");
		
		do{
			System.out.println("Introduce el primer numero:");
			num1=sc.nextInt();
		
			System.out.println("Introduce el segundo numero:");
			num2=sc.nextInt();
		
			System.out.println("Introduce el tercer numero:");
			num3=sc.nextInt();
			
			if (num1==num2 || num2==num3 || num1==num3) {
				System.out.println("\n" + "No puedes repetir números, tienen que ser diferentes. Probemos otra vez." + "\n");
			}
		}while (num1==num2 || num2==num3 || num1==num3);
		
		do{
			System.out.println("Introduce 'a' si quieres que el orden sea ascendete o 'd' si quieres que sea descente.");
			orden=sc.next();
			
			if(orden.equalsIgnoreCase("a")==false && orden.equalsIgnoreCase("d")==false) {
				System.out.println("Sólo se puede introducir 'a' o 'd'." + "\n");
			}
		}while(orden.equalsIgnoreCase("a")==false && orden.equalsIgnoreCase("d")==false);
					
		if(num1>num2 && num2>num3){ // num1>num2>num3
			peque = num3;
			medi = num2;
			grande = num1;
		}
		else if(num1<num2 && num2<num3){ // num3>num2>num1
			peque = num1;
			medi = num2;
			grande = num3;
		}
		else if (num1<num2 && num2>num3 && num1<num3){ // num2>num3>num1	
			peque = num1;
			medi = num3;
			grande = num2;
		}
		else if(num1<num2 && num2>num3 && num1>num3){ // num2>num1>num3	
			peque = num3;
			medi = num1;
			grande = num2;
		}
		else if(num1>num2 && num2<num3 && num3>num1){ // num3>num1>num2	
			peque = num2;
			medi = num1;
			grande = num3;
		}
		else if(num1>num2 && num2<num3 && num3<num1){ // num1>num3>num2
			peque = num2;
			medi = num3;
			grande = num1;
		}
		
		if(orden.equalsIgnoreCase("a")==true) {
			System.out.println("En orden ascendente sería: " + peque + " < " +  medi + " < " + grande);
		}
		else{
			System.out.println("En orden descendente sería: " + grande + " > " +  medi + " > " +  peque);
		}
		sc.close();
	}
}
