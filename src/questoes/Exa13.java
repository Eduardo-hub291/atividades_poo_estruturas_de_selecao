package questoes;

import java.util.Scanner;

public class Exa13 {

	public static void main(String[] args) {
	/*Salário Bruto até 900 (inclusive) - isento
	Salário Bruto até 1500 (inclusive) - desconto de 5%
	Salário Bruto até 2500 (inclusive) - desconto de 10%
	Salário Bruto acima de 2500 - desconto de 20% 
	
	Imprima na tela as informações, dispostas
	conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
	
	Salário Bruto: (5 * 220) : R$ 1100,00
	(-) IR (5%) : R$ 55,00
	(-) INSS ( 10%) : R$ 110,00    (ESSA INFORMAÇÃO NÃO FOI PASSADA NA QUESTÃO)
	FGTS (11%) : R$ 121,00
	Total de descontos : R$ 165,00
	Salário Liquido : R$ 935,00*/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("Horas trabalhadas por mês: ");
		int horas= en.nextInt();
		System.out.print("Valor por hora: ");
		double valor= en.nextDouble();
		int ir = 0;
		
		if ((horas*valor)>900 && (horas*valor)<=1500) {
			ir = 5;
		} else if (horas*valor <=2500) {
			ir = 10;
		} else {
			ir = 20;
		} 
		System.out.println("Salário Bruto: (" + horas +  " * " + valor+") : R$" + horas*valor);
		System.out.println("(-) IR ("+ir+"%) : R$"+ ((horas*valor)*(ir/100)));
		System.out.println("FGTS (11%) : R$ " + horas*valor*0.11);
		System.out.println("Total de descontos : R$" + horas*valor*(ir/100));
		System.out.println("Salário Liquido : R$" + ((horas*valor) - (horas*valor*(ir/100))));


		en.close();

	}

}
