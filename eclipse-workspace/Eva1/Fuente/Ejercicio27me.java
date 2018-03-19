
public class Ejercicio27me {

	public static void main(String[] args) {
		int datos[] = { 10, 20, 30, 40, 50 };
		int aux = 0;
		for (int j = datos.length - 1; j > 0; j--) {
			datos[j] = datos[j - 1];
			System.out.printf("%d :", datos[j]);

		}
	}

}
