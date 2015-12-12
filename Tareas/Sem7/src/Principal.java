/*A un trabajador le pagan segun sus horas y una tarifa de pago por horas. 
 * Si la cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en 
 * un 50% para las horas extras. Usted debe calcular el salario para 5 trabajadores, 
 * obteniendo su nombre y tarifa por teclado. Finalmente debe mostrar un reporte en 
 * pantalla que indique el nombre y el salario neto para cada uno de los trabajadores.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String[] args) throws NumberFormatException, IOException {
	int[] horas = new int[6];
	String[] nombre = new String[6];
	double[] salario = new double[6];
	double aum;

		BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
		aum=0;
		for(int N=1;N<6;N++){
		System.out.println("Ingrese el nombre del trabajador "+N);
		nombre[N] = keyboard2.readLine();
		System.out.println("Ingrese el salario del trabajador: ");
		salario[N]= Integer.parseInt(keyboard2.readLine());
		System.out.println("Ingrese las horas trabajadas: ");
		horas[N]= Integer.parseInt(keyboard2.readLine());
	}
		for(int a=1;a<=5;a++){
		   if(horas[a]>40){
			 aum=salario[a]*0.50;
			 salario[a]=salario[a]+aum;
			 
			 System.out.println("Salarios neto de los trabajadores");
			 for(int T=1;T<=5;T++){
				System.out.println(nombre[T]+ " " + " " + salario[T]);
	
}
	}
		}
	}
}