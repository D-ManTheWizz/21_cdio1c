package test;

import java.util.ArrayList;
import java.util.List;

import entity.IOperatorDAO;
import entity.IOperatorDTO;
import entity.OperatorDAO;
import entity.OperatorDTO;
import exceptions.DALException;

public class TestAdminLogin {

	public static void main(String[] args) throws DALException {

		IOperatorDTO oDTO = new OperatorDTO();
		IOperatorDAO oDAO = new OperatorDAO(oDTO);
		
		oDAO.setOperator(10, "Admin Jensen", "AdJe", "123456-1234", "1234Pass");
		oDAO.setOperator(11, "Operator Jensen", "OpJe", "234567-2345", "2345Pass");
		oDAO.setOperator(12, "Svend Nielsen", "SvNi", "345678-3456", "3456Pass");
		oDAO.setOperator(13, "Hans Christensen", "HaCh", "456789-4567", "4567Pass");
		
		oDAO.createOperator("Svend Madsen", "SvMa", "987634-2758");
		List<OperatorDTO> operatorList = new ArrayList<OperatorDTO>();
		operatorList = oDAO.getOperatorList();
		System.out.println(operatorList.size());

	}

}
