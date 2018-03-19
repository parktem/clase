//Cambiar cada primera letra de una palabra por la última y viceversa.
public class Ejercicio75 {

    public static void main(String arg[]){
    	char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
    	Modificar(frase);
    	for (int i = 0; i < frase.length; i++) {
			System.out.printf("%c", frase[i]);
		}
    }
    public static void Modificar(char[] frase1) {
    	char aux;
    	char inicio;
    	char fin;
    	int inicionum = 0;
    	int i = 0;
		int contadorespacios = 0;
		for (int j = 0; j < frase1.length; j++) {
    		if(frase1[j] == ' ') {
    			contadorespacios++;
    		}
		}
		while(contadorespacios > 0) {
			if(frase1[i] == ' ') {
				contadorespacios--;
				fin = frase1[i-1];
				frase1[i-1] = frase1[inicionum];
				frase1[inicionum]=fin;
				inicionum=i+1;
			}
			i++;
		}		
	
        	
    }
}    