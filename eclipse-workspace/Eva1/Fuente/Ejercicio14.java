/*Division mediante restas. 13:4-->13-4=9 -->1
 *									9-4=5 -->2
 *									5-4=1 -->3
 *									1-4
 */


public class Ejercicio14 {

    public static void main(String arg[]){
    	int dividendo, divisor;
    	dividendo=17;
    	divisor=4;
    	int temporal=dividendo;
    	int resultado=0;
    	while(temporal>=divisor){
    			temporal=temporal-divisor;   			//temporal -=divisor;
    			resultado++;
    		
    	}
    		System.out.println(dividendo + ":" + divisor + "=" + resultado);   //System.out.printf("sd/ %d = sd"; dividendo, divisor, resultado)
    }
    
    
}