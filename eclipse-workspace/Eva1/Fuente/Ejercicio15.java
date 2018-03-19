//multiplicacion mediante sumas con bucle while

public class Ejercicio15 {

   public static void main(String arg[]){
		int multiplicando, multiplicador;
		multiplicando=8;
		multiplicador=4;
		int multiplicador1=multiplicador;
		int multiplicacion=0;
		while(multiplicador>0){
			multiplicacion +=multiplicando;
			multiplicador--;
		} 
		System.out.println(multiplicando + "x" + multiplicador1 + "=" + multiplicacion); 	
   	}
    
    
}