package questoes;

import java.util.Scanner;

public class Exa17 {

	public static void main(String[] args) {
			/*17. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
					longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela
					abaixo:
					Média de Aproveitamento Conceito
					Entre 9.0 e 10.0 A
					Entre 7.5 e 9.0 B
					Entre 6.0 e 7.5 C
					Entre 4.0 e 6.0 D
					Entre 4.0 e zero E
					
					O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
					a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
					conceito for D ou E.*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.println("Insira suas duas notas parciais");
		float[] nota = new float[3];
		System.out.print("Nota 1: ");
		nota[0] = en.nextFloat();
		System.out.print("Nota 2: ");
		nota[1] = en.nextFloat();
		nota[2] = (nota[1]+nota[0])/2;
		char conceito = ' ';
				
		if (nota[2] >=9) { 
			conceito = 'A';
			
			} else if (nota[2] >= 7.5) {
				conceito = 'B';
				
				} else if (nota[2] >= 6) {
					conceito = 'C';
					
					} else if (nota[2] >= 4) {
						conceito = 'D';
						
						} else if (nota[2] >= 0) {
							conceito = 'E';
						}
		System.out.println("notas: " + nota[0] + " e "+ nota[1]);
		System.out.println("média: " + nota[2]);
		System.out.println("Conceito correspondente: " + conceito);
		
		if (nota[2] >= 6) {
			System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}

		en.close();
	}

}
