package questoes;

import java.util.Scanner;

public class Exa21 {

	public static void main(String[] args) {
			/*21. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("dia: ");
		int dia = en.nextInt();
		System.out.print("mês:");
		int mes = en.nextInt();
		System.out.print("ano: ");
		int ano = en.nextInt();
		
		if (ano>0 && ano<10000 && mes>0 && mes<13 && dia > 0 && dia < 32) { 				
					System.out.print("data válida");
				
				} else {
					System.out.print("data inválida");
				}
		
		
		en.close();
	}

}
