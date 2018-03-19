
public class Ejercicio86me {

	public static void main(String[] args) {
		String nombres[] = { "Pepe", "Juan", "María", "Antonio", "Luis" };
		String aux;
		for (int i = 0; i < nombres.length; i++) {
			for (int j = nombres.length - 1; j > 0; j--) {
				if ((nombres[j].compareTo(nombres[j - 1])) < 0) {
					aux = nombres[j];
					nombres[j] = nombres[j - 1];
					nombres[j - 1] = aux;
				}
			}
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
}
