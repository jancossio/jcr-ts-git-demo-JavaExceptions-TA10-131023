import java.util.Scanner;
import testExceptions.CustomException;

public class Ex4_mainApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String goOn = "s";

		Double result = 0.0;

		Calculadora calculadora = new Calculadora();

		do {
			System.out.println("Introduce la operación que desees realizar: (s: sumar/r: restar /");
			System.out.println("m: multiplicacion/p: potencia/d: division/cua: raiz cuadrada/cub: raiz cubica)");
			String operation = sc.nextLine();

			switch (operation) {
			case "s":
				calculadora.getOperators();
				result = calculadora.add();
				System.out.println("El resultado de la suma es: " + result);
				break;
			case "r":
				calculadora.getOperators();
				result = calculadora.substract();
				System.out.println("El resultado de la resta es: " + result);
				break;
			case "m":
				calculadora.getOperators();
				result = calculadora.multiply();
				System.out.println("El resultado de la multiplicacion es: " + result);
				break;
			case "p":
				calculadora.getOperators();
				result = calculadora.powers();
				System.out.println("El resultado de la potencia es: " + result);
				break;
			case "d":
				try {
					calculadora.getOperators();
					result = calculadora.divide();
					System.out.println("El resultado de la division es: " + result);
				} catch (CustomException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case "cua":
				calculadora.getOperators();
				try {
					result = calculadora.powersSqr();
					System.out.println("El resultado de la potencia al cuadrado es: " + result);
				} catch (CustomException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case "cub":
				calculadora.getOperators();
				try {
					result = calculadora.powersCub();
					System.out.println("El resultado de la potencia al cubo es: " + result);
				} catch (CustomException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			default:
				System.out.println("La accion introducida no se reconoce");
			}
			System.out.println("¿deseas realizar otra operacion?: (s/n)");
			goOn = sc.nextLine();
			//
		} while (goOn.equals("s"));
		sc.close();
	}
}
