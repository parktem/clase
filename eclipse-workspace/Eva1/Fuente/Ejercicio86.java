//compareTo es una función que compara String
public class Ejercicio86 {

	public static void main(String arg[]) {
		String nombres[] = { "Pepe", "Juan", "María", "Antonio", "Luis" };
		String inter;
		for (int x = 0; x < nombres.length; x++) {
			for (int i = nombres.length - 1; i > x; i--) {
				if (nombres[i].compareTo(nombres[i - 1]) < 0) {
					inter = nombres[i];
					nombres[i] = nombres[i - 1];
					nombres[i - 1] = inter;
				}
			}
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
}