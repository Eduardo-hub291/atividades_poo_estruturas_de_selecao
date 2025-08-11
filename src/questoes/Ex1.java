package questoes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.
		
		System.out.print("Insira um número: ");
		Scanner en = new Scanner(System.in);
		int num1 = en.nextInt();
		System.out.print("Insira outro número: ");
		int num2 = en.nextInt();
		
		if (num1>num2) { 
			System.out.println("o maior número é " + num1);
			} else if (num2>num1) {
				System.out.println("o maior número é " + num2);
			} else {
					System.out.println("os números são iguais");
		}

		en.close();
	}

}
