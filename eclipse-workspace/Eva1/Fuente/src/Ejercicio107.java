package src;

//Vamos a coger un número y lo vamos a pasar a binario.
public class Ejercicio107 {

	public static void main(String[] args) {
		int x = 8;
		int binario = x;
		int divisor = 2;
		int decimal = x;
		int datos[] = new int[100];
		for (int i = 0; i < x; i++) {
			binario = decimal % divisor;
			decimal = decimal / 2;
			System.out.print(binario);
		}

	}
}
