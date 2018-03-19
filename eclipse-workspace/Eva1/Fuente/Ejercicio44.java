
public class Ejercicio44 {

    public static void main(String arg[]){
    	int t1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    	int aux=0;
    	int pos=t1.length-1;
    	for(int i=0;i<t1.length;i++){
   			for(int j=0;j<t1[i].length;j++){
   				if(i==j){
   					aux=t1[i][j];
   					t1[i][j]=t1[i][pos];
   					t1[i][pos]=aux;
   				}
   			}
   			pos--;
    	}
    /*	for(int i=0;i<t1.length;i++){
   					aux=t1[i][i];
   					t1[i][i]=t1[i][t1.length-i-1];
   					t1[i][t1.length-i-1]=aux;
    		
    	}	*/
    		for(int i=0;i<t1.length;i++){
   				for(int j=0;j<t1[i].length;j++){	
   					System.out.printf("%4s", t1[i][j]);
   				}
   			System.out.println();
    		}
    
    
    }
    
    
}