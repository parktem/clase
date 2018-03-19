
public class Ejercicio34 {

	public static void main(String arg[]) {
		int kilos[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 } };
		String productos[] = { "Naranjas", "Peras", "Manzanas" };
		for (int i = 0; i < kilos.length; i++) {
			int suma = 0;
			for (int j = 0; j < kilos[i].length; j++) {
				suma += kilos[i][j];
			}
			System.out.println("La cantidad de " + productos[i] + " es de " + suma);
		}

		int vAcum[] = { 0, 0, 0 };
		for (int i = 0; i < kilos.length; i++) {
			for (int j = 0; j < kilos[i].length; j++) {
				vAcum[i] += kilos[i][j];
			}

		}
		for (int i = 0; i < kilos.length; i++) {
			System.out.println("La cantidad de " + productos[i] + " es de " + vAcum[i]);

		}

	}

}