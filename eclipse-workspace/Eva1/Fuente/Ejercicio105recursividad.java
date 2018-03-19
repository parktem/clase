

public class Ejercicio105recursividad {

	public static void main(String[] args) {
		int hora=13;
		int resultado = Campanadas(hora);
		System.out.println(resultado);

	}
	public static int Campanadas(int hora) {
		if(hora == 1)
			return hora;
		else if (hora <= 12)
				return hora + Campanadas(hora-1);			
			else
				return (hora - 12) + Campanadas(hora-1);
				
	}
}
