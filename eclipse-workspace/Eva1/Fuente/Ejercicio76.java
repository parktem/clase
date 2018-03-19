
public class Ejercicio76 {
	public static void main(String arg[]) {

		char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
		int inicio=0, fin=0;
		while(inicio < frase.length) {
			int j= inicio;
			while(frase[j] != ' ')
				j++;
			fin = j-1;
			desplazar(frase, inicio, fin);
			inicio=j+1;	
		}
		System.out.println(frase);
	}
	public static void desplazar(char[] frase, int inicio, int fin) {
		char guardar = frase[fin];
		for(int i=fin; i > inicio; i--)
			frase[i] = frase[i-1];
		frase[inicio] = guardar;		
		
	}

}
