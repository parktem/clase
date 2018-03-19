//sumar en v1 los valores por filas y en v2 los valores por columnas

public class Ejercicio33 {

   	public static void main(String arg[]){
   		int tabla[][]={{10,20,-30,40},{50,60,-70,80},{90,100,-110,120}};
   		int v1[]={0,0,0};
   		int v2[]={0,0,0,0};
   		for(int filas=0;filas<tabla.length;filas++){
    		for(int columnas=0;columnas<tabla[filas].length;columnas++){
    			v1[filas]+=tabla[filas][columnas];
    			v2[columnas]+=tabla[filas][columnas];
   			}
   		}
   		for(int i=0;i<v1.length;i++){
    		System.out.print(v1[i] + " ");
    	}
    	System.out.println();
    	for(int i=0;i<v2.length;i++){
    		System.out.print(v2[i] + " ");
    	}	
    
	}
}