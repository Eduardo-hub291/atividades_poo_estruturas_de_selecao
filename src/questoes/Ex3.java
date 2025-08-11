package questoes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
		// escrever: F - Feminino, M - Masculino.
		
		System.out.print("escreva F ou M: ");
		Scanner en = new Scanner(System.in);
		String num = en.nextLine();
		
		if (num.equalsIgnoreCase("F")) { 
		System.out.print("Femininio");
		
			} else if (num.equalsIgnoreCase("M")) {
			System.out.print("Masculino");

				} else {
				System.out.print("Erro");

		}

		en.close();
	}

}
