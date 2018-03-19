//Sacar el maximo y el minimo

public class Ejercicio19 {

	public static void main(String arg[]) {
		int datos[] = { -170, 55, 33, 21, 44 };
		int maximo = datos[0];
		int minimo = datos[0];
		for (int i = 1; i < datos.length; i++) {
			if (datos[i] > maximo) {
				maximo = datos[i];
			} else if (datos[i] < minimo) {
				minimo = datos[i];
			}
		}
		System.out.println("El maximo valor de la tabla es " + maximo + " y el minimo valor de la tabla es " + minimo);

		int posmax = 0;
		int posmin = 0;
		for (int i = 1; i < datos.length; i++) {
			if (datos[i] > datos[posmax]) {
				posmax = i;
			} else if (datos[i] < datos[posmin]) {
				posmin = i;
			}
		}
		System.out.println("La posicion del maximo valor de la tabla es " + posmax
				+ " y del minimo valor de la tabla es " + posmin);
	}

}