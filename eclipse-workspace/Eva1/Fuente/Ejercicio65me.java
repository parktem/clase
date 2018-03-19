
public class Ejercicio65me {

	public static void main(String[] args) {
		int kilos[][] = { { 1, 2, 3, 4, 15, 10 }, { 5, 3, 7, 4, 11, 8 } };
		int precio[] = { 6, 7 };
		int resultado[][] = Multiplicar(kilos, precio);
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				System.out.printf("%d ", resultado[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] Multiplicar(int[][] kilos, int[] precio) {
		int aux[][] = new int[2][6];
		for (int i = 0; i < precio.length; i++) {
			for (int j = 0; j < kilos[i].length; j++) {
				aux[i][j] = kilos[i][j] * precio[i];
			}
		}
		return aux;
	}
}
