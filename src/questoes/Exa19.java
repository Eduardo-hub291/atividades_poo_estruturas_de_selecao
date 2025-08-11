package questoes;

import java.util.Scanner;

public class Exa19 {

	public static void main(String[] args) {
				/*19. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2
					+ bx + c. O programa deverá pe seguintes situações:
					
					Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
					programa não deve fazer pedir os demais valores, sendo encerrado;
					
					Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e
					encerre o programa;
					
					Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao
					usuário;
					
					Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("a: ");
		double a = en.nextDouble();
		System.out.print("b: ");
		double b = en.nextDouble();
		System.out.print("c: ");
		double c = en.nextDouble();
		double delta = ((Math.pow(b, 2)- 4*a*c));
		
		if (a==0) { 
			System.out.println("não é equação de segundo grau");
			
			} else { 
				if (delta < 0) {
					System.out.println("a equação não possui raizes");

				} else {
					if (delta == 0) {
					System.out.println("A raiz é: " + (-b / (2*a)));
					
					} else {
						if (delta > 0) {
							System.out.println("As raizes são");
							System.out.println("x1: " + ((-b + Math.sqrt(delta)) / (2*a)));
							System.out.println("x2: " + ((-b - Math.sqrt(delta)) / (2*a)));
										}
							}
						}
					}		
			

		en.close();
	}

	}
