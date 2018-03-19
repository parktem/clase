
public class Ejercicio99 {

	public static void main(String[] args) {
		String frase = "Habia una vez un circo que alegraba el corazon ";
		String frase1= "";
		String frase2= "";
		boolean enFA = true; //False y true son palabras reservadas, y boolean en minusculas es un tipo de dato.
		int inicio=0;
		int fin = frase.indexOf(" ");
		while (fin != -1) {
			if(enFA) {
				frase1 = frase1.concat(frase.substring(inicio, fin+1));
				enFA=false;
			}else {
				frase2 = frase2.concat(frase.substring(inicio, fin+1));
				enFA = true;
			}
			inicio = fin+1;				
			fin = frase.indexOf(" ", fin+1);
		}
		System.out.println(frase1);
		System.out.println(frase2);

	}

}
