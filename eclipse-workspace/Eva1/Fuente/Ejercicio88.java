
public class Ejercicio88 {
	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";

		frase = frase.replace('a', 'X');
		System.out.println(frase);

		frase = frase.replaceAll("lugXr", "sitio");
		System.out.println(frase);

		System.out.printf("La palabra sitio se encuentra en la posicion %d\n ", frase.indexOf("sitio"));

	}
}
