package questoes;

import java.util.Scanner;

public class Exa23 {

	public static void main(String[] args) {
		/*23. Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
			◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem
			"Turma Jovem";
			◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem
			"Turma Adulta";
			◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a
			mensagem "Turma Idosa".*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("insira três idades: ");
		int[] idade = new int[3];
		idade[0] = en.nextInt();
		idade[1] = en.nextInt();
		idade[2] = en.nextInt();
		float media = (idade[0] + idade[1] + idade[2])/3;
		
		if (media<25) {
			System.out.print("Turma Jovem");
		} else {
			if (media<40) {
				System.out.print("Turma Adulta");
			} else {
				System.out.print("Turma Idosa");
			}
		}
		
		en.close();

	}

}
