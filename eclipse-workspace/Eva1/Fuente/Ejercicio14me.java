
public class Ejercicio14me {

	public static void main(String[] args) {
		int dividendo, divisor;
		dividendo = 17;
		divisor = 4;
		int resultado = 0;
		while (dividendo >= 0) {
			dividendo -= divisor;
			resultado++;
		}
		System.out.println(resultado);

	}

}
