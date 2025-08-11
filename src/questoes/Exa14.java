package questoes;

import java.util.Scanner;

public class Exa14 {

	public static void main(String[] args) {
	/*14. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
		  Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("digite um número de 1 até 7: ");
		int num = en.nextInt();
		String[] dia = new String[7];
		
		if (num >= 1 && num <=7) { 
			dia[0] = "domingo"; 
			dia[1] = "segunda"; 
			dia[2] = "terça"; 
			dia[3] = "quarta"; 
			dia[4] = "quinta"; 
			dia[5] = "sexta"; 
			dia[6] = "sábado"; 
			
			System.out.print("dia da semana correspondente: " + dia[num-1]);

				} else {
					System.out.print("valor inválido");

				}

		en.close();

	}

}
