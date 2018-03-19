
public class Ejercicio98 {

	public static void main(String[] args) {
		String frase1 = "Había   una    vez   un    circo";
		boolean primero = true;
		int i = 0;
		while(i < frase1.length()) {
			if(frase1.charAt(i) == ' ') {
				if(primero) {
					primero = false;
					i++;
				}else {
					 frase1 = frase1.substring(0, i).concat(frase1.substring(i+1, frase1.length()));	 		
				}
			}else{
				primero=true;
				i++;
			}
		}
		
		
		
		System.out.println(frase1);

	}

}
