import java.util.Scanner;

public class Cenadecrime {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int resp = 0;
		
		System.out.println("Voc� telefonou para a v�tima? responda 1 para sim ou 2 para n�o");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Voc� esteve na cena do crime? responda 1 para sim ou 2 para n�o");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Voc� mora pr�ximo a v�tima? responda 1 para sim ou 2 para n�o");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		System.out.println("Voc� j� trabalhou com a v�tima? responda 1 para sim ou 2 para n�o");
		if(teclado.nextInt() == 1) {
			++resp;
		}
		
		if(resp == 2) {
			System.out.println("Voc� � suspeito.");
		}else if(resp == 3 || resp ==4) {
			System.out.println("Voc� � c�mplice.");
		}else if(resp == 5) {
			System.out.println("Voc� � o assassino.");
		}else {
			System.out.println("Voc� � inocente.");
		}
	}

}
