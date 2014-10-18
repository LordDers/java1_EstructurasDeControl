/*
 * Programa que muestra un saludo distinto según la hora introducida
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo2If
public class Ejemplo2If
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args) 
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "hora" como tipo de dato "int"
		int hora;

		// Imprime por pantalla el mensaje
		System.out.println("Introduzca una hora (un valor entero): ");

		// Guarda en la variable "hora" lo introducido por teclado
		hora = sc.nextInt();

		// Si el numero introducido por teclado es igual o mayor que 0 y menor que 12, ejecuta el codigo de dentro
		if (hora >= 0 && hora < 12)
			// Imprime por pantalla el mensaje
			System.out.println("Buenos días");

		// Si el numero introducido por teclado es igual o mayor que 12 y menor que 21, ejecuta el codigo de dentro
		else if (hora >= 12 && hora < 21)
			// Imprime por pantalla el mensaje
			System.out.println("Buenas tardes");

		// Si el numero introducido por teclado es igual o mayor que 21 y menor que 24, ejecuta el codigo de dentro
		else if (hora >= 21 && hora < 24)
			// Imprime por pantalla el mensaje
           		 System.out.println("Buenas noches");

		// Si el numero introducido por teclado es menor que 0 o mayor 24, ejecuta el codigo de dentro
		else
			// Imprime por pantalla el mensaje
			System.out.println("Hora no válida");
	}
}
