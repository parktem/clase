/*modificar los elementos de la tabla de manera que los negativos pasen a positivos y los positivos se multipliquen por 5. 
/primero hacer dos bucles para las modificaciones y otros dos para mostrar por pantalla*/

public class Ejercicio31 {

	public static void main(String arg[]) {
		int tabla[][] = { { 10, 20, -30, 40 }, { 50, 60, -70, 80 }, { 90, 100, -110, 120 } };
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] >= 0) {
					tabla[i][j] *= 5;
				} else {
					tabla[i][j] *= (-1);
				}
			}
		}
		for (int filas = 0; filas < tabla.length; filas++) {
			for (int columnas = 0; columnas < tabla[filas].length; columnas++) {
				System.out.print(tabla[filas][columnas] + " ");
			}
			System.out.println();
		}

	}
}