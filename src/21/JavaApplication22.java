/*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */

// Creamos la clase JavaApplication22
public class JavaApplication22
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos la variable "XMAX" como tipo de dato "int" con valor de 10, y no se puede cambiar en ningun momento
		final int XMAX = 10;
		// Declaramos la variable "x" y "n" como tipo de dato "int"
		int x, n;

		// Muestra la cabecera de la tabla con espacios (%10s) y salta de linea
		System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");

		// Asigna un valor inicial (1) a "x", y mientras sea menor o igual que 10 (XMAX), incrementara en 1 en cada vuelta la variable "x"
		for (x = 1; x <= XMAX; x++)
		{   //filas
			// Asigna un valor inicial (1) a "n", y mientras sea menor o igual que 4, incrementara en 1 en cada vuelta la variable "n"
			for (n = 1; n <= 4; n++)
			{   //columnas
				// Imprime el mensaje (espacios (%10s) y eleva el numero "x" a "n"
				System.out.printf("%10.0f", Math.pow(x,n));
			}
			// Imprime por pantalla el mensaje (mensaje vacio y salto de linea)
			System.out.println();
		}
	}
}
