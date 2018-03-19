//Poner la cadena al reves en una nueva cadena
public class Ejercicio78me {

	public static void main(String[] args) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a', ' ' };
		char frase2[] = new char[frase.length];
		for (int i = 0; i < frase.length; i++) {
			frase2[frase.length - 1 - i] = frase[i];
		}
		for (int j = 0; j < frase2.length; j++) {
			System.out.print(frase2[j]);
		}
	}

}
