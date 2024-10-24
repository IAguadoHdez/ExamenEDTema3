package masejercicios;
import java.util.Scanner;
/**
*<p>Programa suma,para calcular la suma de dos valores introducidos</p>
*@version v1.0
*@author Miquel
*@see Para más informacion ver en <a href="https://www.google.com>Google</a>
*/


public class FuncionSuma {

	/**
	*
	*Variable para guardar el primer sumando
	*
	*/
	private static int primerSumando;
	
	/**
	*
	*Variable para guardar el segundo sumando
	*/
	private static int segundoSumando; 

	/**
	*
	*Funcio principal del programa
	*@param args El parametro habitual de la funcion main
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " - suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
			
	/**
	*
	*Funcion que realiza la suma de los dos operadores
	*@param
	* sumando 1 - primer sumando de la operacion suma
	* sumando 2 - segundo sumando de la operacion suma
	*@return Devuelve el resultado de sumar los dos sumandos
	*/
	private static int suma (int sumando1, int sumando2) {
		return sumando1-sumando2;
	}

}
