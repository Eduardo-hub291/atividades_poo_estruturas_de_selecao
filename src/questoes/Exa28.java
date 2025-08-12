package questoes;

import java.util.Scanner;

public class Exa28 {

	public static void main(String[] args) {
		/*28. Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
			ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga
			se o número é:
			
			o par ou ímpar;
			o positivo ou negativo;
			o inteiro ou decimal.*/
		
		Scanner en = new Scanner(System.in);
		System.out.print("escreva um número: ");
		double num1 = en.nextDouble();
		System.out.print("escreva outro número: ");
		double num2 = en.nextDouble();

		double result = (0);

		System.out.print("Qual operação vc deseja? soma(1), subtração(2), divisão(3), Multiplicação(4)");
		System.out.print("");
		int operacao = en.nextInt();
		
		if (operacao == 1) {
			result = num1+num2;
		} else {
			if (operacao ==2) {
				result = num1-num2;
			} else {
				if (operacao == 3) {
					result = num1/num2;
				} else {
					if (operacao == 4) {
						result = num1*num2;
					}
				}
			}
		}
				
		System.out.println("resultado: "+ result);
		
		if (result %2 ==0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
		
		if (result >=0) {
			System.out.println("positivo");
		} else {
			System.out.println("negativo");
		}
		
		if (Math.round(result) == result) {
			System.out.print("é inteiro");
		} else {
			System.out.print("é decimal");
		}
		en.close();

					}

}
