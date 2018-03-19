//método de inserción directa


public class Ejercicio48 {

	public static void main (String arg []) {
		int vector []={18,33,14,60,23,15};
		int posmin;
		int intercambio;
			for (int cont=1;cont<vector.length;cont++){
				posmin= cont-1;		
				for (int i=cont-1;i<vector.length;i++){
					if (vector[posmin]>vector[i])
						posmin=i;
				}
				intercambio=vector[cont-1];
				vector[cont-1]=vector[posmin];
				vector [posmin]=intercambio;
			
			}		
			for (int i=0;i<vector.length;i++)
				System.out.println (vector[i]);
					
				}
		
		
		
		
		
		
    }
    
    
