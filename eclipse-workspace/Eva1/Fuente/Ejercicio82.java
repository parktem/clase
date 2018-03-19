//Hacer desaparecer el caracater de la subcadena
public class Ejercicio82 {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'n', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ',
				'M', 'a', 'n', 'c', 'h', 'a', ' ' };
		char caracter = 'n';
		Eliminarn(frase, caracter);
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}

	}

	public static void Eliminarn(char[] frase, char caracter) {
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == caracter) {
				for (int j = i; j < frase.length - 1; j++) {
					frase[j] = frase[j + 1];
				}
			}
		}
	}
}
