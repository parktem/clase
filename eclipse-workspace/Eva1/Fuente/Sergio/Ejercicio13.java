package Sergio;

public class Ejercicio13 {

	public static void main(String[] args) {
		int[] datos = { 44, 33, 1, 6, 78, 12 };
		int posmax = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > posmax) {
				posmax = datos[i];
			}
		}
		System.out.println("El valor mayor es " + posmax);
	}

}
