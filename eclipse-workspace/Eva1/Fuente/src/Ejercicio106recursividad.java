package src;

public class Ejercicio106recursividad {

	static String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
	public static void main(String[] args) {
		int numero = 356432;
		int cont = 0;
		/*while(numero > 0) {
			int resto = numero % 10;
			numero/=10;
			System.out.println(resto + medidas[cont]);
			cont++;
		}*/
		Mostrar(numero, 0);

	}
	public static void Mostrar(int numero, int posicion) {
		if(numero == 0) 
			return;
		else {
			System.out.println((numero % 10) + medidas[posicion]);
			Mostrar(numero/10, posicion+1);
		}
	}	
}
