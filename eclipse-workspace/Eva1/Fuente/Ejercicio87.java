
public class Ejercicio87 {

	public static void main(String[] args) {
		String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
		int inicio= 7;
		int fin = 17;
		
		System.out.println("La subcadena contiene : " + frase.substring(inicio, fin));
		for (int i = 0; i < frase.length(); i++) {
			System.out.printf("%s\n", frase.substring(0, i+1));
		}
	}
	

}
