package questoes;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	/*  Tendo como dado de entrada a altura, peso e sexo, construa um algoritmo que calcule
		o peso ideal, utilizando as seguintes fórmulas:
		Para homens: (72.7*h) - 58
		Para mulheres: (62.1*h) - 44.7
		(h = altura)
		Ao final o algoritmo deve mostrar:
		- Altura, peso e sexo;
		- Peso Ideal;
		- Mensagem se está acima, abaixo ou no peso ideal; */
		
		Scanner en = new Scanner(System.in);

		System.out.print("altura: ");
		double h = en.nextDouble();

		System.out.print("peso: ");
		double kg = en.nextDouble();

		System.out.print("sexo (M ou F): ");
		char sexo = en.next().charAt(0);


		if (sexo == 'M' || sexo == 'm') { 
			System.out.println("altura: "+h);
			System.out.println("peso: "+kg);
			System.out.println("sexo: masculino");
			System.out.println("peso ideal: "+((72.7*h)-58));
		}
		
			 else if (sexo == 'F' || sexo == 'f') {
				System.out.println("altura: "+h);
				System.out.println("peso: "+kg);
				System.out.println("sexo: feminino");
				System.out.println("peso ideal: "+((62.1*h)-44.7));

		}

		en.close();
		
		
	}

}
