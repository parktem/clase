

public class Ejercicio28 {

    public static void main(String arg[]){
   		int datos[]={10,20,30,40,50};
   		int multiplos[]={3,5,7};
   		for(int i=0;i<multiplos.length;i++){
   			for(int j=0;j<datos.length;j++){
   				System.out.print(multiplos[i]*datos[j] + " ");
   				
   			}
   			System.out.println();
   		}
    }
    
}