
public class Ejercicio71me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		Ponerenmayusculas(frase);
		System.out.println(frase);
	}

	public static void Ponerenmayusculas(char[] frase) {
		for (int i = 0; i < frase.length; i++) {
			frase[i] = Character.toUpperCase(frase[i]);
		}

	}

}
