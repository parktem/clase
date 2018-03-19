
public class Ejercicio72me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		char sustituir = 'a';
		char sustituto[] = { 'X', 'X' };
		char frase2[] = new char[100];
		int cont = 0;
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == sustituir) {
				for (int j = 0; j < sustituto.length; j++) {
					frase2[cont] = sustituto[j];
					cont++;
				}
			} else {
				frase2[cont] = frase[i];
				cont++;
			}
		}
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}

	}

}
