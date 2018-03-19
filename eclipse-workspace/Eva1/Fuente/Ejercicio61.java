//tenemos un array bidimensional. hacer una funcion a la que lepasamos la tabla y el entero y modifique la tabla multiplicando todos los elementos por el entero(multiplicador)

public class Ejercicio61 {

     public static void main(String arg[]){
     	int tabla1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     	int multiplicador = 4;
     	multiplicadorTabla(tabla1,multiplicador);
     	for(int i=0; i<tabla1.length;i++){
   		 	for(int j=0;j<tabla1[i].length;j++){
     			System.out.printf("%s ", tabla1[i][j]);
   		 	}
   		 	System.out.println();
     	}
     }
     public static void multiplicadorTabla(int tabla[][], int num){
     		for(int i=0; i<tabla.length;i++){
   		 		for(int j=0;j<tabla[i].length;j++){
   		 			tabla[i][j] *= num;
   		 		}
     		}
     }
    
}