package questoes;

import java.util.Scanner;

public class Exa26 {

	public static void main(String[] args) {
		/*26. Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
		      utilize o operador módulo (resto da divisão).*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("número: ");
		int num = en.nextInt();
		
		if ((num % 2) == 0) {
			System.out.print("é par");
		} else {
			System.out.print("é ímpar");
		}
				
		en.close();
	}

}
