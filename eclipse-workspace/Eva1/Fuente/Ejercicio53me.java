//Suma de salarios en total
public class Ejercicio53me {

    public static void main (String arg []) {
     	int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}};
     	int acumulacion = Sumasalarios(salarios);
     	System.out.printf("La suma de todos los salarios es %d", acumulacion);
    }
    public static int Sumasalarios(int[][] vec) {
    	int acum = 0;
    	for(int i=0; i<vec.length; i++) {
    		for(int j=0; j<vec[i].length; j++) {
    			acum += vec[i][j];
    		}
    	}
    	return acum;
    }
}    