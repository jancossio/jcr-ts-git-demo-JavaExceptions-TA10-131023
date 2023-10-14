import java.util.Scanner;
import java.io.IOException;

public class Ex1_mainApp {

	public static void main(String[] args) {
		System.out.println("Este juego consiste en que adivines un número entre 1 y 500");
		Ejercicio ejercicio1 = new Ejercicio();
		while (!ejercicio1.getEncontrado()) {
			ejercicio1.pedirNumero();
		}
		System.out.println("Enhorabuena!! Has descubierto el numero secreto [" + ejercicio1.getNumeroSecreto()
				+ "] con un total de: " + ejercicio1.getIntentos() + " intentos.");
		ejercicio1.finEjercicio();
	}

}
