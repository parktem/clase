
public class Ejercicio91me {

	public static void main(String[] args) {
		String frase[] = { "Erase una vez" };
		String subCadena = "vez";
		for (int i = 0; i < frase.length; i++) {
			frase[i] = frase[i].replace(subCadena, subCadena.toUpperCase());
		}
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}

}
