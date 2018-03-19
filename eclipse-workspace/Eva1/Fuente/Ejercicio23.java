/*tenemos un vector de enteros que vamos a transformar de la siguiente manera. los numeros negativos 
se convertiran en positivos y los positivos se multiplicaran por 2*/

public class Ejercicio23 {

     public static void main(String arg[]){
     	int datos[]={-10,20,-30,40,-77};
     	for(int i=0;i<datos.length;i++){
     		if(datos[i]<0){
     			datos[i]*=(-1);
     		}else{
     			datos[i]*=2;
     		}
     	}
     	for(int i=0;i<datos.length;i++){
     	System.out.println(datos[i]);
     	}
     }
    
    
}