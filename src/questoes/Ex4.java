package questoes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Faça um Programa que peça para entrar com um ano com 4 dígitos e determine se o
		// mesmo é ou não bissexto.
		
		System.out.print("ano de 4 dígitos: ");
		Scanner en = new Scanner(System.in);
		int num = en.nextInt();
		
		if ((num % 4) == 0) { 
		System.out.print("é bissexto");

				} else {
				System.out.print("não é bissexto");
		}

		en.close();
	}

}
