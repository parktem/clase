//tenemos un vector cargado de enteros.Debemos desplazar cada valor una posicion a la izq excepto el primero que pasara a la ultima posicion


public class Ejercicio25 {

     public static void main(String arg[]){
     	int datos[]={10,20,30,40,50};
     	int aux=datos[0];
     	for(int i=0;i<datos.length-1;i++){
     		datos[i]=datos[i+1];
     	}
     	datos[datos.length-1]=aux;
     	for(int i=0;i<datos.length;i++){
     		System.out.print(datos[i] + ", ");
     	}
     		System.out.println(); //imprimimos una linea en blanco
     	aux=datos[0];
     	for(int i=1;i<datos.length;i++){
     		datos[i-1]=datos[i];
     	}
     	datos[datos.length-1]=aux;
     	for(int i=0;i<datos.length;i++){
     		System.out.print(datos[i] + ", ");
     	}
     	
     	System.out.println(); //imprimimos una linea en blanco
     	
     	//desplazar todos una posicion a la dcha
     	
     	int datos1[]={10,20,30,40,50};
     	aux=datos1[datos.length-1];
     	
     	for(int i=datos1.length-1;i>=1;i--){
     		datos1[i]=datos1[i-1];
     		
     	}
     	datos1[0]=aux;
     	for(int i=0;i<datos.length;i++){
     		System.out.print(datos1[i] + ", ");
     	}
     }
     
}