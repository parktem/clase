//Otra orma de realizar el ejercicio 17 de obtener la posicion del valor maximo


public class Ejercicio18 {

    public static void main(String arg[]){
    	int datos[]={-17,-55,-33,-21,-44};
    	int maximo=datos[0];
    	
    	for(int i=1;i<datos.length;i++){
    		if(datos[i]>maximo){
    			maximo=datos[i];
    		}
    	}
    	System.out.println("El maximo valor de la tabla es " + maximo); 
    	
    	int posmax=0;
    	for(int i=1;i<datos.length;i++){
    		if(datos[i]= datos[posmax]){
    			posmax=i;
    		}
    	}
    	System.out.printf("El maximo valor de la tabla es %d y está en la posicion %d", datos[posmax], posmax); 
   	}
    	
    	}
    
    
}