package questoes;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
		// calcular a média alcançada pelo aluno e apresentar:
		//	o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		//	o A mensagem "Reprovado", se a média for menor do que sete;
		
		Scanner en = new Scanner(System.in);
		System.out.print("nota 1: ");
		double nota1 = en.nextDouble();
		System.out.print("nota 2: ");
		double nota2 = en.nextDouble();

		
		if ((nota1+nota2)/2 >= 7) {
			System.out.print("aprovado");
				} else {
					System.out.print("Reprovado");

		}

		en.close();
	}

}
