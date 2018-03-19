public class Pruebamayusculas{
	public static void main(String arg[]) {
		char frase [] = {'s', 'i', 'r', 'v', 'i', 'e', 'n', 't', 'e'};
		Ponerenmayusculas(frase);
		for (int i = 0; i < frase.length; i++) {
			System.out.printf("%c", frase[i]);
		}
		
	}
	public static void Ponerenmayusculas(char[] frase) {
		for (int i = 0; i < frase.length; i++) {
			frase[i] = Character.toUpperCase(frase[i]);
		}
	}
}