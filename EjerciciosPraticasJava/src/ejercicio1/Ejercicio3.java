package ejercicio1;
import java.util.Scanner;

public class Ejercicio3 {
	
	/*EJEFU21.JAVA
	A) PIDE NÚMEROS HASTA QUE SE INTRODUZCA UN NÚMERO PRIMO Y QUE SEA MENOR DE 13. MUESTRA EL
	FACTORIAL DE ESE NÚMERO. CREA FUNCIÓN ESPRIMO Y FACTORIAL()
	B) PIDE UN NÚMERO ENTERO Y MUESTRA EL SIGUIENTE NÚMERO PRIMO MAYOR QUE ÉL. EJ 13-&GT; 17
	C) PIDE UN NÚMERO ENTERO Y MUESTRA EL ANTERIOR NÚMERO PRIMO MENOR DE ÉL. EJ 13-&GT; 11
	*/

	public static boolean esPrimo(int numero) {
		if(numero <= 1) {
			return false;
		}
		
		for (int i = 2; i * i <= numero; i++) {
			if(numero % i == 0) {
				return false;
				
			}
		}
		return true;
	
	}
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <=n; i++) {
			result *=i;
		}
		return result;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA;
		do {
			System.out.println("Ingrese un numero menor a 13 y que sea primo: ");
			numA = sc.nextInt();
			if(!esPrimo(numA) || numA >= 13  ) {
				System.out.println("El numero debe ser primo o menor a 13!");
			}
		}while(!esPrimo(numA) || numA >=13);

		System.out.println("El factorial del numero es: "+ factorial(numA));
		
		//-------------------------------EJERCICIO B -------------------------
		
		System.out.println("=========== EJERCICO B ==========");
		System.out.println("Ingrese un numero entero: ");
		int numeroB = sc.nextInt();	
		int siguienteNum = numeroB  + 1;
		
		while (true) {
			if(esPrimo(siguienteNum)) {
				break; 
			}
			siguienteNum++;
		}
		System.out.println("el siguiente numero primo es: " +siguienteNum);
	
		//===========================0 EJERCICIO C ======================
		System.out.println("=========== EJERCICO B ==========");
		System.out.println("Ingrese un numero entero: ");
		int numeroC = sc.nextInt();	
		int anteriorNum = numeroC  - 1;
		
		while (true) {
			if(esPrimo(anteriorNum)) {
				break; 
			}
			anteriorNum--;
		}
		System.out.println("el anterior numero primo es: " +anteriorNum);
		
	}

}
























