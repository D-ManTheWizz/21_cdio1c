package entity;


public class OperatorDTO implements IOperatorDTO {
	
	int oprID;
	String oprName;
	String ini;
	String cpr;
	String password;
	
		
	public OperatorDTO(int oprID, String oprName, String ini, String cpr, String password) {


		this.oprID = oprID;
		this.oprName = oprName;
		this.ini = ini;
		this.cpr = cpr;			
		this.password = password;	
		
	}

	public int getOprID() {
		
		return oprID;
		
	}	
	
	public void setOprID(int oprID) {
		
		this.oprID = oprID;
		
	}
	
	public String getOprName() {
		
		return oprName;
		
	}
	
	public void setOprName(String oprName) {
		
		this.oprName = oprName;
		
	}
	
	public String getIni() {
		
		return ini;
		
	}
	
	public void setIni(String ini) {
		
		this.ini = ini;
		
	}
	
	public String getCpr() {
		
		return cpr;
		
	}
	
	public void setCpr(String cpr) {
		
		this.cpr = cpr;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public void setPassword(String password) {
		
		this.password = password;
		
	}
}

	