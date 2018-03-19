

public class Ejercicio51 {

   	public static void main (String arg []) {
   	String palabras;
   	escribir();
   	hablar("Buenos dias");
   	animalHabla("Me llamo Toby", "Guau, Guau");
   	palabras=concatenar("En un lugar", " de La Mancha");
   	System.out.println(palabras);
   	System.out.printf("La suma es %d", suma(325,210));
   	}
    
    public static void escribir(){
    	System.out.println("Hola");
    }
    
    public static void hablar(String frase){						//estos son metodos, los cuales solo devuelven una cosa:int, double, string, void (no devuelve nada)
    	System.out.println(frase);
    }
    
    public static void animalHabla(String frase, String onomatopeya){
    	System.out.println(frase + ". " + onomatopeya);
    }
    
    public static String concatenar(String frase1, String frase2){
    	return frase1 + frase2;										//es imprescindible el return en las funciones que devuelve algo. lo que tiene que devolver debe ser del mismo tipo dato especificado en el encabezado
    }
    
    public static int suma(int a, int b){
    	return a+b;
    }
}