 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo1OperadorCondicional
public class Ejemplo1OperadorCondicional
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

		// Imprime por pantalla si el resto del numero introducido es 0, en caso de ser 0, imprimira "PAR" si no imprimira "IMPAR"
		System.out.println((num%2)==0 ? "PAR" : "IMPAR");
	}
}
