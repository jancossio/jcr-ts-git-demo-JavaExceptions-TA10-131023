
public class Password {
	private String contraseña;
	private Integer longitud;

	public Password() {
		contraseña = "";
		longitud = 8;
	}

	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	public Integer getLongitud() {
		return longitud;
	}

	public boolean esFuerte() {

		int mins = 0;
		int mays = 0;
		int nums = 0;

		String tmpStr = "";
		char tmpChr = 'A';
		
		for (int i = 0; i < contraseña.length(); i++) {

			if (Character.isUpperCase(contraseña.charAt(i))) {
				mays++;
			} else if (Character.isLowerCase(contraseña.charAt(i))) {
				mins++;
			} else {
				try { 
					tmpChr = contraseña.charAt(i);
					tmpStr += tmpChr;
					Integer y = Integer.parseInt(tmpStr);
					nums++;
				 } catch (NumberFormatException nfe) {
					 throw new NumberFormatException(); 
					}
			}
			tmpStr = "";
		}
		return ((mays > 2) && (mins > 1) && (nums > 5));
	}

	private String generarPassword(Integer longtd) {

		String alphabet = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
		String retPassw = "";

		for (int i = 0; i < longtd; i++) {
			char c = alphabet.charAt(genNumAleatorio(0, 61));
			retPassw += c;
		}
		return retPassw;
	}

	private static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal - minVal) + 1;
		return (int) (Math.random() * range) + minVal;
	}

	/*
	 * private static boolean check4Number(String password) throws
	 * NumberFormatException {
	 * 
	 * boolean found = false;
	 * 
	 * try { Integer y = Integer.parseInt(password); found = true;
	 * 
	 * } catch (NumberFormatException nfe) { throw new NumberFormatException(); }
	 * 
	 * return found; }
	 */

	@Override
	public String toString() {
		return "Password [contraseña=" + contraseña + ", longitud=" + longitud + "]";
	}
}
