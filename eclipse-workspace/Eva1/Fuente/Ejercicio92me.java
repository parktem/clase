
public class Ejercicio92me {

	public static void main(String[] args) {
		String cadena = "Habia una vez un circo que llenaba siempre el corazon";
		// Queremos quitar los espacios
		int inicio = 0;
		int fin = 0;
		int espacio = cadena.indexOf(" ", 0);
		while (espacio != -1) {
			cadena = cadena.substring(0, espacio).concat(cadena.substring(espacio + 1, cadena.length()));
			espacio = cadena.indexOf(" ", espacio + 1);
		}
		System.out.println(cadena);

	}

}
