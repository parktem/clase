public class Ejercicio04bis {
	public static void main(String arg[]){
    	int x, y ,z;
    	x=60;
    	y=60;
    	z=60;
    	
    	if(x>y && x>z || x==y && x>z){
    		System.out.println("El mayor es " + x);
    	}else if(y>x && y>z){
    		System.out.println("El mayor es " + y);
    	}else if(z>x && z>y || z==x && z>y || z==y && z>x){
    		System.out.println("El mayor es " + z);
    	}else{
    		System.out.println("Los 3 numeros son iguales ");
    	}
	}
}