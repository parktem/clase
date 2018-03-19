//declaramos un vector de enteros y lo cargamos con valores desordenados y despues creamos una funcion/metodo que se llame ordenar que recibira el vector de enteros y lo ordenara


public class Ejercicio56me {

   public static void main(String arg[]){
   		int numeros[]={45,32,17,89,76};
   		Ordenar(numeros);
   		for(int i=0;i<numeros.length;i++){
   			System.out.println(numeros[i]);
   		}	
   }
   public static void Ordenar(int[] vec) {
	   int aux = 0;
	   for(int cont=0; cont<vec.length; cont++) {
		   for(int i=0; i<vec.length-1; i++) {
			   if(vec[i] > vec[i+1]) {
				   aux = vec[i+1];
				   vec[i+1] = vec[i];
				   vec[i]=aux;
			   }	   
		   }
	   }
   }
}   