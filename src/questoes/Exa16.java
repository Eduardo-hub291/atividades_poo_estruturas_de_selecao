package questoes;

import java.util.Scanner;

public class Exa16 {

	public static void main(String[] args) {
			/*16. Altere o programa que calcula a média do aluno, e mostre a mensagem de acordo com a
				  média. De 0 a 3 - Reprovado, de 3 a 6.9 - Em Exame, de 7 a 10 - Aprovado*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("quantidade de notas: ");
		int num = en.nextInt();
		float[] nota = new float[num];
		float media = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print("nota "+i+": ");
			nota[i-1] = en.nextFloat();
			media = media + nota[i-1];
		}
		
		if (media/num <=3) { 
			System.out.println("Reprovado");
			} else if (media/num <=6.9) {
				System.out.println("Em exame");
					} else {
						System.out.println("Aprovado");
					}

		System.out.print("media "+ media/num);

		en.close();
	}

}
