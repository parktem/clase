
public class Ejercicio92 {

	public static void main(String[] args) {
		String cadena = "Habia una vez un circo que llenaba siempre el corazon";
		//int inicio = cadena.indexOf(" ", 0);
		int posicion = cadena.indexOf(" ", 0);
		while(posicion != -1) {
			cadena = cadena.substring(0, posicion).concat(cadena.substring(posicion+1, cadena.length()));
			posicion = cadena.indexOf(" ", 0);
		}
		//String subCadena = cadena.substring(0, inicio);
		//String subCadena2 = cadena.substring(inicio+1, cadena.length());			
		
		System.out.println(cadena);

	}

}
