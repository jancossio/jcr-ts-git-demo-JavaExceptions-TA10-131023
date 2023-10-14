import java.util.Scanner;

public class Ex5_mainApp {

	public static void main(String[] args) {

		int nPasswords = 0;
		int passLength = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la cantidad de contraseñas que desees crear: ");
		String numPasses = sc.nextLine();
		nPasswords = Integer.parseInt(numPasses);

		Password[] passwords = new Password[nPasswords];
		Boolean[] strenghts = new Boolean[nPasswords];

		System.out.println("Introduce la longitud que las contraseñas deban tener: ");
		String passesLengt = sc.nextLine();
		passLength = Integer.parseInt(passesLengt);

		for (int i = 0; i < nPasswords; i++) {

			Password tmp = new Password(passLength);
			passwords[i] = tmp;
			strenghts[i] = passwords[i].esFuerte();

			System.out.println("Contraseña " + (i + 1) + ": [" + passwords[i].getContraseña() + "] -> " + strenghts[i]);
		}

		System.out.println("Programa terminado");
	}
}
