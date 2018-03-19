//la función charAt() espera devolver un entero con el caracter que deseas extraer.
public class Ejercicio90 {

	public static void main(String[] args) {
		String frase = "En un sitio de la sitio Mancha, de cuyo nombre no quiero sitio acordarme";
		System.out.printf("El caracter de la posicion 10 es %c\n\n", frase.charAt(10));
		//Hay que buscar dentro de los strings de frase2, cuantas veces aparece el caracter a
		String frase2[] = {"Erase una vez", "Habla una vez", "Cada vez", "De vez den cuando"};
		
		int cont=0;
		for (int i = 0; i < frase2.length; i++) {
			for (int j = 0; j < frase2[i].length(); j++) {
				if(frase2[i].charAt(j) == 'a') {
					cont++;
				}
			}
		}
		System.out.printf("La letra 'a' aparece %d veces", cont);
	}
}
