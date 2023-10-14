package ejercicio2;

import testExceptions.CustomException;

public class TestNum {

	private static int testNum;

	public TestNum(int testNum) {
		this.testNum = testNum;
	}

	public void throwTestNumException() throws CustomException {
		if (this.testNum >= 0 && this.testNum <= 10) {
			throw new CustomException("Esto es un objeto Exception");
		}
	}
}
