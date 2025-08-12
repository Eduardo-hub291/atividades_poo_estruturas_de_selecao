package questoes;

import java.util.Scanner;

public class Exa25 {

	public static void main(String[] args) {
		/*25. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a
		valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas
		disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de
		600 reais. O programa não deve se preocupar com a quantidade de notas existentes na
		máquina.
		Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma
		nota de 50, uma nota de 5 e uma nota de 1;
		Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma
		nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("insira a quantia desejada: ");
		int num = en.nextInt();
		int[] notas = new int[5];
				
		if (num<=600 && num>=10) {
			
			notas[0] = num/100; 																//x notas de 100 399 (3)
			notas[1] = (num % (notas[0]*100)/50); 												//y notas de 50   99 (1)
			notas[2] = ((num - (notas[0]*100) - (notas[1]*50)) /10);							//z notas de 10   49 (4)
			notas[3] = ((num - (notas[0]*100) - (notas[1]*50) -(notas[2]*10)) /5);				//w notas de 5     4 (1)
			notas[4] = ((num - (notas[0]*100) - (notas[1]*50) -(notas[2]*10) - (notas[3]*5)));	//s notas de 1     0 (4)
			
			
			
		}
		System.out.println(notas[0] + " notas de 100");
		System.out.println(notas[1] + " notas de 50");
		System.out.println(notas[2] + " notas de 10");
		System.out.println(notas[3] + " notas de 5");
		System.out.println(notas[4] + " notas de 1");
		
		en.close();
	}

}
