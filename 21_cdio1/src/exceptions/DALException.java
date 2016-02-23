package exceptions;


public class DALException extends Exception {
	private static final long serialVersionUID = 1L;

	public DALException (String msg) {
		System.out.println("Info: An exception has ocurred");
		System.out.println(msg);
	}
}
