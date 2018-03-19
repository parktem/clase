
public class Ejercicio89me {

	public static void main(String[] args) {
		String frase = "En un sitio de la sitio Mancha, de cuyo nombre no quiero sitio acordarme";
		// ¿Donde se encuentra la palabra sitio?
		int posicion = frase.indexOf("sitio", 0);
		System.out.println(posicion);
		int contador = 0;
		while (posicion != -1) {
			System.out.println(posicion);
			posicion = frase.indexOf("sitio", posicion + 1);
			contador++;
		}
		System.out.println("La palabra sitio aparece " + contador + " veces");

	}

}
