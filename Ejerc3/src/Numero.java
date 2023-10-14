import testExceptions.CustomException;

public class Numero {

	private static int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public static int getNumero() {
		return numero;
	}

	public static void setNumero(int numero) {
		Numero.numero = numero;
	}

	public void checkUneven() throws CustomException {

		String message = "";

		if (this.numero % 2 == 0) {
			message = "Es par.";
		} else {
			message = "Es impar.";
		}

		if (this.numero >= 0 && this.numero < 1000) {
			throw new CustomException(message);
		}
	}
}
