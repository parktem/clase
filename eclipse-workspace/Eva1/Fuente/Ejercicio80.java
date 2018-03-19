//Poner al reves la frase, en una frase distinta, pero solo con palabras
//Ejemplo: "Mancha de la..."
public class Ejercicio80 {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a' };
		char frase2[] = new char[frase.length];
		int inicio = 0;
		int fin = frase.length - 1;
		for (int i = frase.length - 1; i >= 0; i--) {
			if (frase[i] == ' ') {
				inicio = i + 1;
				for (int j = inicio; j < fin; j++) {
					frase2[i - frase.length] = frase[j];
				}
				fin = i - 1;
			}
		}
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}

	}
}