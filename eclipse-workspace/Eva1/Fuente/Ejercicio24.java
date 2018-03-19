//tenemos un vector de enteros y tenemos que calcular la media de los valores

public class Ejercicio24 {

   public static void main(String arg[]){
     	int datos[]={-10,20,-30,40,-77};
     	double suma=0;;
     	double media;
    	for(int i=0;i<datos.length;i++){
    		suma+=datos[i];
    	}
    	media=suma/(datos.length);				//mirar la conversion de int a double etc.
    	System.out.println(media);
    	
    	for(int i=0;i<datos.length-1;i++){
    		if(datos[i]>media){
    			System.out.println(datos[i] + " este valor supera la media.");
    		}else{
    			System.out.println(datos[i]);
    		}
    	}
    
	}
}