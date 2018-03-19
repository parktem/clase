

public class Ejercicio71 {

   public static void main(String arg[]){
     	char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
     	caracGrandes(frase);
     	for(int i=0;i<frase.length;i++){
     		System.out.printf("%c", frase[i]);
     	}
     }
   //hacer una funcion que cambie los caracteres en mayusculas
   public static void caracGrandes(char cadena[]){
     		for(int i=0;i<cadena.length;i++){
     			cadena[i]=Character.toUpperCase(cadena[i]);
    		}
     }
    
}
    
