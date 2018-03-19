//Tenemos una cadena en la que pondra "En un lungar..." (lungar) y luego tendremos dos cadenas que se llamaran Subcadena1 y 
//Subcadena2, y el programa deberá sustituir las apariciones de la Subcadena1 por las de Subcadena2.
// El resultado se guardará en otra cadena (Intentar en casa sobre la misma frase)
public class Ejercicio81 {

	public static void main(String[] args) {
		char frase[] = {'E','n',' ','u','n',' ','l','u','n','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a'};
		char Subcadena1[] = {'u','n'};
		char Subcadena2[] = {'x','x','x'};
		char frase2[]= Modificar(frase, Subcadena1, Subcadena2);
		for (int i = 0; i < frase2.length; i++) {
			System.out.printf("%c", frase2[i]);			
		}	
		
		
	}
	public static char[] Modificar(char[] cadprin, char[] cadsec, char[] Subcadena2) {
		char cadena[]=new char[100];
		int posicion=0;
    	for (int i = 0; i < cadprin.length; i++) {
    		if(cadprin[i] == cadsec[0]) {
    			int j = 1;
    			int i2 = i + 1;
    			while((j<cadsec.length) && (cadprin[i2] == cadsec[j])) {
    				j++;
    				i2++;
    			}	
    			if(j == cadsec.length) {
    				for (int k = 0; k < Subcadena2.length; k++) {
						cadena[posicion]=Subcadena2[k];
						posicion++;
					}
    				i=i2-1;
    			}else {
    				cadena[posicion]=cadprin[i];
    				posicion++;
    			}
    				
    		}else {
    			cadena[posicion]=cadprin[i];
    			posicion++;
    		}
    	}
    	return cadena;
	}
}
