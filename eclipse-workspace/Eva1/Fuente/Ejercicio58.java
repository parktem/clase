

public class Ejercicio58 {

    public static void main(String arg[]){
    	int numero1 = 5;
    	int numero2 = 2;
    	System.out.println("La combinacion de los numeros " + numero2 + " y " + numero1 + " es " + combinacionNum(numero1,numero2));
    	
    }
    public static int combinacionNum(int num1, int num2){
    	int factorial1=1;
    	int factorial2=1;
    	int factorial3=1;
    	for(int i=num1; i>0; i--){
    		factorial1*=i;
    	}
    	for(int i=num2; i>0; i--){
    		factorial2*=i;
    	}
    	for(int i=num1-num2; i>0; i--){
    		factorial3*=i;
    	}
    	
   		
   		return (factorial1/(factorial2*factorial3));
    }
    
    
}