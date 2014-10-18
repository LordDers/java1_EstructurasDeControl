/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Main
public class Main
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args){

	// Guardamos en la variable "sc" la clase "Scanner"
        Scanner sc = new Scanner(System.in);

	// Declaramos las variables "numero1" y "numero1" como tipo de dato "double"
        double numero1, numero2;

	// Imprime por pantalla el mensaje
        System.out.println("Introduce el primer número:");

	// Guarda en la variable "numero1" lo introducido por teclado
        numero1 = sc.nextDouble();

	// Imprime por pantalla el mensaje
        System.out.println("Introduce el segundo número:");

	// Guarda en la variable "numero2" lo introducido por teclado
        numero2 = sc.nextDouble();

	// Imprime por pantalla los numeros introducidos
        System.out.println("Números introducido: " + numero1 + "  " + numero2);

	// Imprime por pantakka los numeros introducidos y el resultado de su suma
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));

	// Imprime por pantakka los numeros introducidos y el resultado de su resta
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));

	// Imprime por pantakka los numeros introducidos y el resultado de su multiplicacion
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
