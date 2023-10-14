import testExceptions.CustomException;

public class Ex3_mainApp {
	public static void main(String[] args) {

		Numero randNum = new Numero(0);
		System.out.println("Generando numero aleatorio.");

		randNum.setNumero(genNumAleatorio(0, 999));
		System.out.println("El numero aleatorio generado es: " + randNum.getNumero());

		try {
			randNum.checkUneven();

		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Programa terminado");
	}

	private static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal - minVal) + 1;
		return (int) (Math.random() * range) + minVal;
	}
}
