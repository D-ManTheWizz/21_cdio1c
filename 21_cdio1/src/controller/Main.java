package controller;


import entity.IOperatorDAO;
import entity.OperatorDAO;
import entity.OperatorDTO;
import exceptions.DALException;

public class Main {

	public static void main(String[] args) throws DALException {
		
		Controller controller = new Controller();
		
		controller.run();
		
	}
}
