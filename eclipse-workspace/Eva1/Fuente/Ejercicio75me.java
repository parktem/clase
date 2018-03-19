//Cambiar cada primera letra de una palabra por la última y viceversa.
public class Ejercicio75me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		int inicio = 0;
		int fin = 0;
		char aux = 0;
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == ' ') {
				fin = i - 1;
				aux = frase[inicio];
				frase[inicio] = frase[fin];
				frase[fin] = aux;
				inicio = i + 1;
			}
		}
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}
}