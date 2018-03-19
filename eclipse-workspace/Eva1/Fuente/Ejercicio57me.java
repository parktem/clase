//transformar la tabla de salarios de manera que los elementos de sus filas queden ordenados de forma ascendente
public class Ejercicio57me {
	public static void main(String arg[]){
    	int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
    	for(int i=0; i<salarios.length; i++) {
    		Ordenar(salarios[i]);
    	}
    	for(int i=0; i<salarios.length;i++){
    		for(int j=0; j<salarios.length; j++){
    			System.out.printf(" %d ", salarios[i][j]);
    		}
    		System.out.println();
    	}
	}
	public static void Ordenar(int[] vec) {
		int aux = 0;
		for(int cont=0; cont<vec.length; cont++) {
			   for(int i=0; i<vec.length-1; i++) {
				   if(vec[i] > vec[i+1]) {
					   aux = vec[i+1];
					   vec[i+1] = vec[i];
					   vec[i]=aux;
				   }
			   }
		}	   
	}
}	