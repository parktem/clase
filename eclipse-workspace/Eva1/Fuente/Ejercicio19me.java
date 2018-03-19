
public class Ejercicio19me {

	public static void main(String[] args) {
		int datos[] = { -170, 55, 33, 21, 44 };
		int posmax = 0;
		int posicionmax = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > posmax) {
				posmax = datos[i];
				posicionmax = i;
			}
		}
		System.out.println("El número de mayor valor es " + posmax + " y su posicion es " + posicionmax);
		int posmin = 0;
		int posicionmin = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] < posmin) {
				posmin = datos[i];
				posicionmin = i;
			}
		}
		System.out.println("El número de menor valor es " + posmin + " y su posicion es " + posicionmin);
	}

}
