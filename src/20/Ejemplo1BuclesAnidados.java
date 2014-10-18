/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Ejemplo1BuclesAnidados
public class Ejemplo1BuclesAnidados
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Declaramos las variables "filas" y "columnas" como tipo de dato "int"
		int filas, columnas;

		// Mientras que el numero de filas introducido sea mayor que 0, ejecuta el codigo de dentro
		do
		{
			// Imprime por pantalla el mensaje
			System.out.print("Introduce número de filas: ");
			// Guarda en la variable "filas" lo introducido por teclado
			filas = sc.nextInt();
		}
		while(filas<1);

		// Mientras que el numero de columnas introducido sea mayor que 0, ejecuta el codigo de dentro
		do
		{
			// Imprime por pantalla el mensaje
			System.out.print("Introduce número de columnas: ");
			// Guarda en la variable "filas" lo introducido por teclado
			columnas = sc.nextInt();
		}
		while(columnas<1);

		// Asigna un valor inicial (1) a "i", y mientras sea menor o igual que las filas introducidas, incrementara en 1 en cada vuelta la variable "i"
		for(int i = 1; i<=filas; i++)
		{
			// Asigna un valor inicial (1) a "j", y mientras sea menor o igual que las columnas introducidas, incrementara en 1 en cada vuelta la variable "i"
			for(int j = 1; j<=columnas; j++)
			{
				// Imprime por pantalla el mensaje
				System.out.print(" * ");
			}
			// Imprime por pantalla el mensaje (mensaje vacio y salto de linea)
			System.out.println();
		}
	}
}
