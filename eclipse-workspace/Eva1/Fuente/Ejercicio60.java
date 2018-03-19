//funcion que devuelva los elementos de un vector y desde el programa principal mostramos de cada empleado cuanto ha ganado


public class Ejercicio60 {

    public static void main(String arg[]){
    	int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		for(int i=0; i<empleados.length;i++){
   				System.out.println("El salario de " + empleados[i] + " es de " + acumSalario(salarios[i]) + " euros.");
   		}
    }
    
    public static int acumSalario(int vector[]){
    	int acum=0;
    	for(int i=0; i<vector.length;i++){
   		 	acum += vector[i];
    	}
    	return acum;
    }
    
}