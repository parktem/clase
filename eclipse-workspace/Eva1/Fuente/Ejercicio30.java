

public class Ejercicio30 {

     public static void main(String arg[]){
     	int tabla[][]={{10,20,-30,40},{50,60,-70,80},{90,100,-110,120}};	//mirar apuntes word para observar la tabla
     		System.out.print("El numero de elementos de la tabla =" + tabla.length);
     		System.out.print(El numero de elementos del primer vector de la tabla =" + tabla[0].length);
    		
    		
    	for(int filas=0;filas<tabla.length;filas++){
    		for(int columnas=0;columnas<tabla[filas].length;columnas++){
    			System.out.print(tabla[filas][columnas] + " ");
    		}
    		System.out.println();
    	}
    		
    	
     }
}