package questoes;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Faça um Programa que peça um número inteiro e se este número for par, transforme-o
		// em impar e vice-versa.
		
		System.out.print("número: ");
		Scanner en = new Scanner(System.in);
		int num = en.nextInt();
		System.out.print(num+1);


		en.close();

	}

}
