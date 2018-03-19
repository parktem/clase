//Pedimos dos valores enteros, elementos y tomados. Calcular las variaciones de los elementos tomados de tanto en tanto.

public class Ejercicio13 {

    public static void main(String arg[]){
    	int elementos, tomados;
    	elementos=5;
    	tomados=3;
    	int variaciones=1;
    	for(int i=elementos;i>tomados;i--){
    		variaciones*=i;
    	}
    	System.out.println("El numero de variaciones de los " + elementos + " elementos, tomados de " + tomados + " en " + tomados + " es: " + variaciones);
    	
    	//DE OTRA MANERA
    	variaciones=elementos;
    	for(int i=elementos-1;i>tomados;i--)
    		variaciones*=i;
    	}
    	System.out.println("El numero de variaciones de los " + elementos + " elementos, tomados de " + tomados + " en " + tomados + " es: " + variaciones);
    	System.out.printf("Variaciones de %d tomados de %d en %d son %d", elementos, tomados, tomados, variaciones);
    
}