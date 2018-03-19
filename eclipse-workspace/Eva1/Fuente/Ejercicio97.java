
public class Ejercicio97 {

	public static void main(String[] args) {
		String frase1 = "Había una vez un circo ";
		//frase1 = frase1.replace(" ", "a ");
		//System.out.println(frase1);
		String frase2 = "a ";
		int fin = frase1.indexOf(" ", 0);
		int inicio=0;
		while(fin != -1) {
			frase1 = frase1.substring(0, fin).concat("a ").concat(frase1.substring(fin+1, frase1.length()));
			inicio=fin+2;
			fin=frase1.indexOf(" ", fin+2);
		}
		System.out.println(frase1);
	}

}
