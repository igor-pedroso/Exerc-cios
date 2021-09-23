import java.util.Scanner;

public class Cenadecrime {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int resp = 0;
		
		System.out.println("Você telefonou para a vítima? responda 1 para sim ou 2 para não");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Você esteve na cena do crime? responda 1 para sim ou 2 para não");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Você mora próximo a vítima? responda 1 para sim ou 2 para não");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Você já trabalhou com a vítima? responda 1 para sim ou 2 para não");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		if(resp == 2) {
			System.out.println("Você é suspeito.");
		}else if(resp == 3 || resp ==4) {
			System.out.println("Você é cúmplice.");
		}else if(resp == 5) {
			System.out.println("Você é o assassino.");
		}else {
			System.out.println("Você é inocente.");
		}
	}

}
