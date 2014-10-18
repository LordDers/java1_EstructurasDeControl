/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo0If
public class Ejemplo0If
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main( String[] args )
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner( System.in );

		// Imprime por pantalla el mensaje
		System.out.print("Nota: ");

		// Guarda en la variable "nota" que tiene como tipo de dato "int", lo introducido por teclado
		int nota = sc.nextInt();

		// Si la nota introducida por teclado es igual o mayor que 5 ejecuta el codigo de dentro
		if (nota >= 5 )
		{
			// Imprime por pantalla los mensajes
			System.out.println("Enorabuena!!");
			System.out.println("Has aprobado");
		}
    	}
}
