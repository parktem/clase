

public class Ejercicio36 {
	
	public static void main(String arg[]){
		int kilos[][]={{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
    	String productos[]={"Naranjas", "Peras", "Manzanas"};
    	double precios[]= {3.45,2.77,2.53};	
		double acum=0;
		double total=0;
    	for(int i=0;i<productos.length;i++){
    			acum=0;
    			for(int j=0;j<kilos[i].length;j++){
    				acum +=kilos[i][j]* precios[i];
    			}
    			System.out.printf("Hemos recaudado %.2f € de %s\n", acum, productos[i]);
    			total +=acum;
    	}
    	System.out.printf("Hemos recaudado en total %.2f €\n",total);
    	
    	
    	int vAcum[]={0,0,0};
    	total=0;
    	for(int i=0;i<productos.length;i++)
    		for(int j=0; j<kilos[i].length;j++)
    			vAcum[i] += kilos[i][j] * precios[i];
    	for(int i=0; i<productos.length;i++){
    		total += vAcum[i];
    		System.out.printf("Hemos recaudado %.2f € de %s\n", acum, productos[i]);		
    	}
    	System.out.printf("Hemos recaudado en total %.2f €\n",total);
    }
    
}