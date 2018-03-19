package Sergio;

public class Ejercicio12 {

	public static void main(String[] args) {
		int x = 9;
		int resultado = 0;
		int[] datos = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < datos.length; i++) {
			resultado = x * datos[i];
			System.out.println(resultado);
		}
	}

}
