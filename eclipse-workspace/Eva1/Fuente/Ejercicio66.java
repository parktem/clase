//hacer la funcion sumarKilos y esa funcion debe devolver u nvector de dos enteros con la suma de los elementos de un vector y del otro


public class Ejercicio66 {

    public static void main(String arg[]){
    	int kilos[][]= {{1,2,3,4,15,10},{5,3,7,4,8,4}};
    	String productos[]={"Peras", "Manzanas"};
    	int suma[]=sumarKilos(kilos);
    	for(int i=0;i<suma.length;i++){
    		System.out.printf("La cantidad de kilos totales de %s es de %d. ", productos[i], suma[i]);
    	}
    }
    
    public static int[] sumarKilos(int tabla[][]){
    	int tabla2[]= new int[2];
    	for(int i=0; i<tabla.length;i++){
   		 	for(int j=0;j<tabla[i].length;j++){
   		 		tabla2[i]+=tabla[i][j];
   			}
    	}
    	return tabla2;
	}
}