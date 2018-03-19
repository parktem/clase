
public class Ejercicio42 {

   public static void main(String arg[]){
   
   	int t1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
   	int t2[][];
   	t2=new int[4][4];
   		for(int i=0;i<t1.length;i++){
   			for(int j=0;j<t1[i].length;j++){
   			t2[i][j]=t1[j][i];
   			}
   		}
   for(int i=0;i<t1.length;i++){
   			for(int j=0;j<t1[i].length;j++){	
   				System.out.printf("%4s", t1[i][j]);	
   			}
   		System.out.println();
   }
   System.out.println();
   for(int i=0;i<t1.length;i++){
   			for(int j=0;j<t1[i].length;j++){	
   				System.out.printf("%4s", t2[i][j]);	
   			}
   		System.out.println();
   }
   
   
   
   }
    
    
}