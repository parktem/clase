//Sacar el maximo y el minimo utilizando menos bucles for


public class Ejercicio20 {

   public static void main(String arg[]){
   	int datos[]={12,52,24,77,56};
   	int maximo=datos[0];
   	int minimo=datos[0];
   	int posmax=0;
   	int posmin=0;
 		for(int i=1;i<datos.length;i++){
   			if(datos[i]>maximo){
   				maximo=datos[i];
   				posmax=i;
   			}else if(datos[i]<minimo){
   				minimo=datos[i];
   				posmin=i;
   			}
   		}
   		System.out.println("El maximo valor de la tabla es " + maximo + " y su posicion es " + posmax + " y el minimo valor de la tabla es " + minimo + " y su posicion es " + posmin); 
   }
}	
   			
   	