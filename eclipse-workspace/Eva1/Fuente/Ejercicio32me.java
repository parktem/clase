
public class Ejercicio32me {

	public static void main(String[] args) {
		int tabla[][] = { { 10, 20, -30, 40 }, { 50, 60, -70, 80 }, { 90, 100, -110, 120 } };
		int v1[] = { 2, 4, 6 };
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] *= v1[i];
			}
		}
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.printf("%d ", tabla[i][j]);
			}
			System.out.println();
		}
	}

}
