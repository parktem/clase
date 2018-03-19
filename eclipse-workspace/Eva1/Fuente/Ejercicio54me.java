//cargar en el vector con el salario ganado de enero a mayo el sueldo de cada empleado

public class Ejercicio54me {
	
	public static void main(String arg[]){
		int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
   		int empleadosacum[] = {0,0,0,0,0};
   		salarioporempleados(salarios, empleadosacum);
   		for(int i=0; i<empleadosacum.length; i++) {
   			System.out.printf("El empleado %s cobra %d \n", empleados[i], empleadosacum[i]);
   		}
   		int mesesacum[] = {0,0,0,0,0};     		
   		salariopormeses(salarios, mesesacum); 		
   		for(int i=0; i<mesesacum.length; i++) {
   			System.out.printf("En el mes de %s se cobra en total %d \n", meses[i], mesesacum[i]);
   		}
    }
	//acumulados por empleado
	public static void salarioporempleados(int[][] vec1, int[] vec2) {
		for(int i=0; i<vec1.length; i++) {
    		for(int j=0; j<vec1[i].length; j++) {
    			vec2[i] += vec1[i][j];
    		}
		}	
	}
	//acumulados por meses
	public static void salariopormeses(int[][] vec1, int[] vec2) {
		for(int i=0; i<vec1.length; i++) {
    		for(int j=0; j<vec1[i].length; j++) {
    			vec2[j] += vec1[i][j];
    		}
		}	
	}
}   		