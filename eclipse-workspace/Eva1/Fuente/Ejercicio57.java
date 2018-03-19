//transformar la tabla de salarios de manera que los elementos sus filas queden ordenados de forma ascendente


public class Ejercicio57 {
	public static void main(String arg[]){
    	int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
    	for(int i=0;i<salarios.length;i++){
    		ordenarTabla(salarios[i]);
    	}
    	for(int i=0;i<salarios.length;i++){
    		for(int j=0;j<salarios[i].length;j++){
    			System.out.printf(" %s ",salarios[i][j]);
    		}
   			System.out.println();
   		}
	}
	
	
	public static void ordenarTabla(int[] vector){
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
	}
}