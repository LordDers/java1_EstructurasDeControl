/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */

// Creamos la clase Ejemplo1For
public class Ejemplo1For
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos la variable "VALOR_INICIAL" como tipo de dato "int" con valor de 10, y no se puede cambiar en ningun momento
		final int VALOR_INICIAL = 10;
		// Declaramos la variable "VALOR_FINAL" como tipo de dato "int" con valor de 100, y no se puede cambiar en ningun momento
		final int VALOR_FINAL = 100; 
		// Declaramos la variable "PASO" como tipo de dato "int" con valor de 10, y no se puede cambiar en ningun momento
		final int PASO = 10 ; // incremento
		// Declaramos la variable "fahrenheit" como tipo de dato "int"
		int fahrenheit;
		// Declaramos la variable "celsius" como tipo de dato "double"
		double celsius;

		// Asigna a la variable "fahrenheit" el contenido de la variable "VALOR_INICIAL" (No hace falta)
		fahrenheit = VALOR_INICIAL;

		// Imprime por pantalla el mensaje con el formato deseado
		System.out.printf("Fahrenheit \t Celsius \n");

		// Asigna a "fahrenheit" el contenido de "VALOR_INICIAL" (10), y mientras igual o menor de "VALOR_FINAL" (100), suma el valor de las dos variables (fahrenheit = fahrenheit + PASO), y ejecuta el codigo de dentro
		for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL; fahrenheit+= PASO)
		{
			// Guarda en la variable "celsius" esa operacion matematica
			celsius = 5*(fahrenheit - 32)/9.0;

			// Imprime por pantalla el mensaje
			System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		}
	}
}
