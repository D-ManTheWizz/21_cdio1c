package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exceptions.DALException;


public class MySQLOperatoerDAO implements IMySQLOperatoerDAO {

	public OperatorDTO getOperatoer(int oprId) throws DALException {
		Connector connector = new Connector();

		try {
			ResultSet rs = connector.doQuery("SELECT * FROM operatoer WHERE opr_id = " + oprId);
			if (!rs.first()) throw new DALException("Operatoeren " + oprId + " findes ikke");
			return new OperatorDTO (rs.getInt("opr_id"), rs.getString("opr_navn"), rs.getString("ini"), rs.getString("cpr"), rs.getString("password"));
		}
		catch (SQLException e) {throw new DALException(e); }

	}

	public void createOperatoer(OperatorDTO opr) throws DALException {		
		Connector connector = new Connector();
		try {
			connector.doUpdate(
					"INSERT INTO operatoer(opr_id, opr_navn, ini, cpr, password) VALUES " +
							"(" + opr.getOprID() + ", '" + opr.getOprName() + "', '" + opr.getIni() + "', '" + 
							opr.getCpr() + "', '" + opr.getPassword() + "')"
					);
		} catch (SQLException e) {

			e.printStackTrace();
			throw new DALException(e);
		}
	}

	public void updateOperatoer(OperatorDTO opr) throws DALException {
		Connector connector = new Connector();
		try {
			connector.doUpdate(
					"UPDATE operatoer SET  opr_navn = '" + opr.getOprName() + "', ini =  '" + opr.getIni() + 
					"', cpr = '" + opr.getCpr() + "', password = '" + opr.getPassword() + "' WHERE opr_id = " +
					opr.getOprID()
					);
		} catch (SQLException e) {

			e.printStackTrace();
			throw new DALException(e);
		}
	}

	public void deleteOperatoer(int id) throws DALException {
		Connector connector = new Connector();
		try {
			connector.doUpdate(
					"DELETE FROM operatoer WHERE opr_id="+id+";");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DALException(e);
		}
	}

	public List<OperatorDTO> getOperatoerList() throws DALException {


		List<OperatorDTO> list = new ArrayList<OperatorDTO>();

		Connector connector = new Connector();
		try {
			ResultSet rs = connector.doQuery("SELECT * FROM operatoer");

			while (rs.next()) 
			{
				list.add(new OperatorDTO(rs.getInt("opr_id"), rs.getString("opr_navn"), rs.getString("ini"), rs.getString("cpr"), rs.getString("password")));
			}
		}
		catch (SQLException e) { throw new DALException(e); }
		return list;
	}

	
		
	}






