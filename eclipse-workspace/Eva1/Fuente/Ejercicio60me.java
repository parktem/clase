
public class Ejercicio60me {

	public static void main(String[] args) {
		int salarios[][] = { { 700, 900, 800, 1000, 854 }, { 1000, 500, 1000, 600, 765 }, { 1050, 1456, 856, 423, 741 },
				{ 1070, 735, 366, 657, 587 }, { 1005, 714, 925, 609, 1100 } };
		String empleados[] = { "Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan" };
		for (int i = 0; i < empleados.length; i++) {
			System.out.printf("El empleado %s cobra %d\n", empleados[i], Sumar(salarios[i]));
		}
	}

	public static int Sumar(int[] salarios) {
		int acum = 0;
		for (int i = 0; i < salarios.length; i++) {
			acum += salarios[i];
		}
		return acum;
	}

}
