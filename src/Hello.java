import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("OIA QUE LEGAL, DIGITE ALGO");
		int valor = teclado.nextInt();
		System.out.println("Valor Digitado = "+valor);
		teclado.close();
	}
}
