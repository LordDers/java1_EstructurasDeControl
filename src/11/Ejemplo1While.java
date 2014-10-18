/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */

// Importa todas las clases de la libreria java.util
import java.util.*;

// Creamos la clase Ejemplo1While
public class Ejemplo1While
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos las variable "suma" y "num" como tipo de dato "int", asignando un valor inicial de 0 a "suma"
		int suma = 0, num;

		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Imprime por pantalla el mensaje
		System.out.print("Introduzca un número: ");
		// Guarda en la variable "num" lo introducido por teclado
		num = sc.nextInt();

		// Mientras el numero introducido sea igual o mayor a 0, ejecuta el codigo de dentro
		while (num >= 0)
		{
			// Guarda en la variable "suma" la suma de los numeros introducidos
			suma = suma + num;

			// Imprime por pantalla el mensaje
			System.out.print("Introduzca un número: ");

			// Guarda en la variable "num" lo introducido por teclado
			num = sc.nextInt();
		}

		// Cuando el numero introducido sea menor de 0, imprimira el resultado de los numeros positivos
		System.out.println("La suma es: " + suma );
	}
}
