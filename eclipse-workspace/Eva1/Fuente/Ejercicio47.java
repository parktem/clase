//método de ordenación de la burbuja 


public class Ejercicio47 {

	public static void main (String arg []) {	
		int vector []={18,33,14,60,23,15};
		int intercambio;
			for (int cont=1;cont<vector.length-1;cont++)		
				for (int i=vector.length-1;i>=cont;i--)
					if (vector[i]<vector[i-1]){
						intercambio=vector[i];
						vector[i]=vector[i-1];
						vector[i-1]=intercambio;
					}
			for (int i=0;i<vector.length;i++)
				System.out.println (vector[i]);	
		
		
    }
    
    
}