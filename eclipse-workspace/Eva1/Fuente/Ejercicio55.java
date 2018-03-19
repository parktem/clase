//mismo ejercicio que el 54 pero la funcion devuelve un dato de tipo int


public class Ejercicio55 {


//Ejercicio muy importante de paso de parametros
   public static void main(String arg[]){
		int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
   		int empleadosAcum[]= {0,0,0,0,0};
   		empleadosAcum=sumasParciales(salarios);
   		for(int i=0; i<empleadosAcum.length;i++){
   		System.out.println(empleados[i] + ": " + empleadosAcum[i]);
   		}
   		System.out.println();
   		int mesesAcum[];
   		mesesAcum=sumaMeses(salarios);
   		for(int i=0; i<mesesAcum.length;i++){
   		System.out.println(meses[i] + ": " + mesesAcum[i]);
   		}
   		
	}
	//acumulados por empleados
	public static int[] sumasParciales(int[][] sueldos){
		int acumulados[]={0,0,0,0,0};
		for(int i=0; i<sueldos.length;i++){
   		 	for(int j=0;j<sueldos[i].length;j++){
				acumulados[i] += sueldos[i][j];
			}
		}
		return acumulados;
	}
    
    //acumulado por meses
    public static int[] sumaMeses(int[][] sueldos){
    	int acumulados[]={0,0,0,0,0};
    	for(int i=0; i<sueldos.length;i++){
   		 	for(int j=0;j<sueldos[i].length;j++){
    			acumulados[j] += sueldos[i][j];
   		 	}
    	}
    	return acumulados;
    }
    
    
}