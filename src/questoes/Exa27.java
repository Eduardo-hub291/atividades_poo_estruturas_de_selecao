package questoes;

import java.util.Scanner;

public class Exa27 {


	public static void main(String[] args) {
		/*27. Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
			  Dica: utilize uma função de arredondamento.*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("insira um valor: ");
		float num = en.nextFloat();
		
		if (Math.round(num) == num) {
			System.out.print("é inteiro");
		} else {
			System.out.print("é decimal");
		}
				
				
		en.close();
	}

}
