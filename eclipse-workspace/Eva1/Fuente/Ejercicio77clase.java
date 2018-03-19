
public class Ejercicio77clase {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		char frase2[] = new char[frase.length * 2];
		for (int i = 0; i < frase.length; i++) {
			frase2[i] = frase[i];
		}
		for (int i = 0; i < frase.length; i++) {
			frase2[i + frase.length] = frase[i];
		}
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}

	}
}
