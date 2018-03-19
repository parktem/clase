
public class Ejercicio84 {

	public static void main(String[] args) {
		char frase[] = {'e','n',' ','u','n',' ','l','u','n','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','c','h','a',' '};
		Convertirmayusculas(frase);
		for (int i = 0; i < frase.length; i++) {
			System.out.print(frase[i]);
		}
	}
	public static void Convertirmayusculas(char[] frase) {
		int inicio=0;
		int fin=0;
		int cont=0;
		while(cont<=frase.length) {
			int i=cont;
			if(frase[i]==' ') {
				fin=i-1;
				frase[inicio]=Character.toUpperCase(frase[inicio]);
				frase[fin]=Character.toUpperCase(frase[fin]);
				cont++;
				inicio=i+1;
			}else {
				cont++;
			}
		}
	}
}
