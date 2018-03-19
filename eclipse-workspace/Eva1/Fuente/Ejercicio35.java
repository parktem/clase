public class Ejercicio35 {

    	public static void main(String arg[]){
    		int kilos[][]={{10,20,30,40}, {50,60,70,80}, {90,100,110,120}};
    		String productos[]={"Naranjas", "Peras", "Manzanas"};
    		double precio[]= {3.45,2.77,2.53};	
    		int vAcum[]={0,0,0};
    		int acumTotal=0;;
    		for(int i=0;i<kilos.length;i++){
    			for(int j=0;j<kilos[i].length;j++){
    				vAcum[i]+=kilos[i][j];
    			}
    			
    		}
    		for(int i=0;i<kilos.length;i++){
    			System.out.println("La cantidad de " + productos[i] + " es de " + vAcum[i] + " y su precio es de " + vAcum[i]*precio[i] + " euros");
    			System.out.printf("La cantidad de %s es de %s y su precio es de %.2f \n",productos[i],vAcum[i],vAcum[i]*precio[i]);
    		}
    		
    		
    	}
    
    
    
}