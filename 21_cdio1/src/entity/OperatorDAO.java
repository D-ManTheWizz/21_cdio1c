package entity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import exceptions.DALException;


public class OperatorDAO implements IOperatorDAO {
	
	private List<String> password = new ArrayList<String>();
	private IOperatorDTO operator;
	private List<OperatorDTO> operatorList = new ArrayList<OperatorDTO>();
	
	@Override
	public OperatorDTO getOperator(int oprID) throws DALException {
		
		if(operatorList.isEmpty()) throw new DALException("Theres no Operators in the list");
			
		for (OperatorDTO opr : operatorList) {
				
			if (opr.getOprID() == oprID) {
		
				return opr;
					
			} 			
		}
		return null;
	}

	@Override
	public List<OperatorDTO> getOperatorList() throws DALException {
		
		if(operatorList.isEmpty()) throw new DALException("Theres no Operators in the list");
		
		return operatorList;
		
	}
	
	// setting the Operators - only for use in program without DB
	@Override
	public void setOperator(int oprID, String oprName, String ini, String cpr, String password) {
		
		operator = new OperatorDTO(oprID, oprName, ini, cpr, password);
		
		operatorList.add((OperatorDTO) operator);
		
	}

	@Override
	public void createOperator(String oprName, String ini, String cpr) throws DALException {
		
		int oprAdded = 0;
		
		int oprID = generateID();
		String password = generatePassword();
		
		operator = new OperatorDTO(oprID, oprName, ini, cpr, password);
		
		if(oprID == operatorList.size()+10) {
		
			operatorList.add((OperatorDTO) operator);
			oprAdded++;
			
		} else {
			
			rearrangeOprList(oprID, operator);
			oprAdded++;
			
		}
		if (oprAdded == 0) throw new DALException("The Operator was not added");
	}

	@Override
	public void updateOperator(OperatorDTO opr) throws DALException {
		
		int oprFound = 0;
		
		for (Iterator<OperatorDTO> oprIter = operatorList.listIterator(); oprIter.hasNext(); ) {
		    OperatorDTO operator = oprIter.next();
		    if (operator.getOprID() == opr.getOprID()) {
		        oprIter.remove();
		        createOperator(opr.getOprName(), opr.getIni(), opr.getCpr());
		        oprFound++;
		        
		    }
		    
		}
		if (oprFound == 0) throw new DALException("No update could be made to the Operator");
	}

	@Override
	public void deleteOperator(OperatorDTO opr) throws DALException {
		
		int oprFound = 0;

		for (Iterator<OperatorDTO> oprIter = operatorList.listIterator(); oprIter.hasNext(); ) {
		    OperatorDTO operator = oprIter.next();
		    if (operator == opr) {
		        oprIter.remove();
		        
		    }
		    
		}
		if (oprFound == 0) throw new DALException("The Operator could not be deleted");
	}
	
	// generate an OperatorID
	private int generateID() {
		
		int newID;
		
		// check if all ID's from 10 and up is in use 
		if(operatorList.size()-1+10 == operatorList.get(operatorList.size()-1).getOprID()) {
			
			// assign next ID in the row
			newID = operatorList.size()-1+10+1;
		
		// else find the first ID not in use and return
		} else {
			
			int counter = 10;
			
			// iterate through the list
			for(OperatorDTO opr : operatorList) {
				
				/* 
				 * 1st operatorID (admins) is 10, so the counter goes 1 up (to 11), next should be 11,
				 * if not, the new opr will be assigned 11 as ID, and so forth.
				 */
				if(opr.getOprID() != counter) {
					
					newID = counter;
					return newID;
					
				} else {
					
					counter++;
					
				}
				
			}
			newID = operatorList.size();
		}
		return newID;
	}
	
