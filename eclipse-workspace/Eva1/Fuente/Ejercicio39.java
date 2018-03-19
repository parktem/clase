//la sala con mas espectadores en un momento dado, en que dia fue y a que pelicula fueron y la sala con menso espectadores, en que dia fue y en que peli


public class Ejercicio39 {

     public static void main(String arg[]){
   		 int publicoSala[][]={{5,8,4,56,77,34,13},{2,4,10,6,83,90,55},{7,3,8,46,33,45,99},{15,17,32,33,67,72,12}}; 
   		 String dias[]= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
   		 String peliculas[]={"Guerra Mundial Z", "Ave Cesar", "Tres lanceros bengalies", "El niño"};
   		 int min=publicoSala[0][0];
   		 int max=publicoSala[0][0];
   		 int diaMax=0;
   		 int diaMin=0;
   		 int peliMax=0;
   		 int peliMin=0;
   		 for(int i=0; i<publicoSala.length;i++){
   		 	for(int j=0;j<publicoSala[i].length;j++){
   		 		if(publicoSala[i][j]>max){
   		 			max=publicoSala[i][j];
   		 			diaMax=j;
   		 			peliMax=i;
   		 		}
   		 		if(publicoSala[i][j]<min){
   		 			min=publicoSala[i][j];
   		 			diaMin=j;
   		 			peliMin=i;
   		 		}
   		 	}
   		 }
   		 System.out.printf("El momento con mas afluencia fue el %s con la pelicula %s\n",dias[diaMax],peliculas[peliMax]);
    	 System.out.printf("El momento con mas afluencia fue el %s con la pelicula %s\n",dias[diaMin],peliculas[peliMin]);
   		 
   		 
   		 
     }
    
    
}