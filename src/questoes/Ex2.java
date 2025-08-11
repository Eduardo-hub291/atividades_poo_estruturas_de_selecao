package questoes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.

		System.out.print("número: ");
		Scanner en = new Scanner(System.in);
		int num = en.nextInt();
		
		if (num>0) { 
		System.out.print("o número é positivo");
		
			} else if (num<0) {
			System.out.print("o número é negativo");

				} else {
					System.out.print("o número é zero");
		}

		en.close();
	}

}
