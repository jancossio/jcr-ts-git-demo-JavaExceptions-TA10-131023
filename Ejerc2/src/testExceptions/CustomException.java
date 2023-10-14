package testExceptions;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoException;
	private String message = "";

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super();
		this.message = message;
	}

	/*
	 * public CustomException(int errorCode) { super(); this.codigoException =
	 * errorCode; }
	 */

	@Override
	public String getMessage() {

		switch (codigoException) {
		case (111):
			message = "Esto es un objeto Exception";
			break;
		case (112):
			message = "Excepcion 111: el numero introducido es par";
			break;
		case (113):
			message = "Excepcion 112: el numero introducido es impar";
			break;
		}

		return message;
	}
}
