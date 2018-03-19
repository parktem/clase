//hacer una funcion que devuelva el numero de veces que una subcadena se encuentra dentro de una cadena
//La cadena serán 3 r consecutivas para que cuente.

public class Ejercicio74 {

    public static void main(String arg[]){
    	char frase[] = {'r','r','r','r',' ','a','b','r','r','r','r','r'};
    	char subcadena[]={'r','r','r'};
    	int contador = contar(frase,subcadena);
    	System.out.printf("La subcadena aparece %d veces", contador);
    }
    public static int contar(char cadprin[], char cadsec[]) {
    	int numApariciones=0;
    	for (int i = 0; i < (cadprin.length - cadsec.length + 1); i++) {
    		if(cadprin[i] == cadsec[0]) {
    			int j = 1;
    			int i2 = i + 1;
    			while((j<cadsec.length) && (cadprin[i2] == cadsec[j])) {
    				j++;
    				i2++;
    			}
    			if(j == cadsec.length) {
    				numApariciones++;
    			}
    		}
		}
    	return numApariciones;
    }
}