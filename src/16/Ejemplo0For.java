/*
 * programa que muestra los números del 1 al 10
 */

// Creamos la clase Ejemplo0For
public class Ejemplo0For
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos las variable "i" como tipo de dato "int"
		int i;

		// Asigna un valor inicial (1) a "i", y mientras sea menor o igual que 10, incrementara en 1 en cada vuelta, y ejecutara el codigo de dentro
		for(i=1; i<=10;i++)
			// Imprime por pantalla el mensaje (el valor de "i")
			System.out.println(i + " ");
	}
}
