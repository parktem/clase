

public class Ejercicio49 {

    public static void main (String arg []) {
    	int vector []={18,33,14,16,23,15};
    	int aux=0;
    	int cont=0;
    	while(cont<vector.length-1){
    		for(int i=cont+1;i>0;i--){
    			if(vector[i]<vector[i-1]){
    				aux=vector[i-1];
					vector[i-1]=vector[i];
					vector[i]=aux;
    			}
    		}
    		cont++;
    	}
    
    	for (int i=0;i<vector.length;i++)
				System.out.println (vector[i]);
    }
    
    
}