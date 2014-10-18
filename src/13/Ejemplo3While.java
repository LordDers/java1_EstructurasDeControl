/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */

// Creamos la clase Ejemplo3While
public class Ejemplo3While
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos la variable "VALOR_INICIAL" como tipo de dato "int" con valor de 10, y no se puede cambiar en ningun momento
		final int VALOR_INICIAL = 10;
		// Declaramos la variable "VALOR_FINAL" como tipo de dato "int" con valor de 100, y no se puede cambiar en ningun momento
		final int VALOR_FINAL = 100;
		// Declaramos la variable "PASO" como tipo de dato "int" con valor de 10, y no se puede cambiar en ningun momento
		final int PASO = 10;
		// Declaramos la variable "fahrenheit" como tipo de dato "int"
		int fahrenheit;
		// Declaramos la variable "celsius" como tipo de dato "double"
		double celsius;

		// Asigna a la variable "fahrenheit" el contenido de la variable "VALOR_INICIAL"
		fahrenheit = VALOR_INICIAL;

		// Imprime por pantalla el mensaje con el formato deseado
		System.out.printf("Fahrenheit \t Celsius \n");

		// Mientras que "fahrenheit" sea menor o igual al "VALOR_INICIAL" (10), ejecuta el codigo de dentro
		while (fahrenheit <= VALOR_FINAL )
		{
			// Guarda en la variable "celsius" esa operacion matematica
			celsius = 5*(fahrenheit - 32)/9.0;

			// Imprime por pantalla el mensaje
			System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);

			// Suma el valor de las dos variables, sumando en cada vuelta 10 a "fahrenheit". Es decir, en la primera vuelta tiene valor de 10, luego de 20 + PASO (10), en la tercera 30 + PASO (10)
			// fahrenheit = fahrenheit + PASO
			fahrenheit += PASO;
			/*10	10
			20	10
			30	10
			40	10
			50	10*/
		}
	}
}
