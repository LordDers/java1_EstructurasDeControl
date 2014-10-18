/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo0Switch
public class Ejemplo0Switch
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos la variable "mes" como tipo de dato "int"
		int mes;

		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Imprime por pantalla el mensaje
		System.out.print("Introduzca un numero de mes: ");

		// Guarda en la variable "mes" lo introducido por teclado
		mes = sc.nextInt();

		// Coge el numero introducido y va dentro del "switch" a mirar con cual coindice
		switch (mes)
		{
			// Si el numero introducido es "1", imprime por pantalla el mensaje
			case 1: System.out.println("ENERO");
			// Termina el programa
 			break;

			// Si el numero introducido es "2", imprime por pantalla el mensaje
                	case 2: System.out.println("FEBRERO");
			// Termina el programa
			break;

			// Si el numero introducido es "3", imprime por pantalla el mensaje
			case 3: System.out.println("MARZO");
			// Termina el programa
			break;

			// Si el numero introducido es "4", imprime por pantalla el mensaje
			case 4: System.out.println("ABRIL");
			// Termina el programa
			break;

			// Si el numero introducido es "5", imprime por pantalla el mensaje
			case 5: System.out.println("MAYO");
			// Termina el programa
			break;

			// Si el numero introducido es "6", imprime por pantalla el mensaje
			case 6: System.out.println("JUNIO");
			// Termina el programa
			break;

			// Si el numero introducido es "7", imprime por pantalla el mensaje
			case 7: System.out.println("JULIO");
			// Termina el programa
			break;

			// Si el numero introducido es "8", imprime por pantalla el mensaje
			case 8: System.out.println("AGOSTO");
			// Termina el programa
			break;

			// Si el numero introducido es "9", imprime por pantalla el mensaje
			case 9: System.out.println("SEPTIEMBRE");
			// Termina el programa
			break;

			// Si el numero introducido es "10", imprime por pantalla el mensaje
			case 10: System.out.println("OCTUBRE");
			// Termina el programa
			break;

			// Si el numero introducido es "11", imprime por pantalla el mensaje
			case 11: System.out.println("NOVIEMBRE");
			// Termina el programa
			break;

			// Si el numero introducido es "12", imprime por pantalla el mensaje
			case 12: System.out.println("DICIEMBRE");
			// Termina el programa
			break;

			// Si no cumple ninguna de los anteriores casos, imprime por pantalla el mensaje
			default : System.out.println("Mes no válido");                       
		}
	}
}
