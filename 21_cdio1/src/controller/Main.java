package controller;

import boundary.IUI;
import boundary.TUI;
import entity.IOperatorDAO;
import entity.IOperatorDTO;
import entity.OperatorDAO;
import entity.OperatorDTO;
import exceptions.DALException;

public class Main {

	public static void main(String[] args) throws DALException {
		
		IOperatorDTO oDTO = new OperatorDTO();
		IOperatorDAO oDAO = new OperatorDAO(oDTO);
		IUI UI = new TUI();
		Controller controller = new Controller(UI, oDAO, oDTO);
		
		controller.run();
		
	}
}
