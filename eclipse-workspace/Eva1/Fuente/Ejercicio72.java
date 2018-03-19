//crear una funcion cambiar que cargue frase2 cargando frase 1 con la modificacion de cuando haya una 'a' le metemos dos caracteres 'X'

public class Ejercicio72 {

     public static void main(String arg[]){
    	char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
    	char sustituir = 'a';
    	char sustituto[] = {'X','X'};
    	char frase2[] = new char[100];
    	cambiar(frase,frase2,sustituir,sustituto);
    	System.out.print(frase2);
     }
     
    public static void cambiar(char frase[], char[] frase2,char s1, char[] s2){
    	int cont, i;
    		for(i=0, cont=0;i<frase.length;i++){
    			if(frase[i]==s1){
    				for(int j=0;j<s2.length;j++){
    					frase2[cont]=s2[j];
    					cont++;
    				}
    				
    			}else{
    				frase2[cont]=frase[i];
    				cont++;
    			}
    		}
    }
}