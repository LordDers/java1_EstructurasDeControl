/* Programa que lea dos números por teclado y los muestre por pantalla.
 */

// Importa todas las clases de la libreria java.util
import java.util.*;
// Creamos la clase Main
public class Main 
{
	// Declaramos esta linea para poder ejecutar el programa, sin ella no se podria ejecutar
	public static void main(String[] args){

        // Declaramos las variables "n1" y "n2" como tipo de dato "int"
        int n1, n2;

	// Guardamos en la variable "sc" la clase "Scanner"
        Scanner sc = new Scanner(System.in);

        // Imprime por pantalla "Introduce un número entero: "
        System.out.println("Introduce un número entero: ");

	// Guarda en la variable "n1" lo introducido por teclado
        n1 = sc.nextInt();

        // Imprime por pantalla "Introduce otro número entero: "
        System.out.println("Introduce otro número entero: ");

	// Guarda en la variable "n2" lo introducido por teclado
        n2 = sc.nextInt();
       

        //Imprime por pantalla "Ha introducido los números: " e indica los numeros
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
}
