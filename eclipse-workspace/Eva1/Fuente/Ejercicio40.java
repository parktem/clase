// el alumno con mejores notas y su media. el alumno con peores notas y su media. La asignatura con mejor notas y su nota y la peor.

public class Ejercicio40 {

     public static void main(String arg[]){
     	 int notas[][]={{7,9,8,10},{10,5,10,6},{1,3,8,4},{1,7,3,6},{10,7,9,6}}; 
   		 String alumnos[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		 String asignaturas[]={"Programación", "Leng.Marcas", "Sistemas Informaticos", "Bases de Datos"};
    	 double notasTotal[]={0,0,0,0,0};
    	 double medias[]={0,0,0,0,0};
    	 int indMejor=0;
    	 int indPeor=0;
    	 double asignaturaTotal[]={0,0,0,0};
    	 double mediasAsig[]={0,0,0,0};
    	 for(int i=0; i<notas.length;i++){
   		 	for(int j=0;j<notas[i].length;j++){
    			notasTotal[i]+=notas[i][j];
    			asignaturaTotal[j]+=notas[i][j];
   		 	}
   		
   		 }
 
   		 
   		 for(int i=0; i<notasTotal.length;i++){													//hacerlo ahorrandonos este for. hacer la media en el printf
   		 	medias[i]= notasTotal[i]/asignaturas.length;
   		 	
   		 }
   		 for(int i=0; i<asignaturaTotal.length;i++){
   		 	mediasAsig[i]=asignaturaTotal[i]/asignaturas.length;
   		 	
   		 }
   		 
   		 for(int i=0; i<medias.length;i++){
   		 	if(medias[i]>medias[indMejor]){
   		 		indMejor=i;
   		 	}
   		 	if(medias[i]<medias[indPeor]){
   		 		indPeor=i;
   		 	}
   		 
   		 }
   		 
   		 System.out.printf("El alumno con mejores notas es %s con media %.2f\n",alumnos[indMejor],medias[indMejor]);
   		 System.out.printf("El alumno con peores notas es %s con media %.2f\n",alumnos[indPeor],medias[indPeor]);
   		 indMejor=0;
   		 indPeor=0;
   		 for(int i=0; i<mediasAsig.length;i++){
   		 	if(mediasAsig[i]>mediasAsig[indMejor]){
   		 		indMejor=i;
   		 	}
   		 	if(mediasAsig[i]<mediasAsig[indPeor]){
   		 		indPeor=i;
   		 	}
   		 
   		 }
   		 
   		 
   		 System.out.printf("La asignatura con mejores notas es %s con media %s\n",asignaturas[indMejor],mediasAsig[indMejor]);
   		 System.out.printf("La asignatura con peores notas es %s con media %s\n",asignaturas[indPeor],mediasAsig[indPeor]);
   		 
   		 for(int i=0; i<notas.length;i++){
   		 	for(int j=0;j<notas[i].length;j++){
   		 		if(notas[i][j]==10){
   		 			 System.out.printf("El alumno %s ha obtenido un 10 en la asignatura %s\n",alumnos[i],asignaturas[j]);
   		 		}
   		 	}
   		 }
   		 for(int j=0; j<4;j++){
   		 	System.out.println("Asignatura : " + asignaturas[j]);
   		 	for(int i=0;i<notas.length;i++){
   		 		if(notas[i][j]==10){
   		 			 System.out.printf("  %s ",alumnos[i]);
   		 		}
   		 	}
   		 	System.out.println();System.out.println();
		}
     }
}