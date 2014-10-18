/*
 * programa que lee una nota y escribe la calificación correspondiente
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo3If
public class Ejemplo3If
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "nota" como tipo de dato "double"
		double nota;

		// Imprime por pantalla el mensaje
		System.out.println("Introduzca una nota entre 0 y 10: ");

		// Guarda en la variable "nota" lo introducido por teclado
		nota = sc.nextDouble();

		// Imprime por pantalla el mensaje
		System.out.println("La calificación del alumno es ");

		// Si la nota introducia es menor que 0 o mayor que 10, ejecuta el codigo de dentro
		if(nota < 0 || nota > 10)
			// Imprime por pantalla el mensaje
			System.out.println("Nota no válida");

		// Si la nota introducia es igual a 10, ejecuta el codigo de dentro
		else if(nota==10)
			// Imprime por pantalla el mensaje
			System.out.println("Matrícula de Honor");

		// Si la nota introducia es igual o mayor que 9, ejecuta el codigo de dentro
		else if (nota >= 9)
			// Imprime por pantalla el mensaje
			System.out.println("Sobresaliente");

		// Si la nota introducia es igual o mayor que 7, ejecuta el codigo de dentro
		else if (nota >= 7)
			// Imprime por pantalla el mensaje
			System.out.println("Notable");

		// Si la nota introducia es menor que 0 o mayor que 6, ejecuta el codigo de dentro
		else if (nota >= 6)
			// Imprime por pantalla el mensaje
			System.out.println("Bien");

		// Si la nota introducia es menor que 0 o mayor que 5, ejecuta el codigo de dentro
		else if (nota >= 5)
			// Imprime por pantalla el mensaje
			System.out.println("Suficiente");

		// Si no cumple ninguna de las anteriores condiciones, ejecuta el codigo de dentro
		else
			// Imprime por pantalla el mensaje
			System.out.println("Suspenso");
    }
}
