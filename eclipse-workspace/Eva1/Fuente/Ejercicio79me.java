//Lo mismo que en el anterior ejercicio pero actuando sobre la misma frase
public class Ejercicio79me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		char aux = 0;
		for (int i = 0; i < frase.length / 2; i++) {
			aux = frase[i];
			frase[i] = frase[frase.length - 1 - i];
			frase[frase.length - 1 - i] = aux;
		}
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}

}
