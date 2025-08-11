package questoes;

import java.util.Scanner;

public class Exa18 {

	public static void main(String[] args) {
			/*18.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
				os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
				é: equilátero, isósceles ou escaleno.
				Dicas:
				Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
				terceiro;
				Triângulo Equilátero: três lados iguais;
				Triângulo Isósceles: quaisquer dois lados iguais;
				Triângulo Escaleno: três lados diferentes;*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("insira 3 lados: ");
		int[] lado = new int[3];
		lado[0] = en.nextInt();
		lado[1] = en.nextInt();
		lado[2] = en.nextInt();
		
		if (lado[0] + lado[1] <= lado[2]) {
			System.out.println("não é possível formar um triângulo");
		} else { 
			if (lado[0] == lado[1] && lado[1] == lado[2]) {
				System.out.println("Triângulo Equilátero");
			}
			 else { 
				if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2] ) {
					System.out.println("Triângulo Isósceles");
				}
				else { 
						System.out.println("Triângulo Escaleno");
					}
			 	}
		}
			
		
		
		//int lado = en.nextInt();
		
//		if () { 
//		
//			} else if () {
//
//				} else {
//		}

		en.close();
	}
//
	}
