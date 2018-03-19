//declaramos dos variables multiplicador y multiplicando. les asignamos a cada una un valor. realizar la multiplicacion mediante un bucle mediante sumas
//7*3-- un bucle que haga 7+7+7


public class Ejercicio12 {

   public static void main(String arg[]){
   	int multiplicador=8;
   	int multiplicando=5;
   	int multiplicacion=0;
   	for(int i=0;i<multiplicando;i++){
   		multiplicacion+=multiplicador;
   	}
   	System.out.println(multiplicador + "*" + multiplicando + " = " + multiplicacion);
   }
    
    
}