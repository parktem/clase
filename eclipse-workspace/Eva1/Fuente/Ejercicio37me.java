
public class Ejercicio37me {

	public static void main(String[] args) {
		int publicoSala[][] = { { 5, 8, 4, 56, 77, 34, 13 }, { 2, 4, 10, 6, 83, 90, 55 }, { 7, 3, 8, 46, 33, 45, 99 },
				{ 15, 17, 32, 33, 67, 72, 12 } };
		int publicoTotalSemana[] = { 0, 0, 0, 0, 0, 0, 0 };
		String semana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		for (int i = 0; i < publicoSala.length; i++) {
			for (int j = 0; j < publicoSala[i].length; j++) {
				publicoTotalSemana[j] += publicoSala[i][j];
			}
		}
		for (int i = 0; i < publicoTotalSemana.length; i++) {
			System.out.println(publicoTotalSemana[i]);
		}
		int posmax = 0;
		int posicionmax = 0;
		int posmin = 0;
		int posicionmin = 0;
		for (int i = 0; i < publicoTotalSemana.length; i++) {
			if (publicoTotalSemana[i] > posmax) {
				posmax = publicoTotalSemana[i];
				posicionmax = i;
			} else {
				posmin = publicoTotalSemana[i];
				posicionmin = i;
			}
		}
		System.out.printf(
				"El día con mayor afluencia es %s con %d visitantes, y el día con menor afluencia es %s con %d visitantes",
				semana[posicionmax], posmax, semana[posicionmin], posmin);
	}

}
