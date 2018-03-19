
public class Ejercicio25me {

	public static void main(String[] args) {
		int datos[] = { 10, 20, 30, 40, 50 };
		int comienzo = datos[0];
		for (int i = 0; i < datos.length - 1; i++) {
			datos[i] = datos[i + 1];
		}
		datos[datos.length - 1] = comienzo;
		for (int i = 0; i < datos.length; i++) {
			System.out.printf("%d: ", datos[i]);
		}
	}

}
