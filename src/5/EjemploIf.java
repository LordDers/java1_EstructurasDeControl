/*
 * programa que pide un número por teclado y calcula si es par o impar
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase EjemploIf
public class EjemploIf
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num" como tipo de dato "int"
		int num;

		// Imprime por pantalla el mensaje  
		System.out.println("Introduzca numero: ");

		// Guarda en la variable "num" lo introducido por teclado
		num = sc.nextInt();

		// Si el resto del numero introducido es 0, ejecuta el codigo de dentro
		if ((num%2)==0)
			// Imprime por pantalla el mensaje  
			System.out.println("PAR");

		// Si el resto del numero introducido es distinto a 0, ejecuta el codigo de dentro
		else
			// Imprime por pantalla el mensaje  
			System.out.println("IMPAR");
	}
}
