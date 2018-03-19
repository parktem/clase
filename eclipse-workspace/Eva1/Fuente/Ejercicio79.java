//Lo mismo que en el anterior ejercicio pero actuando sobre la misma frase
public class Ejercicio79 {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
		Revertir(frase);
		for (int i = 0; i < frase.length; i++) {
			System.out.printf("%c", frase[i]);	
		}
	}
	public static void Revertir(char [] frase) {
		char aux;
		for (int i = 0; i < frase.length/2; i++) {
			aux = frase[frase.length-i-1];
			frase[frase.length-i-1]=frase[i];
			frase[i]=aux;			
		}
	}
}
