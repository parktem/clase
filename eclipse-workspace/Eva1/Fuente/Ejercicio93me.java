
public class Ejercicio93me {

	public static void main(String[] args) {
		String cadena = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
		int espacio = cadena.indexOf(" ", 0);
		int contadorespacios = 0;
		while (espacio != -1) {
			contadorespacios++;
			espacio = cadena.indexOf(" ", espacio + 1);
		}
		System.out.println(contadorespacios);
		String cadena2[] = new String[contadorespacios];
		int inicio = 0;
		int n = 0;
		int fin = cadena.indexOf(" ", 0);
		while (fin != -1) {
			cadena2[n] = cadena.substring(inicio, fin);
			inicio = fin + 1;
			fin = cadena.indexOf(" ", inicio);
			n++;
		}
		for (int i = 0; i < cadena2.length; i++) {
			System.out.print(cadena2[i] + " ");
		}
		System.out.println();
		String aux;
		for (int i = 0; i < cadena2.length; i++) {
			for (int j = cadena2.length - 1; j > 0; j--) {
				if ((cadena2[j].compareTo(cadena2[j - 1]) < 0)) {
					aux = cadena2[j];
					cadena2[j] = cadena2[j - 1];
					cadena2[j - 1] = aux;
				}
			}
		}
		for (int i = 0; i < cadena2.length; i++) {
			System.out.print(cadena2[i] + " ");
		}
		cadena = "";
		for (int j = 0; j < cadena2.length; j++) {
			cadena = cadena.concat(cadena2[j]);

		}
		System.out.println(cadena);
	}
}