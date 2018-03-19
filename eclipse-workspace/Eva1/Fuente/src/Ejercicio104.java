package src;
//division mediante restas.
public class Ejercicio104 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int resultado = Dividir(x, y);
		System.out.println("El resultado es : " + resultado);
	}
	public static int Dividir(int dividendo, int divisor) {
		if(dividendo < divisor) {
			return 0;
		}else {
			return 1 + Dividir(dividendo-divisor, divisor);
		}
	}
}
