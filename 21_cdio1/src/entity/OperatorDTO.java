package entity;


public class OperatorDTO implements IOperatorDTO {
	
	int oprID;
	String oprName;
	String ini;
	String cpr;
	String password;
	
	
	public OperatorDTO() {

	}
	
	public OperatorDTO(int oprID, String oprName, String ini, String cpr, String password) {

		this.oprID = oprID;
		this.oprName = oprName;
		this.ini = ini;
		this.cpr = cpr;			
		this.password = password;	
		
	}
	@Override
	public int getOprID() {
		
		return oprID;
		
	}	
	@Override
	public void setOprID(int oprID) {
		
		this.oprID = oprID;
		
	}
	@Override
	public String getOprName() {
		
		return oprName;
		
	}
	@Override
	public void setOprName(String oprName) {
		
		this.oprName = oprName;
		
	}
	@Override
	public String getIni() {
		
		return ini;
		
	}
	@Override
	public void setIni(String ini) {
		
		this.ini = ini;
		
	}
	@Override
	public String getCpr() {
		
		return cpr;
		
	}
	@Override
	public void setCpr(String cpr) {
		
		this.cpr = cpr;
		
	}
	@Override
	public String getPassword() {
		
		return password;
		
	}
	@Override
	public void setPassword(String password) {
		
		this.password = password;
		
	}
}

	