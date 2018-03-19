
public class Ejercicio24me {

	public static void main(String[] args) {
		int datos[] = { -10, 20, -30, 40, -77 };
		double acum = 0;
		for (int i = 0; i < datos.length; i++) {
			acum += datos[i];
		}
		acum /= datos.length;
		System.out.println(acum);

	}

}
