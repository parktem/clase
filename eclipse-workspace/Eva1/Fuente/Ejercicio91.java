//Cada vez que aparezca la subcadena, la ponga en mayusculas
public class Ejercicio91 {

	public static void main(String[] args) {
		String frase[] = {"Erase una vez"};
		String subCadena = "vez";
		int cont=0;
		for (int j = 0; j < frase.length; j++) {
			frase[j] = frase[j].replace(subCadena, subCadena.toUpperCase());			
		}
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	//Función que concatena Strings "concat"
		String fraseTotal = "";
		System.out.println(fraseTotal);
		for (int i = 0; i < frase.length; i++) {
			fraseTotal = fraseTotal.concat(frase[i]);
		System.out.println(fraseTotal);	
		}
	}	
}
