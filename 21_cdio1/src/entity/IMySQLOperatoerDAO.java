package entity;

import java.util.List;

import exceptions.DALException;

public interface IMySQLOperatoerDAO {

	OperatorDTO getOperatoer(int oprId) throws DALException;
	List<OperatorDTO> getOperatoerList() throws DALException;
	void createOperatoer(OperatorDTO opr) throws DALException;
	void updateOperatoer(OperatorDTO opr) throws DALException;
	
	
}
