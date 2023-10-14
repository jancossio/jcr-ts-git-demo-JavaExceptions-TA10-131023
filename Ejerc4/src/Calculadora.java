import java.util.Scanner;

import testExceptions.CustomException;

public class Calculadora {

	private static Double op1;
	private static Double op2;

	public Calculadora() {
		this.op1 = 0.0;
		this.op2 = 0.0;
	}

	public static double add() {

		return op1 + op2;
	}

	public static double substract() {

		return op1 - op2;
	}

	public static double multiply() {

		return op1 * op2;
	}

	public static double powers() {

		return Math.pow(op1, op2);
	}

	public static double divide() throws CustomException {

		if (op2 == 0) {
			throw new CustomException("Error: El dividendo de la operacion no puede ser 0");
		}

		return op1 / op2;
	}

	public static double powersSqr() throws CustomException {

		if (op1 < 0) {
			throw new CustomException("Error: La base de la operacion no puede ser menor a 0");
		}

		return Math.sqrt(op1);
	}

	public static double powersCub() throws CustomException {

		if (op1 < 0) {
			throw new CustomException("Error: La base de la operacion no puede ser menor a 0");
		}

		return Math.cbrt(op1);
	}

	public void getOperators() {

		Double[] result = new Double[2];

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el primer operando de la operación: ");
		result[0] = Double.parseDouble(scan.nextLine());
		this.op1 = result[0];

		System.out.println("Introduce el segundo operando de la operación: ");
		result[1] = Double.parseDouble(scan.nextLine());
		this.op2 = result[1];

		// scan.close();
	}

	public void getOperator() {

		Double[] result = new Double[2];

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el operando de la operación: ");
		result[0] = Double.parseDouble(scan.nextLine());
		this.op1 = result[0];

		// scan.close();
	}

}
