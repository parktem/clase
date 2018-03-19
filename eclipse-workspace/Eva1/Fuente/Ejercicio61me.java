
public class Ejercicio61me {

	public static void main(String[] args) {
		int tabla1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int multiplicador = 4;
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1.length; j++) {
				System.out.printf("%d ", Multiplicar(tabla1, multiplicador));
			}
		}

	}

	public static void Multiplicar(int tabla[][], int multiplicador) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = tabla[i][j] * multiplicador;
			}
		}
	}

}
