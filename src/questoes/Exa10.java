package questoes;

import java.util.Scanner;

public class Exa10 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("num1: ");
		int num1 = en.nextInt();
		System.out.print("num2: ");
		int num2 = en.nextInt();
		System.out.print("num3: ");
		int num3 = en.nextInt();
		
		int maior = (0);
		int menor = (0);
		
		maior = num1;
		
		if (num2 > maior) {
				maior = num2;		
			} 
		if (num3>maior) {
				maior = num3;
		}
	
		menor = num1;
		
		if (num2 < menor) {
			menor = num2;
						
			}
		if (num3<menor) {
			menor = num3;
			}
		
		System.out.println("maior: "+ maior);

		System.out.println("menor: "+menor);
		
		en.close();


	}
	

}
