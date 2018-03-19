
public class Ejercicio17me {

	public static void main(String[] args) {
		int datos[] = { 13, 9, 7, 6, 17 };
		int posmax = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > posmax) {
				posmax = datos[i];
			}
		}
		System.out.println(posmax);

	}

}
