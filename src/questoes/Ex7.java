package questoes;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
// como eu fiz:
		Scanner en = new Scanner(System.in);
		System.out.print("num1: ");
		int num1 = en.nextInt();
		System.out.print("num2: ");
		int num2 = en.nextInt();
		System.out.print("num3: ");
		int num3 = en.nextInt();
		
		int maior = (-100000);
		int menor = (1000000);
		int medio = (1);

		
		if (num1 > maior) {
			maior = num1;
		
			}
		
		if (num2 > maior) {
				maior = num2;		
			} 
		if (num3>maior) {
				maior = num3;
		}
		
		if (num1 < menor) {
			menor = num1;
		
			} 
		if (num2 < menor) {
			menor = num2;
						
			}
		if (num3<menor) {
			menor = num3;
			}
		
		if (num1 != maior && num1!=menor) {
			medio = num1;
		
			} else if (num2 != maior && num2!=menor) {
				medio = num2;
						
				} else {
					medio = num3;
					
				}
		System.out.print(maior + " " + medio + " " + menor);
		

		// poderia ser feito com arrays


		en.close();
	}

}
