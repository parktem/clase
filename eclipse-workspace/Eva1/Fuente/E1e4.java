
public class E1e4 {

	public static void main(String[] args) {
		final int ESCANOS = 5;
		String partidos[] = { "PP", "PSOE", "Podemos", "Ciudadanos", "PAR" };
		int votos[] = { 1590, 1800, 1000, 800, 100 };
		int cociente[] = { 1, 1, 1, 1, 1 };
		int partMAX;
		for (int i = 0; i < ESCANOS; i++) {
			partMAX = 0;
			for (int j = 0; j < votos.length; j++)
				if ((votos[i] / cociente[i]) > (votos[partMAX] / cociente[partMAX]))
					partMAX = j;
			cociente[partMAX] += 1;
		}
		for (int i = 0; i < partidos.length; i++)
			System.out.println(partidos[i] + " escaños= " + (cociente[i] - 1));
	}
}