//edad media de cada clase

public class Ejercicio45 {
	
	public static void main(String arg[]){
    int edades[][]={{19,22,13,45,33},{53,26,17,18,52},{19,10,19,32,22},{13,14,35,25,17}};
    String clases[]={"1H", "2H", "1E", "2E"};
    int medias[];
    double n;
   	medias=new int[4];
    for(int i=0;i<clases.length;i++){
   			for(int j=0;j<edades[i].length;j++){
   				medias[i]+=edades[i][j];
   			}
    }
    for(int i=0;i<medias.length;i++){
    		System.out.println("La media de la clase " + clases[i] + " es de " + (medias[i]/edades[i].length));
    
    }
   	System.out.println();		
    //sin vector
    
     for(int i=0;i<clases.length;i++){
     	n=0;
   			for(int j=0;j<edades[i].length;j++){
   				n+=edades[i][j];
   			}
   		System.out.println("La media de la clase " + clases[i] + " es de " + (n/edades[i].length));	
    }
    
	}
    
}