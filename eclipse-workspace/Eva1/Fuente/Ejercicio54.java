//cargar en el vector con el salario ganado de enero a mayo el sueldo de cada empleado

public class Ejercicio54 {
	
	public static void main(String arg[]){
		int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
   		int empleadosAcum[]= {0,0,0,0,0};
   		salarioEmpleados(salarios,empleadosAcum);
   		for(int i=0; i<empleadosAcum.length;i++){
   		System.out.println(empleados[i] + ": " + empleadosAcum[i]);
   		}
   		int mesesAcum[]={0,0,0,0,0};
   		salarioMeses(salarios,mesesAcum);
   		for(int i=0; i<empleadosAcum.length;i++){
   			System.out.println(meses[i] + ": " + mesesAcum[i]);
   		}
	}
    //acumulado por empleados
    public static void salarioEmpleados(int vector1[][], int vector2[]){
    	for(int i=0; i<vector1.length;i++){
   		 	for(int j=0;j<vector1[i].length;j++){
   		 		vector2[i]+=vector1[i][j];
   		 	}
    	}
    }
    
    //acumulado por meses
    public static void salarioMeses(int vector1[][], int vector2[]){
    	for(int i=0; i<vector1.length;i++){
   		 	for(int j=0;j<vector1[i].length;j++){
   		 		vector2[j]+=vector1[i][j];
   		 	}
    	}
    }
}