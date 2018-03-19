
public class Ejercicio43 {

    public static void main(String arg[]){
    	int t1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
    	int aux=0;
    	for(int i=0;i<t1.length;i++){
   			for(int j=i;j<t1[i].length;j++){		//el numero de interaciones del bucle anidado depende de la iteracion en la que estemos en el bucle principal
   				aux=t1[j][i];
   				t1[j][i]=t1[i][j];
   				t1[i][j]=aux;
   			}
    	}
    	for(int i=0;i<t1.length;i++){
   			for(int j=0;j<t1[i].length;j++){	
   				System.out.printf("%4s", t1[i][j]);
   			}
   			System.out.println();
    	}
    
    } 
}