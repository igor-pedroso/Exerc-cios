package exercicio;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um ano:");
		int ano = teclado.nextInt();
	
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("O ano é bissexto.");
			
			
		}else
	
			System.out.println("O ano não é bissexto.");
			
			teclado.close();
		}
	}
