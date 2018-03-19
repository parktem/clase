
public class E1e2 {

	public static void main(String[] args) {
		int numero[][] = { { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60 },
				{ 4, 10, 15, 20, 25, 29, 35, 40, 45, 50, 55, 59 }, { 3, 10, 15, 20, 25, 28, 35, 40, 45, 50, 55, 58 },
				{ 2, 10, 15, 20, 25, 27, 35, 40, 45, 50, 55, 56 } };
		String eventos[] = { "nacimientos", "defunciones", "traslados", "asentamientos" };

		int vacum[] = { 0, 0, 0, 0 };
		int posmax = 0, posmin = 0;
		for (int i = 0; i < numero.length; i++)
			for (int j = 0; j < numero[i].length; j++)
				vacum[i] += numero[i][j];

		for (int i = 1; i < vacum.length; i++) {
			if (vacum[i] > vacum[posmax])
				posmax = i;
			if (vacum[i] < vacum[posmin])
				posmin = i;
		}
		System.out.printf("Hubo más %s con %d \n", eventos[posmax], vacum[posmax]);
		System.out.printf("Hubo menos %s con %d \n", eventos[posmin], vacum[posmin]);
	}
}