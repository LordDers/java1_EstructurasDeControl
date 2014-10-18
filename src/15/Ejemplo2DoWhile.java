/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo2DoWhile
public class Ejemplo2DoWhile
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos las variable "n" como tipo de dato "int"
		int n;

		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner( System.in );

		// Mientras que el numero introducido sea menor que 1 o mayor que 10, ejecuta el codigo de dentro
		do
		{
			// Imprime por pantalla el mensaje
			System.out.print("Escribe un número entre 1 y 10: ");
			// Guarda en la variable "n" lo introducido por teclado
			n = sc.nextInt();
		}

		// Mientras que el numero introducido este en el rango de 1 y 10 (puesto que el do hace que tenga un valor de false), ejecuta el codigo de dentro
		while (n<1 || n >10);
			// Imprime por pantalla el mensaje
			System.out.println("Ha introducido: " + n);
	}
}
