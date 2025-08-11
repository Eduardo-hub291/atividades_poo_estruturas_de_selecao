package questoes;

import java.util.Scanner;

public class Exa30 {

	public static void main(String[] args) {
/**/ 		
		
		Scanner en = new Scanner(System.in);

		System.out.print("quantidade de morangos (kg): ");
		double morango = en.nextDouble();
		System.out.print("quantidade de maçãs (kg): ");
		double maca = en.nextDouble();
		double valor = 0;
		
		if (morango <= 5) {
		valor = valor+(2.5*morango);
		} else {
			valor = valor+(2.2*morango);
		}
		
		if (maca <=5) {
		valor = valor+(1.8*maca);
		} else {
		valor = valor+ (1.5*maca);
		}
		
		if (maca+morango>8 || valor>28) {
		valor = valor - valor*0.1;;
		}
		
		System.out.print("valor a ser pago: R$"+valor);

		
//		if () { 
//		
//			} else if () {
//
//				} else {
//		}

		en.close();
	}

}
