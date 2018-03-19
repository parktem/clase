//factorial de un numero


public class Ejercicio11 {

   public static void main(String arg[]){
	 	int num=9;
	 	int acum=num;
    	for(int cont=num-1;cont>0;cont--){
     		acum=acum*cont;
     	}
     	System.out.println(num + "! = " + acum );
     	acum=num;
     	for(int cont=1;cont<num;cont++){
     		acum=acum*cont;
     	}
     	System.out.println(num + "! = " + acum );
     					
  	}
    	
 
  	
    
}