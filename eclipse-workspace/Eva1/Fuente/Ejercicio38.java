//peli mas vista y cuantas entradas vendio y la menos vista y cuantas entradas vendio
public class Ejercicio38 {

   public static void main(String arg[]){
   		 int publicoSala[][]={{5,8,4,56,77,34,13},{2,4,10,6,83,90,55},{7,3,8,46,33,45,99},{15,17,32,33,67,72,12}}; 
   		 String peliculas[]={"Guerra Mundial Z", "Ave Cesar", "Tres lanceros bengalies", "El niño"};
   		 int publicoTotalPelicula[]={0,0,0,0};
   		 int indiceMax=0;
   		 int indiceMin=0;
   		 for(int i=0;i<publicoSala.length;i++){
    		for(int j=0;j<publicoSala[i].length;j++){
    			publicoTotalPelicula[i]+=publicoSala[i][j];
    		}
   		 }
   		 for(int i=0;i<publicoTotalPelicula.length;i++){
    		System.out.println(publicoTotalPelicula[i]);
   		 }
   		 for(int i=0;i<publicoTotalPelicula.length;i++){
    		if(publicoTotalPelicula[i]>=publicoTotalPelicula[indiceMax]){
    				indiceMax=i;
    		}
    		if(publicoTotalPelicula[i]<=publicoTotalPelicula[indiceMin]){
    				indiceMin=i;
    		}
   		 }
   		 System.out.printf("La pelicula con mas afluencia fue %s con %s\n",peliculas[indiceMax],publicoTotalPelicula[indiceMax]);
    	 System.out.printf("La pelicula con menos afluencia fue %s con %d\n",peliculas[indiceMin],publicoTotalPelicula[indiceMin]);
   }
    
}