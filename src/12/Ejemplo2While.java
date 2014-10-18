/*
 * programa que lee un número n y muestra n asteriscos
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo2While
public class Ejemplo2While
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declaramos las variable "n" y "contador" como tipo de dato "int", asignando un valor inicial de 0 a "contador"
		int n, contador = 0;

		// Imprime por pantalla el mensaje
		System.out.print("Introduce un número: ");
		// Guarda en la variable "n" lo introducido por teclado
		n = sc.nextInt();

		// Mientras el contador sea menor que el numero introducido, ejecuta el codigo de dentro
		while (contador < n)
		{
			// Imprime por pantalla el mensaje
			System.out.println(" * ");

			// Aumenta el valor de "contador" en uno en cada vuelta
			contador++;
		}
	}
}
