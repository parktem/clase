
public class Ejercicio74me {
	public static void main(String[] args) {
		char frase[] = { 'r', 'r', 'r', 'r', ' ', 'a', 'b', 'r', 'r', 'r', 'r', 'r' };
		char subcadena[] = { 'r', 'r', 'r' };
		int cont = 0;
		int contadorcadenas = 0;
		while (cont < frase.length) {
			if (frase[cont] == subcadena[0]) {
				int comprobar = 0;
				for (int i = 0; i < subcadena.length; i++) {
					if (frase[cont] == subcadena[i]) {
						comprobar++;
						cont++;
					}
				}
				if (comprobar == subcadena.length) {
					contadorcadenas++;
				}
			} else {

			}
			cont++;
		}
		System.out.println(contadorcadenas);
	}
}
