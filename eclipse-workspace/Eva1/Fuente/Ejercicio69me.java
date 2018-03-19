//tenemos una cadena de carac. hacemos una funcion que devuelva una nueva cadena de caracteres en la que cada palabra añadamos una x al final
public class Ejercicio69me {

     public static void main(String arg[]){
    	 char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','M','a','n','c','h','a',' '};
    	 char cad [] = Cadenaconx(frase);
    	 for (int i = 0; i < cad.length; i++) {
			System.out.printf("%c", cad[i]);
		}
     }
     public static char[] Cadenaconx(char[] cad) {
    	 char cadena[] = new char[100];
    	 int cont=0;
    	 for (int i = 0; i < cad.length; i++) {
			if(cad[i] == ' ') {
				cadena[cont] = 'X';
				cadena[cont+1] = ' ';
				cont=cont+2;
			}else{
				cadena[i] = cad[i];
				cont++;
			}			
		 }
    	 return cadena; 
     }
}     