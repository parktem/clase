
public class Ejercicio90me {

	public static void main(String[] args) {
		String frase = "En un sitio de la sitio Mancha, de cuyo nombre no quiero sitio acordarme";
		System.out.println(frase.charAt(10));
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a') {
				contador++;
			}
		}
		System.out.println(contador);
	}

}
