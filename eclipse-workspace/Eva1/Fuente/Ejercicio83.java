//Mezcla entre ejercicio 82 y 81. Detectar cadena y eliminarla echando la frase hacia la izquierda
public class Ejercicio83 {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','n','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
		char subcadena[] = {'u','n'};
		Eliminarsubcadena(frase, subcadena);
		for (int i = 0; i < subcadena.length; i++) {
			System.out.print(frase[i]);
		}
	}
	public static void Eliminarsubcadena(char[] frase, char[] subcadena) {
		int numletras=frase.length;
		for(int i = 0; i < (frase.length - subcadena.length+1); i++) {
			if(frase[i] == subcadena[0]) {
				int j=1;
				int i2=i+1;
				while((j < subcadena.length) && (frase[i2] == subcadena[j])) {
					j++;
					i2++;
				}
				if(j == subcadena.length) {
					for (int k = 0; k < subcadena.length; k++) {
						for (int z = i; z < numletras-1; z++) 
							frase[z]=frase[z+1];
						frase[numletras-1]=' ';
						numletras--;
					}
				}
			}
		}
	}
}
