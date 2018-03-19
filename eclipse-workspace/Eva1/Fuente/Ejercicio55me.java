//mismo ejercicio que el 54 pero la funcion devuelve un dato de tipo int


public class Ejercicio55me {


//Ejercicio muy importante de paso de parametros
   public static void main(String arg[]){
		int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
   		int empleadosacum[] = {0,0,0,0,0};
   		empleadosacum=Sumaporempleados(salarios);
   		for(int i=0; i<empleadosacum.length; i++){
   			System.out.printf("El empleado %s cobra %d \n", empleados[i], empleadosacum[i]);
   		}
   		int mesesAcum[];
   		mesesAcum=Sumapormeses(salarios);
   		for(int i=0; i<mesesAcum.length;i++){
   		System.out.println(meses[i] + ": " + mesesAcum[i]);
   		}
   }
   //Suma por empleados
   public static int[] Sumaporempleados(int[][] vec) {
	   int acum[] = {0,0,0,0,0};
	   for(int i=0; i<vec.length; i++){
		   for(int j=0; j<vec[i].length; j++){
  		 		acum[i] += vec[i][j];
  		 	}
	   } 	
       return acum; 
   }
   //Suma por meses
   public static int[] Sumapormeses(int[][] sueldos) {
	   int acumulados[]={0,0,0,0,0};
   	for(int i=0; i<sueldos.length;i++){
  		 	for(int j=0;j<sueldos[i].length;j++){
   			acumulados[j] += sueldos[i][j];
  		 	}
   	}
   	return acumulados;
   }
}   