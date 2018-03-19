//Cambiar cada primera letra de una palabra por la última y viceversa.
public class Ejercicio75clase {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
		int inicio=0, fin=0;
		char intercambio;
		while(inicio < frase.length) {
			int j = inicio;
			while(frase[j] != ' ')
				j++;
			fin = j-1;
			intercambio = frase[inicio];
			frase[inicio] = frase[fin];
			frase[fin] = intercambio;
			inicio = j+1;
			
		}
			System.out.print(frase);
			
		}
}