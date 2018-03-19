package src;

public class Ejercicio106 {

	public static void main(String[] args) {
		String medidas[] = {"Unidades", "Decenas", "Centenas", "Unidades de millar", "Decenas de millar", "Centenas de millar"};
		int numero = 356432;
		int resto=0;
		int datos[] = {0, 0, 0, 0, 0, 0};
		int divisor=10;
		int dejarlobien=1;
		for (int i = 0; i < medidas.length; i++) {
			resto=numero%divisor;
			resto /= dejarlobien;
			datos[i]=resto;
			divisor=divisor*10;
			dejarlobien *= 10;
		}
		/*for (int i = 0; i < datos.length; i++) {	
			System.out.println(datos[i]);
		}*/
		for (int i = 0; i < datos.length; i++) {
			System.out.printf("El numero %d tiene %d %s \n", numero, datos[i], medidas[i]);
		}
	}

}
