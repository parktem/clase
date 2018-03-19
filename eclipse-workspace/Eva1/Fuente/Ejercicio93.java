//Que salga en orden **Ejercicio de examen**
/*Estrategia
 * 		1)Primero tenemos que saber cuantas palabras hay con los espacios
 * 		2)Declaramos un vector y lo instanciamos con tantos elementos como palabras creemos que hay
 * 		3)Recorremos la cadena y en cada iteración metemos la palabra dentro de un elemento del vector
 * 		4)Aplicamos un metodo de ordenación
 */
public class Ejercicio93 {

	public static void main(String[] args) {
		String cadena = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres ";
		int contadorespacios = cadena.indexOf(" ", 0);
		while(contadorespacios == -1) {
			contadorespacios++;
		}
		System.out.println("Hay " + contadorespacios + " palabras");
		String palabras[] = new String[contadorespacios];
		int inicio=0;
		int n=0;
		int fin = cadena.indexOf(" ", 0);
		while( fin != -1) {
			palabras[n] = cadena.substring(inicio,  fin + 1); //El fin +1 es para añadir espacio en blanco
			n++;
			inicio = fin+1;
			fin = cadena.indexOf(" ", inicio);
		}
		for (int i = 0; i < palabras.length; i++) {
			System.out.printf("%s-", palabras[i]);			
		}
		System.out.println();
		
		for (int x = 0; x < palabras.length; x++) 
			for (int i = palabras.length-1; i > x; i--) {
				if(palabras[i].compareTo(palabras[i-1])<0) {
					String aux;
					aux=palabras[i-1];
					palabras[i-1]=palabras[i];
					palabras[i]=aux;
				}
			}
		cadena = "";
		for (int i = 0; i < palabras.length; i++) 
			cadena=cadena.concat(palabras[i]);
		
		System.out.print(cadena);
		
		
		
		
		/* Se puede hacer así también para contar espacios:
		
		for (int i = 0; i < args.length; i++)
			if(cadena.charAt(i) == ' ')
				numPalabras++;
		System.out.prinln(numPalabras);	
		
		
		metodo burbuja
			inter=nombres[i]
			nombres[i] = nombres[i-1]
			nombres[i-1] = inter
		
		*/
	}

}
