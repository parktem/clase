
public class E1e1 {

	public static void main(String[] args) {
		int x = 10;
		String binario = "";
		while (x > 0) {
			binario = x % 2 + binario;
			x /= 2;
		}
		System.out.printf("El entero x en binario es %s ", binario);
	}
}