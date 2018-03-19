
public class Ejercicio59 {

	public static void main(String arg[]) {
		int numero1 = 5;
		int numero2 = 2;
		System.out.printf("Combinaciones de %d elementos tomados de %d en %d es %d ", numero1, numero2, numero2,
				factorial(numero1) / (factorial(numero2) * factorial(numero1 - numero2)));
	}

	public static int factorial(int num1) {
		int factorial = 1;
		for (int i = num1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}