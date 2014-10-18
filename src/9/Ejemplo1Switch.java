/*
 * Programa que pide dos números y un operador y muestra el resultado
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Importa todas las clases de la libreria java.io
import java.io.*;
// Creamos la clase Ejemplo1Switch
public class Ejemplo1Switch
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar, ademas creamos una excepcion en caso de error
	public static void main(String[] args) throws IOException
	{
		// Declaramos las variables "A", "B" y "Resultado" como tipo de dato "int", y a "Resultado" le damos un valor inicial de 0
		int A,B, Resultado = 0 ;

		// Declaramos la variable "operador" como tipo de dato "char"
		char operador;

		// Declaramos la variable "calculado" como tipo de dato "boolean" con valor inicial de "true"
		boolean calculado = true;

		// Guardamos en la variable "sc" la clase "Scanner"
		Scanner sc = new Scanner(System.in);

		// Imprime por pantalla el mensaje
		System.out.print("Introduzca un numero entero:");
		// Guarda en la variable "A" lo introducido por teclado
		A = sc.nextInt();

		// Imprime por pantalla el mensaje
		System.out.print("Introduzca otro numero entero:");
		// Guarda en la variable "B" lo introducido por teclado
		B = sc.nextInt();

		// Imprime por pantalla el mensaje
		System.out.print("Introduzca un operador (+,-,*,/):");
		// Guarda en la variable "operador" lo introducido por teclado (un unico caracter)
		operador = (char)System.in.read();

		// Coge el numero introducido y va dentro del "switch" a mirar con cual coindice
		switch (operador)
		{
			// Si lo introducido es "-", guarda en "resultado" la resta de los numeros introducidos
			case '-' : Resultado = A - B;
			// Termina el programa
			break;

			// Si lo introducido es "+", guarda en "resultado" la suma de los numeros introducidos
			case '+' : Resultado = A + B;
			// Termina el programa
			break;

			// Si lo introducido es "*", guarda en "resultado" la multiplicacion de los numeros introducidos
			case '*' : Resultado = A * B;
			// Termina el programa
			break;

			// Si lo introducido es "/" y el segundo numero introducido es distinto a 0, guarda en "resultado" la division de los numeros introducidos
			case '/' : if(B!=0)
			Resultado = A / B;

			// Si el segundo numero introducido es 0, ejecuta el siguiente codigo
			else
			{
				// Imprime por pantalla el mensaje
				System.out.println("\nNo se puede dividir por cero");
				// Cambiamos el valor de la variable "calculado" a "false"
				calculado = false;
			}
			// Termina el programa
			break;

			// Si no cumple ninguna de los anteriores casos, imprime por pantalla el mensaje
			default : System.out.println("\nOperador no valido");
			// Cambiamos el valor de la variable "calculado" a "false"
			calculado = false;       
		}

		// Si la variable "calculado" tiene valor "true", ejecuta el codigo de dentro
		if(calculado)
		{
			// Imprime por pantalla el resultado de la operacion seleccionada
			System.out.println("\nEl resultado es: " + Resultado);
		}
	}
}
