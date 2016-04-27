package exceptions;

import java.sql.SQLException;

public class DALException extends Exception {
	private static final long serialVersionUID = 1L;

	public DALException (SQLException e) {
		System.out.println("Info: An exception has ocurred");
		System.out.println(e);
	}

	public DALException(String string) {
		// TODO Auto-generated constructor stub
	}
}
