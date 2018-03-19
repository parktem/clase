
public class Ejercicio97me {

	public static void main(String[] args) {
		String frase1 = "Había una vez un circo ";
		// frase1 = frase1.replace(" ", "a ");
		// System.out.println(frase1);
		String frase2 = "a ";
		int espacio = frase1.indexOf(" ", 0);
		while (espacio != -1) {
			frase1 = frase1.substring(0, espacio).concat(frase2).concat(frase1.substring(espacio + 1, frase1.length()));
			espacio = frase1.indexOf(" ", espacio + 2);
		}
		System.out.println(frase1);
	}

}
