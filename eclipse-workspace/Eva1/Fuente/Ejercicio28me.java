
public class Ejercicio28me {

	public static void main(String[] args) {
		int multiplos[] = { 3, 5, 7 };
		for (int i = 0; i < multiplos.length; i++) {
			int datos[] = { 10, 20, 30, 40, 50 };
			for (int j = 0; j < datos.length; j++) {
				datos[j] *= multiplos[i];
				System.out.printf("%d ", datos[j]);
			}
			System.out.println();
		}
	}

}
