
public class Ejercicio34me {

	public static void main(String[] args) {
		int kilos[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		String productos[] = { "Naranjas", "Peras", "Manzanas" };
		for (int i = 0; i < kilos.length; i++) {
			int acum = 0;
			for (int j = 0; j < kilos[i].length; j++) {
				acum += kilos[i][j];
			}
			System.out.printf("Hay %d kilos de %s\n", acum, productos[i]);
		}
	}

}
