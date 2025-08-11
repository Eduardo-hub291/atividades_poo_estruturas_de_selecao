package questoes;

import java.util.Scanner;

public class Exa12 {

	public static void main(String[] args) {
			/*Faça um programa que recebe o salário de um colaborador e calcule o reajuste
			 segundo o seguinte critério, baseado no salário atual:
			o salários até R$ 280,00 (incluindo) : aumento de 20%
			o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
			o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
			o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
			realizado, informe na tela:
			o o salário antes do reajuste;
			o o percentual de aumento aplicado;
			o o valor do aumento;
			o o novo salário, após o aumento.*/
		
		Scanner en = new Scanner(System.in);

		System.out.print("Salário: ");
		double sal = en.nextDouble();
		double[] info = new double[3];

		
		if (sal<=280) {
			info[0] = 20;
			info[1] = sal*0.2;
			info[2] = sal*1.2;
		
			} else if (sal <=700) {
				info[0] = 15;
				info[1] = sal*0.15;
				info[2] = sal*1.15;
				
				
				} else if (sal <=1500) {
					info[0] = 10;
					info[1] = sal*0.1;
					info[2] = sal*1.1;
					
					} else {
						info[0] = 5;
						info[1] = sal*0.05;
						info[2] = sal*1.05;
					} 
			
			System.out.println("salário antes do reajuste R$: "+sal);
			System.out.println("percentual de aumento aplicado: "+ info[0]+ "%");
			System.out.println("valor do aumento: R$" + info[1]);
			System.out.println("novo salário, após o aumento: R$" + info[2]);

		en.close();
		
	}

}
