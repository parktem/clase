//Meter frase ordenada en frase3
public class Ejercicio94 {

	public static void main(String[] args) {
		String frase1 = "Hab�a vez circo alegraba el ";
		String frase2 = "una un que siempre coraz�n sin temer jam�s";
		String frase3 = "";

		int inicio1 = 0;
		int fin1 = frase1.indexOf(" ", 0);
		int inicio2 = 0;
		int fin2 = frase2.indexOf(" ", 0);
		while ((fin1 != -1) && (fin2 != 1)) {
			if (fin1 != -1) {
				frase3 = frase3.concat(frase1.substring(inicio1, fin1 + 1));
				inicio1 = fin1 + 1;
				fin1 = frase1.indexOf(" ", fin1 + 1);
			}
			if (fin2 != -1) {
				frase3 = frase3.concat(frase2.substring(inicio2, fin2 + 1));
				inicio2 = fin2 + 1;
				fin2 = frase2.indexOf(" ", fin2 + 1);
			}
		}
		System.out.println(frase3);
	}

}
