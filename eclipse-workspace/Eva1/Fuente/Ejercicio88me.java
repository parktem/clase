
public class Ejercicio88me {

	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
		frase = frase.replaceAll("a", "XX");
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i));
		}
		System.out.println();
		frase = frase.replace('e', 'o');
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i));
		}
	}

}
