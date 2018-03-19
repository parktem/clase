//declaramos un vector de enteros y lo cargamos con valores desordenados y despues creamos una funcion/metodo que se llame ordenar que recibira el vector de enteros y lo ordenara


public class Ejercicio56 {

   public static void main(String arg[]){
   		int  numeros[]={45,32,17,89,76};
   		ordenarVector(numeros);
   		for(int i=0;i<numeros.length;i++){
   			System.out.println(numeros[i]);
   		}
   }
   public static void ordenarVector(int[] vector){
   		int aux=0;
    	int pos;
    	for(int i=1;i<vector.length;i++){
    		pos=i;
    		while((pos>0)&&(vector[pos]< vector[pos-1])){
    			aux=vector[pos-1];
    			vector[pos-1]=vector[pos];
    			vector[pos]=aux;
    			pos--;
    		}
    	}
   } 
    
}