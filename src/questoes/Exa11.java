package questoes;

import java.util.Scanner;

public class Exa11 {

	public static void main(String[] args) {
		// 11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
		// Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
		// Tarde!" ou "Boa Noite!" , conforme o caso.

		Scanner en = new Scanner(System.in);

		System.out.println("em que turno você estuda? M- Matutino ou V- Vespertino ou N- Noturno ");
		char turno = en.next().charAt(0);
		
		if (turno == 'M' || turno == 'm') { 
			System.out.print("bom dia");

			} else if (turno == 'V' || turno == 'v') { 
				System.out.print("boa tarde");

				} else if (turno == 'N' || turno == 'n') { 
					System.out.print("boa noite");
					
				} else {
					System.out.print("Erro");

			
					}
		en.close();

		}

	}


