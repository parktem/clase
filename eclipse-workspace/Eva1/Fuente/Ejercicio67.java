


public class Ejercicio67 {

    public static void main(String arg[]){
    	int kilos[][]= {{1,2,3,4,15,10},{5,3,7,4,8,4}};
    	int multiplicador = 5;
    }
    
    public static void modificacion(int v[][], int multi){
    	for(int i=0; i<v.length;i++){
   		 	for(int j=0;j<v[i].length;j++){
   		 		if(v[i][j]<10){
   		 			v[i][j]*=multi;
   		 		}
   		 	}
    	}
    }
    
    
}