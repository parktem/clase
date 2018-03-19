
/*Nivel medio: Hacer función que se llame campanadas, la cual recibirá entero con un valor entre 1 y 24
 * las cuales son horas. Y tenemos que devolver un entero con el numero de campanadas que se han tocado hasta esa
 * hora.
 */
public class Ejercicio105 {

	public static void main(String[] args) {
		int hora=3;
		int resultado = Campanadas(hora);
		System.out.println(resultado);

	}
	public static int Campanadas(int hora) {
		int acum=3;
		if(hora < 13) {
		for (int i = hora; i > 0; i--) {
			acum += hora-i;	
			}
		}
		if(hora>=13) {
			for (int i = 1; i <= hora; i++) {
				acum += i;
			}
		}
		return acum;
	}
	
}