	// generate a random password
	private String generatePassword() {
			
		// create a list of Srings numbered 1-8       
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		a.add("6");
		a.add("7");
		a.add("8");
		
		
		// shuffle the list
		Collections.shuffle(a); 
		
		for(int i=0; i<=7; i++) {
			
			// iterate through the shuffled list (parsed to integers)
			int choice = Integer.parseInt(a.get(i)); 
			
			// run all 8 cases in random order
			switch(choice) {
			
				// get a random Uppercase letter and add to the StringArray: password
				case 1: getUppercase();
						break;
						
				// get a random	Lowercase letter and add to the StringArray: password
				case 2: getLowercase();
						break;
				
				// get a random integer and add to the StringArray: password
				case 3: getInt();
						break;
						
				// get a random special-sign and add to the StringArray: password
				case 4: getSpecial();
						break;
						
				// get a random letter/int/sign and add to the StringArray: password
				case 5: getRandom();
						break;
						
				// get a random letter/int/sign and add to the StringArray: password
				case 6: getRandom();
						break;
				
				// get a random letter/int/sign and add to the StringArray: password
				case 7: getRandom();
						break;
				
				// get a random letter/int/sign and add to the StringArray: password
				case 8: getRandom();
						break;
									
			}
			
		}
		
		// generate the password from the StringArray: password
		String generatedPassword = 	password.get(0) + password.get(1) + 
									password.get(2) + password.get(3) + 
									password.get(4) + password.get(5) + 
									password.get(6) + password.get(7);

		return generatedPassword;
				      
	}
	
	private void getUppercase() {
		
		String[] upper = {"A","B","C","D","E","F","G","H","I","J","K","L",
				"M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		Collections.shuffle(Arrays.asList(upper));
		
		password.add(upper[0]);
		
	}
	
	private void getLowercase() {
		
		String[] lower = {"a","b","c","d","e","f","g","h","i","j","k","l",
				"m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Collections.shuffle(Arrays.asList(lower));
		
		password.add(lower[0]);
		
	}
	
	private void getInt() {
		
		String[] number = {"0","1","2","3","4","5","6","7","8","9"};
		Collections.shuffle(Arrays.asList(number));
		
		password.add(number[0]);
		
	}
	
	private void getSpecial() {
		
		String[] special = {".", ",", "-", "_", "+", "!", "?", "="};
		Collections.shuffle(Arrays.asList(special));
		
		password.add(special[0]);
		
	}
	
	private void getRandom() {
		
		String[] random = {".", ",", "-", "_", "+", "!", "?", "=","0","1",
				"2","3","4","5","6","7","8","9","a","b","c","d","e","f","g",
				"h","i","j","k","l","m","n","o","p","q","r","s","t","u","v",
				"w","x","y","z","A","B","C","D","E","F","G","H","I","J","K",
				"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		Collections.shuffle(Arrays.asList(random));
		
		password.add(random[0]);
		
	}
	
	private void rearrangeOprList(int oprID, IOperatorDTO operator) {
		
		List<OperatorDTO> tempList = new ArrayList<OperatorDTO>();
		
		for(OperatorDTO opr : operatorList) {
			
		int counter = 10;
			
			/* 
			 * 1st operatorID (admins) is 10, so the counter goes 1 up (to 11), next operator should be 11,
			 * if not, the new opr will be assigned on the 11th place in the tempList - as tested,
			 * the operator will also have the ID number 11, as he gets the lowest available ID.
			 * Last, when the operator is assigned, the rest of the List is assigned to tempList. 
			 */
			if(opr.getOprID() == counter) {
				
				tempList.add((OperatorDTO) opr);
				counter++;
				
			} else if(counter == oprID){
				
				tempList.add((OperatorDTO) operator);
				tempList.add((OperatorDTO) opr);
				counter++;
				
			} else {
				
				tempList.add((OperatorDTO) opr);
				
			}
			
		}
		
		// the tempList overwrites the operatorList (incl. the new operator)
		operatorList = tempList;
		
	}

}
