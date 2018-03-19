
public class Ejercicio76me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		int inicio = 0;
		int fin = 0;
		char aux = 0;
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == ' ') {
				fin = i - 1;
				aux = frase[fin];
				for (int j = fin; j > inicio; j--) {
					frase[j] = frase[j - 1];

				}
				frase[inicio] = aux;
				inicio = i + 1;
			}
		}
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}
}
