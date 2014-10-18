/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */

// Creamos la clase Ejemplo3For
public class Ejemplo3For
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args)
	{
		// Declaramos las variables "a" y "b" como tipo de dato "int"
		int a, b;

		// Asigna un valor inicial (1) a "a" y a "b", y mientras la suma de ambas sea menor de 10, incrementara en 1 en cada vuelta la variable "a", y la variable "b" tendra el valor de la suma de las dos variables (b = b + 2), y ejecuta el codigo de dentro
		for(a = 1, b = 1; a + b < 10; a++, b+=2)
		{
			// Imprime por pantalla el mensaje (numero de cada variable y la suma de ambos)
			System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
		}
	}
}
