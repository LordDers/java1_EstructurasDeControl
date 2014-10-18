/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo1DoWhile
public class Ejemplo1DoWhile
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos las variable "valor" como tipo de dato "int"
		int valor;

		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner in = new Scanner( System.in );

		// Mientras que el numero introducido sea mayor o igual que 100, ejecuta el codigo de dentro
		do
		{
			// Imprime por pantalla el mensaje
			System.out.print("Escribe un entero < 100: ");
			// Guarda en la variable "n" lo introducido por teclado
			valor = in.nextInt();
		}

		// Mientras que el numero introducido menor que 100 (puesto que el do hace que tenga un valor de false), ejecuta el codigo de dentro
		while (valor >= 100);
			// Imprime por pantalla el mensaje
			System.out.println("Ha introducido: " + valor);
	}
}
