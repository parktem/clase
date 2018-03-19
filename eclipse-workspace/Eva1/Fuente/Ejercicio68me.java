public class Ejercicio68me {

	public static void main(String arg[]) {
		char frase[] = { 'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M',
				'a', 'n', 'c', 'h', 'a' };
		int espacios = Contadorespacios(frase);
		System.out.println(espacios);
	}

	public static int Contadorespacios(char[] frase) {
		int espacios = 0;
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == ' ') {
				espacios++;
			}
		}
		return espacios;
	}
}