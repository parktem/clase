//tenemos una cadena de carac. hacemos una funcion que devuelva una nueva cadena de caracteres en la que cada palabra añadamos una x
public class Ejercicio69 {

     public static void main(String arg[]){
     	char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
     	
     	char frase1[]=modificarCadena(frase);
     	for(int i=0;i<frase1.length;i++){
     		System.out.printf("%c", frase1[i]);
     	}
     }
     public static char[] modificarCadena(char cadena[]){
     	char cadena1[]=new char[100];
     	int cont=0;
     	for(int i=0;i<cadena.length;i++){
     		if(cadena[i]==' '){
     			cadena1[cont]= 'x';
     			cadena1[cont+1]=' ';
     			cont=cont+2;
     		}else{
     			cadena1[i]=cadena[i];
     			cont++;
     			
     		}
     	}
     	return cadena1;
     			
     }
    
    
}