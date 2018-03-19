//Recursividad
public class Ejercicio100 {

	public static void main(String[] args) {
		int x = 6;
		int y = 3;
		int resultado = Mult(x, y);
		System.out.println(resultado);
	}
	public static int Mult(int ador, int ando) {
		if(ando == 1)
			return ador;
		else
			return ador + Mult(ador, ando-1);
	}

}
