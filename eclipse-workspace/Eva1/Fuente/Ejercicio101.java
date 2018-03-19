
public class Ejercicio101 {

	public static void main(String[] args) {
		int x=5;
		int resultado = Factorial(x);
		System.out.println(resultado);

	}
	public static int Factorial(int num){
		if(num == 1) {
			return num;
		}else {
			return num * Factorial(num -  1);
		}
	}

}
