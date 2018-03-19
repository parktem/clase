//modificar los valores de tabla de manera que el primer vector de tabla se multiplique por el primer elemento de v1, el segundo vector de tabla se multiplique por el segundo elemento del vector v1...

public class Ejercicio32 {
	
	public static void main(String arg[]){
		int tabla[][]={{10,20,-30,40},{50,60,-70,80},{90,100,-110,120}};
    	int v1[]={2,4,6};
    	for(int filas=0;filas<tabla.length;filas++){
    		for(int columnas=0;columnas<tabla[filas].length;columnas++){
    			tabla[filas][columnas]*=v1[filas];
    		}
    	}
    	for(int filas=0;filas<tabla.length;filas++){
    		for(int columnas=0;columnas<tabla[filas].length;columnas++){
    			System.out.print(tabla[filas][columnas] + " ");
    		}
    		System.out.println();
    	}		
	}
    
}