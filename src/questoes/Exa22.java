package questoes;

import java.util.Scanner;

public class Exa22 {

	public static void main(String[] args) {
		// 22. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade
		// de centenas, dezenas e unidades do mesmo.
		
		Scanner en = new Scanner(System.in);

		System.out.print("Insira um número menor que 1000: ");
		int num = en.nextInt();
		int centena = (0);
		int dezena = (0);
		int unidade = (0);
		
		if (num < 1000) {
		if (num>=100) { 
			centena = num/100;
			dezena = (num - centena*100 ) / 10;
			unidade =  (num - centena*100 ) - dezena*10;
			System.out.print(centena + " centenas, " + dezena +" dezenas, e " + unidade +" unidades");

			} else {
				if (num>=10) {
					dezena = num/10;
					unidade = num - dezena*10;
					System.out.print(dezena +" dezenas, e " + unidade +" unidades");
				}
			 else {
				System.out.print(num + " unidades");
			 }
			}
		} else {
			System.out.print("número inválido");

		}


		en.close();

	}
	}

