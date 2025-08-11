package questoes;

import java.util.Scanner;

public class Exa15 {

	public static void main(String[] args) {
	/*15. 
	 * 	Faça um Programa que tendo como dados de entrada o preço de custo de um produto e
		um código de origem, emita o preço junto de sua procedência. Caso o código não seja
		nenhum dos especificados, o produto deve ser classificado como importado. Código de
		origem: 1 - Sul, 2 - Norte 3 - Leste, 4 - Oeste, 5 ou 6 - nordeste 7 ou 8 Centro-oeste.*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("preço: R$");
		double valor = en.nextDouble();
		System.out.print("código (1-8): ");
		int cod = en.nextInt();
		String[] origem = new String[8];
		
		System.out.println("Valor: R$" + valor);

		if (cod >= 1 && cod<=8) { 
		origem[0] = "Sul"; 
		origem[1] = "Norte"; 
		origem[2] = "Leste"; 
		origem[3] = "Oeste"; 
		origem[4] = "Nordeste"; 
		origem[5] = "Nordeste"; 
		origem[6] = "Centro-Oeste"; 
		origem[7] = "Centro-Oeste"; 

		
		System.out.println("Procedência: " + origem[cod-1]);

			} else {
				System.out.println("produto importado");

			}
		en.close();

	}

}
