
import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c;

		System.out.println("Insira a primeira medida: ");
		a = teclado.nextDouble();

		System.out.println("Insira a segunda medida: ");
		b = teclado.nextDouble();

		System.out.println("Insira a terceira medida: ");
		c = teclado.nextDouble();

		if (a < (b + c) && b < (a + c) && c < (a + b)) {

			if (a == b && b == c) {
				System.out.println("Triangulo equilatero.");
			} else if (a == b || b == c || a == c) {
				System.out.println("Triangulo isoceles.");
			} else {
				System.out.println("Triangulo escaleno.");
			}
		} else {
			System.out.println("As medidas não formam um triangulo.");

			teclado.close();
		}
	}
}
