package questoes;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal.
		
		System.out.print("entre com uma letra: ");
		Scanner en = new Scanner(System.in);
		String num = en.nextLine();
//		
		if (num.equalsIgnoreCase("A") || num.equalsIgnoreCase("E") || num.equalsIgnoreCase("I") || num.equalsIgnoreCase("O")|| num.equalsIgnoreCase("U")) { 
		System.out.println("é vogal");
		
				} else {
				System.out.println("não é vogal");

		}
		

		en.close();
	}

}
