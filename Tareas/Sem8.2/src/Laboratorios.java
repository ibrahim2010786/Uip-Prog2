/*La rúbrica de laboratorios de este curso se calcula en base a cinco laboratorios calificados. 
 * De los cinco laboratorios se elimina la menor nota y se efectúa un promedio de las 
 * notas restantes. Su programa debe captar las calificaciones de los laboratorios 
 * por teclado,imprimir en pantalla la calificación eliminada e imprimir en pantalla 
 * el promedio.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laboratorios {

	public static void main(String[] args) throws IOException {
		BufferedReader keyboard2 = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		float[] notas = new float[5];
		float total = 0;
		System.out.println("Nombre del estudiante: ");
		nombre = keyboard2.readLine();
		System.out.println("Ingrese 5 notas: ");
		for(int f=0;f<notas.length;f++){
		notas[f]= Integer.parseInt(keyboard2.readLine());}
		float menor;
	    menor=notas[0];
	        for(int f=1;f<notas.length;f++) {
	            if (notas[f]<menor) {
	                menor=notas[f];} 	}
	        System.out.println("El nombre del estudiante es: "+nombre);
	        System.out.println("La nota eliminada fue: "+menor);
	        
	        for (int contador = 0; contador < notas.length; contador++) {
	            total += notas[contador]-menor/5;
	            System.out.println("--> "+total);
	        }
	 }
}


