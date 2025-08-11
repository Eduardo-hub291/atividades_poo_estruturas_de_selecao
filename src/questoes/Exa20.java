package questoes;

import java.util.Scanner;

public class Exa20 {

	public static void main(String[] args) {
		// 20. Faça um Programa que peça um número correspondente a um determinado ano e em
		// seguida informe se este ano é ou não bissexto.
		
		
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
