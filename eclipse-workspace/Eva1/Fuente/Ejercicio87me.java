
public class Ejercicio87me {

	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
		int inicio = 0;
		int fin = 17;
		System.out.println("La subcadena contiene: " + frase.substring(inicio, fin));
		for (int i = 0; i < frase.length() + 1; i++) {
			System.out.println(frase.substring(0, i));
		}
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.println(frase.substring(0, i));
		}

	}

}
