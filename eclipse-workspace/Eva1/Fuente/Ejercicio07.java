//Declaramos dos numeros enteros y les asignamos valores. Mostrar por pantalla si x es multiplo de y o si no lo es


public class Ejercicio07 {

    public static void main(String arg[]){
    	int x, y;
    	x=8;
    	y=25;
    	if(y>x){
    		int aux=x;
    		x=y;
    		y=aux;
    	}
    	if(x%y==0){
    		System.out.println(x + " es multiplo de " + y);
    	}else{
    		System.out.println(x + " no es multiplo de " + y);
    	}
    	
    }
    
    
}