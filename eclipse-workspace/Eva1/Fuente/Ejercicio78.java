//Poner la cadena al reves
public class Ejercicio78 {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};			
		char frase2 [] = Invertir(frase);
		System.out.print(frase2);
	}
	public static char[] Invertir(char[] frase) {
		char frase2[] = new char[100];
		for (int i = frase.length-1; i >= 0; i--) {
			frase2[frase.length-i-1] = frase[i];
		}
		return frase2;
	}

}
