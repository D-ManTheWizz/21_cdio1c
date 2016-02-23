package entity;

import java.util.List;

import exceptions.DALException;

public interface IOperatorDAO {
	OperatorDTO getOperator(int oprID) throws DALException;
	List<OperatorDTO> getOperatorList() throws DALException;
	void setOperator(int oprID, String oprName, String ini, String cpr, String password);
	void createOperator(String oprName, String ini, String cpr) throws DALException;
	void updateOperator(OperatorDTO opr) throws DALException;
	void deleteOperator(OperatorDTO opr) throws DALException;

}
