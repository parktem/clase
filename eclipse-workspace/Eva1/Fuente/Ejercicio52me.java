//tenemos un vector cargado con 5 enteros. hacer una funcion que devuelva el maximo valor de esos enteros.

public class Ejercicio52me {

	public static void main(String arg[]) {
		int numeros[] = { 45, 32, 17, 89, 76 };
		int numeromayor = mayor(numeros);
		System.out.println(numeromayor);
	}

	public static int mayor(int[] numeros) {
		int posmax = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > posmax) {
				posmax = numeros[i];
			}
		}
		return posmax;
	}
}