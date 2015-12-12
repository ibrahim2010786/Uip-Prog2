import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Usted debe escribir un programa que lea dos números menores a 1000 a través del teclado. 
 * El programa debe indicar en pantalla cuántos dígitos suman entre ambos números.*/
public class Principal {

	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int digitos1, digitos2, total, numero1, numero2;
        System.out.print("Ingrese 2 numeros menores a 1000: ");
        numero1 = Integer.parseInt(in.readLine());
        numero2 = Integer.parseInt(in.readLine());
        digitos1=1+(int)Math.log10(numero1);
        digitos2=1+(int)Math.log10(numero2);
        total=digitos1+digitos2;
        System.out.println("Total de digitos: " + total);
      }

}
