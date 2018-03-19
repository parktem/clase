//posicion del valor maximo
public class Ejercicio17 {

   public static void main(String arg[]){
    	int datos[]={13, 9, 7, 6, 17};
    	int posicion=0;
    	int max=datos[posicion];
    	int posicionmax=0;
    	for(int i=1;i<datos.length;i++){
    		if(datos[i]>max){
    			max=datos[i];
    			posicionmax=i;
    		}		
    	}
    	System.out.printf("La posicion del maximo valor de la tabla es %d \n", posicionmax); 
    	
    }
    
    
    
}