
public class Ejercicio80clase {

	public static void main(String[] args) {
		char frase[] = {' ','E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a'};
		char frase2 [] = new char[100];
		int inicio = frase.length-1;
		int fin = inicio;
		int i2 = 0; //va a indicar la posición del elemento en introducir en frase2
		while(inicio > 0) {
			while(frase[inicio] != ' ')
				inicio--;
			for (int i = 0; i < (fin-inicio+1); i++, i2++) 
				frase[i2] = frase[inicio+i];
			inicio--;
			fin=inicio;
		}
		System.out.println(frase2);

	}

}
