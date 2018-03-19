
public class Ejercicio81me {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','n','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a'};
		char Subcadena1[] = {'u','n'};
		char Subcadena2[] = {'x','x','x'};
		char frase2[] = Ponerx(frase, Subcadena1, Subcadena2);
		for (int i = 0; i < frase2.length; i++) {
			System.out.print(frase2[i]);
		}
		
	}
	public static char[] Ponerx(char[] frase, char[] subcadena1, char[] subcadena2) {
		char frase2[]=new char[100];
		int posicion=0;
		for (int i = 0; i < frase.length; i++) {
			if(frase[i]==subcadena1[0]) {
				int j=1;
				int i2=i+1;
				while((j<subcadena1.length)&&(frase[i2]==subcadena1[j])) {
					j++;
					i2++;
					if(j==subcadena1.length) {
						for (int k = 0; k < subcadena2.length; k++) {
							frase2[posicion]=subcadena2[k];
							posicion++;
						}
						i=i2-1;
						
					}else {
						frase2[posicion]=frase[i];
						posicion++;
					}
				}
			}else {
				frase2[posicion]=frase[i];
				posicion++;
			}
		}
		return frase2;
	}
}	
