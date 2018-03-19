
public class Ejercicio105clase {

	public static void main(String[] args) {
		int hora=13;
		int resultado = Campanadas(hora);
		System.out.println(resultado);

	}
	public static int Campanadas(int hora) {
		int acum = 0;
		for (int i = hora; i > 0; i--) {
			if(i>12) {
				acum += i-12;
			}else {				
				acum += i;
			}
		}	
		return acum;
	}
}
