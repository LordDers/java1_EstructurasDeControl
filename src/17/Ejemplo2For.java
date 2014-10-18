/*
 * programa que muestra los números del 10 al 1
 */

// Creamos la clase Ejemplo2For
public class Ejemplo2For
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos la variable "i" como tipo de dato "int"
		int i;

		// Asigna un valor inicial (10) a "i", y mientras sea mayor a 0, disminuye en 1 en cada vuelta, y ejecutara el codigo de dentro
		for(i=10; i>0;i--)
			// Imprime por pantalla el mensaje (el valor de "i")
			System.out.println(i + " ");
	}
}
