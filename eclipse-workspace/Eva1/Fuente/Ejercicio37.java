//sacar por pantalla cual fue el mejor dia y cuantas entradas se vendieron y cual fue el peor dia dia y cuantas entradas se vendieron


public class Ejercicio37 {

  	public static void main(String arg[]){
  		int publicoSala[][]={{5,8,4,56,77,34,13},{2,4,10,6,83,90,55},{7,3,8,46,33,45,99},{15,17,32,33,67,72,12}};          
  		String semana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};         
    	int publicoTotalSemana[]={0,0,0,0,0,0,0};
    	int diaMax=publicoTotalSemana[0];
    	int diaMin=publicoTotalSemana[0];
    	int indiceMin=0;
    	int indiceMax=0;
    	for(int i=0;i<publicoSala.length;i++){
    		for(int j=0;j<publicoSala[i].length;j++){
    			publicoTotalSemana[j]+=publicoSala[i][j];
    			
    		}
    	}
    	for(int i=0;i<publicoTotalSemana.length;i++){
    		System.out.println(publicoTotalSemana[i]);
    	}
    	for(int i=0;i<publicoTotalSemana.length;i++){
    		if(publicoTotalSemana[i]>=publicoTotalSemana[indiceMax]){
    				indiceMax=i;
    		}
    	}
    	for(int i=0;i<publicoTotalSemana.length;i++){
    		if(publicoTotalSemana[i]<=diaMin){
    				indiceMin=i;
    				diaMin=publicoTotalSemana[i];
    																	//diaMin=publicoTotalSemana[i];
    		}
    	}
    	System.out.printf("El dia de la semana con mas afluencia fue el %s con %s\n",semana[indiceMax],publicoTotalSemana[indiceMax]);
    	System.out.printf("El dia de la semana con menos afluencia fue el %s con %d\n",semana[indiceMin],publicoTotalSemana[indiceMin]);
	}
}