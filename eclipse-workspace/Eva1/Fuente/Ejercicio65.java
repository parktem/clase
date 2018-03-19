//mismo ejeercicio que el 62. hacer una funcion que le pasemos la tabla kilos y la tabla precio y devuelva una nueva tabla de enteros

public class Ejercicio65 {

	public static void main(String arg[]) {
		int kilos[][] = { { 1, 2, 3, 4, 15, 10 }, { 5, 3, 7, 4, 11, 8 } };
		int precio[] = { 6, 7 };
		int kilos2[][] = modificarTabla(kilos, precio);
		for (int i = 0; i < kilos.length; i++) {
			for (int j = 0; j < kilos[i].length; j++) {
				System.out.printf("%s ", kilos2[i][j]);
			}
		}
	}

	public static int[][] modificarTabla(int tabla1[][], int tabla2[]) {
		int tabla3[][] = new int[2][6];
		for (int i = 0; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1[i].length; j++) {
				tabla3[i][j] = (tabla1[i][j] * tabla2[i]);
			}
		}
		return tabla3;
	}

}