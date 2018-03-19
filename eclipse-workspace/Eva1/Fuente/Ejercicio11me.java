
public class Ejercicio11me {

	public static void main(String[] args) {
		int x = 9;
		int acum = x;
		for (int i = x - 1; x > 0; i--)
			acum *= i;
		System.out.println(acum);
	}

}
