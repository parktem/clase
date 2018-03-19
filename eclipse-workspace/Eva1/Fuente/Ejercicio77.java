
public class Ejercicio77 {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
		char frase2[] = Repetirfrase(frase);
		for (int i = 0; i < frase2.length; i++) {
			System.out.printf("%c", frase2[i]);
		}
	}
	public static char[] Repetirfrase(char[] frase) {
		char frase2[] = new char [frase.length*2];
		for (int i = 0; i < frase.length; i++) {
			frase2[i]=frase[i];
		}
		for (int i = frase.length; i < frase2.length; i++) {
			frase2[i]=frase2[i-frase.length];
		}
		return frase2;
	}
}