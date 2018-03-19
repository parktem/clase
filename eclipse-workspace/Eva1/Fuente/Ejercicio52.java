//tenemos un vector cargado con 5 enteros. hacer una funcion que devuelva el maximo valor de esos enteros.

public class Ejercicio52 {

    public static void main (String arg []) {
    int  numeros[]={45,32,17,89,76};			//un vector es una variable de tipo puntero. apunta a una direccion de memoria (a la direccion donde se guardara el primero dato del vector
    int max;
    max=maxValor(numeros);
    System.out.println("El maximo valor del vector es " + max);
    }
    public static int maxValor(int[] vector){
    	int maximo=vector[0];
    	for(int i=0;i<vector.length;i++){
    		if(vector[i]>maximo){
    			maximo=vector[i];
    		}
    	}
    	return maximo;
    }
    
}