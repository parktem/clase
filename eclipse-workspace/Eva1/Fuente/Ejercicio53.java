


public class Ejercicio53 {

    public static void main (String arg []) {
     	int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
     	int sueldos[][];
     	sueldos = salarios;
     	System.out.printf("%d - %d", salarios[0][0], sueldos[0][0]);
     	System.out.println("La suma total de los salarios es " + sumaSalario(salarios));
    }
	public static int sumaSalario(int vector[][]){
		int suma=0;
		for(int i=0; i<vector.length;i++){
   		 	for(int j=0;j<vector[i].length;j++){
   		 		suma+=vector[i][j];
   		 	}
		}
		return suma;
	}    
    
}