


public class Ejercicio68 {

     public static void main(String arg[]){
     	char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a'};
     	System.out.printf("El numero total de espacios es %d ", detectarEspacios(frase));
     }
     public static int detectarEspacios(char carac[]){
     	int cont=0;
     	for(int i=0;i<carac.length;i++){
     		if(carac[i]==' '){
     			cont++;
     		}
     	}
     	return cont;
     }
} 