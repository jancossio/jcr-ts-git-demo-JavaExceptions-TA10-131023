import java.util.Scanner;

public class Ejercicio {
	private final static int MIN_NUMBER = 1;
	private final static int MAX_NUMBER = 500;

	Scanner sc;
	Integer i;
	Boolean found;
	Integer secretNum;

	public Ejercicio() {
		this.sc = new Scanner(System.in);
		this.i = 0;
		this.found = false;
		this.secretNum = genNumAleatorio(MIN_NUMBER, MAX_NUMBER);
	}

	private int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal - minVal) + 1;
		return (int) (Math.random() * range) + minVal;
	}

	public int getIntentos() {
		return i;
	}

	public boolean pedirNumero() {

		int tempNum;
		System.out.print("Introduce un numero: ");
		String userNum = this.sc.nextLine();

		try {
			tempNum = Integer.parseInt(userNum);

			if (tempNum > MAX_NUMBER || tempNum < MIN_NUMBER) {
				System.out.println("Lo siento, el numero introducido esta fuera del rango del juego.");
			} else {
				if (tempNum > secretNum) {
					System.out.println("El número que buscas es menor a " + tempNum);

				} else if (tempNum < secretNum) {
					System.out.println("El número que buscas es mayor a " + tempNum);

				} else {
					this.found = true;
				}
			}

		} catch (NumberFormatException e) {
			System.out.println("El valor introducido no corresponde con un numero entero.");
		}

		this.i++;
		return this.found;
	}

	public void finEjercicio() {
		this.sc.close();
	}

	public boolean getEncontrado() {
		return this.found;
	}

	public int getNumeroSecreto() {
		// Para evitar que se obtenga el número secreto sin jugar comprobamos found
		if (this.found) {
			return this.secretNum;
		} else {
			return 0;
		}
	}
}
