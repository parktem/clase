
//cambiar el orden de los elementos

public class Ejercicio21 {

   public static void main(String arg[]){
   	int datos[]={10,20,30,40,50,77,85};
   	int aux;
   		for(int i=0;i<datos.length/2;i++){
   			aux=datos[i];
   			datos[i]=datos[datos.length-i-1];
   			datos[datos.length-i-1]=aux;
   		}
   		for(int i=0;i<=datos.length-1;i++){
   			System.out.println(datos[i]);
   		}
	}
}