
public class Ejercicio23me {

	public static void main(String[] args) {
		int datos[] = { -10, 20, -30, 40, -77 };
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] < 0) {
				datos[i] *= -1;
			} else {
				datos[i] *= 2;
			}
		}
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}

	}

}
