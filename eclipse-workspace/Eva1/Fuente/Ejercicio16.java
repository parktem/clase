//bucle que muestre los datos del vector
public class Ejercicio16 {

    public static void main(String arg[]){
    	int datos[]={17, 55, 33, 21, 44};
    	
    	for(int i=0;i<datos.length;i++){		//la propiedad .length nos devuelve el numero de elementos de un vector
    		System.out.println(datos[i]); 		//System.out.printf("El Elemento %d es %d \n", i, datos[i]);
    	}
    	
    	//modificar el contenido del vector multiplicando cada elemento por dos y mostrar por pantalla
    	
    	for(int i=0;i<datos.length;i++){
    		datos[i]*=2;		
    		System.out.println(datos[i]); 		
    	}
    	
    	//valor maximo de los elementos
    	
    	int max=0;
    	for(int i=0;i<datos.length;i++){
    		if(datos[i]>max){
    			max=datos[i];
    		}		
    	}
    	System.out.printf("El maximo valor de la tabla es %d \n", max); 
    		
    	//si todos los valores son negativos
    	int datos1[]={-17, -55, -33, -21, -44};
    	int posicion=0;
    	int max1=datos1[posicion];
    	for(int i=1;i<datos1.length;i++){
    		if(datos1[i]>max){
    			max=datos[i];
    		}		
    	}
    	System.out.printf("El maximo valor de la tabla es %d \n", max1); 
    		
    	//posicion del valor maximo
    	int datos2[]={13, 9, 7, 6, 17};
    	int posicion1=0;
    	int max2=datos2[posicion1];
    	int posicionmax=0;
    	for(int i=1;i<datos2.length;i++){
    		if(datos2[i]>max){
    			max2=datos[i];
    			posicionmax=i;
    		}		
    	}
    	System.out.printf("La posicion del maximo valor de la tabla es %d \n", posicionmax); 
    	
    }
    
    
    
}