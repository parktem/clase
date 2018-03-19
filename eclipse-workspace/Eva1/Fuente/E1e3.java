
public class E1e3 {

	public static void main(String[] args) {
		String frase = "En un lugar de La Mancha";
		char frase2[] = new char[frase.length()];
		char frase3[];
		for (int i = 0; i < frase.length(); i++) {
			frase2[i] = frase.charAt(i);
		}
		frase3 = espacios(frase2);
		System.out.println(frase3);
	}

	public static char[] espacios(char cadena[]) {
		char cadena2[] = new char[100];
		int huecos = 0;
		int espacios;
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i] == ' ') {
				huecos++;
			}
		}
		espacios = (50 + cadena.length) / huecos;
		for (int i = 0, j = 0; i < cadena.length; i++, j++) {
			cadena2[j] = cadena[i];
			if (cadena[i] == ' ') {
				for (int z = 0; z < espacios; z++) {
					cadena2[j + 1] = ' ';
					j++;
				}
			}
		}
		return cadena2;
	}
}