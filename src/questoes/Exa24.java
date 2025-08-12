package questoes;

import java.util.Scanner;

public class Exa24 {

	public static void main(String[] args) {
		/*24. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
		calcular a média alcançada por aluno e presentar:
		
		◦ A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva
		média alcançada;
		◦ A mensagem "Reprovado", se a média for menor do que 7, com a respectiva
		média alcançada;
		◦ A mensagem "Aprovado com Distinção", se a média for igual a 10.*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("insira 3 notas: ");
		float[] nota = new float[3];
		nota[0] = en.nextFloat();
		nota[1] = en.nextFloat();
		nota[2] = en.nextFloat();
		float media = (nota[0]+nota[1]+nota[2])/3;
				
		if (media>=7 && media < 10) {
			System.out.print("Aprovado");
		} else {
			if (media==10) {
				System.out.print("Aprovado com distinção");
			} else {
				if (media <7){
				System.out.print("Repovado");
			} else {
				System.out.print("Erro");
			}
		}
		en.close();
	}

	}
}