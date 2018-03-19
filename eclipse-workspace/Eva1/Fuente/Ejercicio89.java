//Encontrar cuantas veces se encuentra "sitio".
public class Ejercicio89 {

	public static void main(String[] args) {
		String frase = "En un sitio de la sitio Mancha, de cuyo nombre no quiero sitio acordarme";
		int cont=0;
		int posicion = frase.indexOf("sitio", 0);
		while(posicion != -1) {
			cont++;
			System.out.printf("La palabra sitio se encuentra en la posicion %d\n ", frase.indexOf("sitio", posicion));
			posicion = frase.indexOf("sitio", posicion+1);
		}
		System.out.printf("Ha aparecido %d veces", cont);
		
	}

}
