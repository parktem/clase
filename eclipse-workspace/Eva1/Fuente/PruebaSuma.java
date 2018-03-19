public class PruebaSuma{
	public static void main(String arg[]) {
		int datos[] = {3,6,7,8,9};
		int resultado = Sumarvector(datos);
		System.out.printf("%d", resultado);
	}
	public static int Sumarvector(int[] vec) {
		int acum=0;
		for (int i = 0; i < vec.length; i++) {
			acum += vec[i];
		}			
        return acum;
	}
}