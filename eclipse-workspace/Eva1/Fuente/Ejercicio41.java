//el empleado que mas cobra y que media cobra mensual y el empleado que menos cobra y su media. el mes que mas se cobra y su media y el mes que menos se cobra y su media. el mejor sueldo fue a tal empleado en tal mes y lo mismo con el peor


public class Ejercicio41 {

    public static void main(String arg[]){
        int salarios[][]={{700,900,800,1000,854},{1000,500,1000,600,765},{1050,1456,856,423,741},{1070,735,366,657,587},{1005,714,925,609,1100}}; 
   		String empleados[]= {"Javier Allue", "Alberto Blesa", "Jaume Cascals", "Adrían Cachay", "Pedro Galan"};
   		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo"};
   		double acumSalario[]={0,0,0,0,0};
   		double acumSalarioMes[]={0,0,0,0,0};
   		int indMax=0;
   		int indMin=0;
   		int sueldoMax=salarios[0][0];
   		int sueldoMin=salarios[0][0];
   		int indIMax=0;
   		int indIMin=0;
   		int indIMaxb=0;
   		int indIMinb=0;
   		for(int i=0; i<salarios.length;i++){
   		 	for(int j=0;j<salarios[i].length;j++){
   		 		acumSalario[i]+=salarios[i][j];
   		 	}
   		}
   		for(int i=0;i<acumSalario.length;i++){
   			if(acumSalario[i]>acumSalario[indMax]){
   				indMax=i;
   			}
   			if(acumSalario[i]<acumSalario[indMin]){
   				indMin=i;
   			}
   		} 
   		System.out.printf("El empleado que mejor cobra es %s con media %.2f\n",empleados[indMax],acumSalario[indMax]/acumSalario.length);	
   		System.out.printf("El empleado que peor cobra es %s con media %.2f\n",empleados[indMin],acumSalario[indMin]/acumSalario.length);
   		indMax=0;
   		indMin=0;
   		for(int i=0; i<salarios.length;i++){
   		 	for(int j=0;j<salarios[i].length;j++){
   		 		acumSalarioMes[j]+=salarios[i][j];
   		 	}
   		}
   		for(int i=0;i<acumSalarioMes.length;i++){
   			if(acumSalarioMes[i]>acumSalarioMes[indMax]){
   				indMax=i;
   			}
   			if(acumSalarioMes[i]<acumSalarioMes[indMin]){
   				indMin=i;
   			}
   		}
   		System.out.printf("El mes que mas se cobra es %s con media %.2f\n",meses[indMax],acumSalarioMes[indMax]/acumSalarioMes.length);
   		System.out.printf("El mes que menos se cobra es %s con media %.2f\n",meses[indMin],acumSalarioMes[indMin]/acumSalarioMes.length);
   		for(int i=0; i<salarios.length;i++){
   		 	for(int j=0;j<salarios[i].length;j++){
   		 		if(salarios[i][j]>sueldoMax){
   		 			sueldoMax=salarios[i][j];
   		 			indIMax=i;
   		 			indIMin=j;
   		 		}else if(salarios[i][j]<sueldoMin){
   		 			sueldoMin=salarios[i][j];
   		 			indIMaxb=i;
   		 			indIMinb=j;
   		 		}
   		 	}
   		}
   		System.out.printf("El sueldo mas alto es %d en el mes %s recibido por %s\n",sueldoMax,meses[indIMin],empleados[indIMax]);
   		System.out.printf("El sueldo mas bajo es %d en el mes %s recibido por %s\n",sueldoMin,meses[indIMinb],empleados[indIMaxb]);
    }
    
    
}