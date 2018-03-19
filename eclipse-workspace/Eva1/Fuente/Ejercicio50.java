
public class Ejercicio50 {

   public static void main (String arg []) {
    	int vector []={18,33,14,16,23,15};
    	int aux=0;
    	int pos;
    	for(int i=1;i<vector.length;i++){
    		pos=i;
    		while((pos>0)&&(vector[pos]< vector[pos-1])){
    			aux=vector[pos-1];
    			vector[pos-1]=vector[pos];
    			vector[pos]=aux;
    			pos--;
    		}
    	}
    	for (int i=0;i<vector.length;i++)
				System.out.println (vector[i]);
   }
}