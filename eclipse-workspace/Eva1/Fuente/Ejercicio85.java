
public class Ejercicio85 {

	public static void main(String[] args) {
		char frase[] = {'e','n',' ','u','n',' ','l','u','n','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','c','h','a',' '};
		
		for (int i = 0; i < frase.length; i++) {
			switch(frase[i]) {
			case 'A': case 'E': case 'I': case 'O': case 'U':
				frase[i]=Character.toLowerCase(frase[i]);
				break;
			case 'a': case 'e': case 'i': case 'o': case 'u':
				frase[i]=Character.toUpperCase(frase[i]);
				break;
			default:
				frase[i]= '$';
			}
			System.out.print(frase[i]);
		}
	}
}	
