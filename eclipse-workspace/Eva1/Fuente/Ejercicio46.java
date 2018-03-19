//por cada jugador obtener la media de los goles
public class Ejercicio46 {

    public static void main(String arg[]){
    	int goles[][]={{13,6,9,11,15},{5,8,3,7,9},{2,1,5,4,7},{23,25,31,18,15}};
    	String futbolistas[]= {"Toquero", "Febas", "Zapater", "Borja Iglesias", "Marco Perez"};
    	double acum;
    	for(int j=0;j<futbolistas.length;j++){             //bucle for cambiado. tener en cuenta!!! acumulamos por columnas no por filas como siempre (fijarse en las variables)
    		acum=0;
    		for(int i=0;i<goles.length;i++){
    			acum += goles[i][j];
    		}
    			System.out.println("La media de goles por temporada de " + futbolistas[j] + " es de " + (acum/goles.length));
    		
    	}
    
    }
    
    
    
}