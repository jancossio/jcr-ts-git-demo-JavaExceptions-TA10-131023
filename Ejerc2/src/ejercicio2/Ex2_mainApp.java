package ejercicio2;

import testExceptions.CustomException;

public class Ex2_mainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla.");

			TestNum tNum = new TestNum(5);

			tNum.throwTestNumException();

		} catch (CustomException ex) {
			System.out.println("Excepcion capturada con mensaje: " + ex.getMessage());
		}
		System.out.println("Programa terminado");
	}
}
