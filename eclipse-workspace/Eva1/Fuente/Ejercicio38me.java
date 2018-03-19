
public class Ejercicio38me {

	public static void main(String[] args) {
		int publicoSala[][] = { { 5, 8, 4, 56, 77, 34, 13 }, { 2, 4, 10, 6, 83, 90, 55 }, { 7, 3, 8, 46, 33, 45, 99 },
				{ 15, 17, 32, 33, 67, 72, 12 } };
		String peliculas[] = { "Guerra Mundial Z", "Ave Cesar", "Tres lanceros bengalies", "El niño" };
		int datos[] = { 0, 0, 0, 0 };
		for (int i = 0; i < publicoSala.length; i++) {
			for (int j = 0; j < publicoSala[i].length; j++) {
				datos[i] += publicoSala[i][j];
			}
		}
		for (int i = 0; i < datos.length; i++) {
			System.out.println(datos[i]);
		}
		int posmax = 0;
		int posicionmax = 0;
		int posmin = 0;
		int posicionmin = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > posmax) {
				posmax = datos[i];
				posicionmax = i;
			} else {
				posmin = datos[i];
				posicionmin = i;
			}
		}
		System.out.printf("La pelicula más vista es %s con %d entradas y la menos vista es %s con %d entradas",
				peliculas[posicionmax], posmax, peliculas[posicionmin], posmin);
	}

}
