package controller;


import java.util.Iterator;

import boundary.IUI;
import entity.IOperatorDAO;
import entity.IOperatorDTO;
import entity.OperatorDTO;
import exceptions.DALException;


public class Controller {
	private IOperatorDAO oDAO;
	private IOperatorDTO oDTO;
	private IUI UI;
	
	private int fixedAdmin = 10;
	
	public Controller(IUI UI, IOperatorDAO oDAO, IOperatorDTO oDTO) {
		this.UI = UI;
		this.oDTO = oDTO;
		this.oDAO = oDAO;
	}
	
	public void run() throws DALException {
		
		oDAO.setOperator(10, "Admin Jensen", "AdJe", "123456-1234", "1234Pass");
		oDAO.setOperator(11, "Operator Jensen", "OpJe", "234567-2345", "2345Pass");
		oDAO.setOperator(12, "Svend Nielsen", "SvNi", "345678-3456", "3456Pass");
		oDAO.setOperator(13, "Hans Christensen", "HaCh", "456789-4567", "4567Pass");
		
		startMenu();
		
	}
	
	/* Use case 1
	 * startMenu ask TUI to print a menu containing 4 choices the user can choose
	 * then it ask the TUI to get the input from the user, to switch through the 4 different cases
	*/
	private void startMenu() throws DALException {
		
		UI.showInput("                  .8.                    ");
		UI.showInput("                   M.                    ");
		UI.showInput("                  ZD                     ");
		UI.showInput("       MMM?OMMMMMMMNMMMMMMM?ZMMM         ");
		UI.showInput("        .?        .M         M .         ");
		UI.showInput("       .M         .8          M          ");
		UI.showInput("       .M.        .8          M          ");
		UI.showInput("       DMM.       .8        .MMN.        ");
		UI.showInput("        M         .8          I.         ");
		UI.showInput("      . M         .8       .. ? M        ");
		UI.showInput("        M ..      .8          ?  .       ");
		UI.showInput("    .   M         .8       .  ?          ");
		UI.showInput("   ..   M   $     .8      M   ?   .      ");
		UI.showInput("        M   .     .8      .   ?          ");
		UI.showInput("   M    M    +    .8     .    ?    ?     ");
		UI.showInput("        M     .   .8    .     ?     .    ");
		UI.showInput("        M         .8    .     ?     Z    ");
		UI.showInput(" .. ..  M..   .   .8       .  ?   . .    ");
		UI.showInput("OMMMMMMNM8Z$ODNMM .8  MMMMMMMNN8ZZ8DNMM  ");
		UI.showInput("  MMNNDO$8DNMMM   .8   .MMNN8OZ8DNMMM    ");
		UI.showInput("    .MDOZ8DM.     MMM      M8OZ8DZ.      ");
		UI.showInput("             .MNNNDNNNNNM                ");
		UI.showInput("           .MMN8OZ777ZO8NMM              ");
		UI.showInput("            MND8Z$777$O8DNM              ");	
		UI.showInput("                                         ");
		UI.showInput("*************** Main Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   You now have following options:     |");
		UI.showInput("|                                       |");
		UI.showInput("|  1). Administrator menu.              |");
		UI.showInput("|  2). Change your password.            |");
		UI.showInput("|  3). Weigh a product.                 |");
		UI.showInput("|  4). Exit.                            |");
		UI.showInput("|                                       |");
		UI.showInput("|  You can enter \"quit\" at any time     |");
		UI.showInput("|  to close to program.                 |");
		UI.showInput("|                                       |");
		UI.showInput("|   Pick your choice.                   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String choiceString = UI.getInput();
		
		if(choiceString.equals("1") || choiceString.equals("2") || choiceString.equals("3") || choiceString.equals("4")) {
			
			int choice = Integer.parseInt(choiceString);
			
			switch (choice) {
			
				// Use case 2
				case 1: 	adminMenu();
							
				// Use case 6+7
				case 2:		changePassword();
			
				// Use case 6+8
				case 3:		startWeight();
				
				case 4:		UI.endProgram();
		
			}
			
		} else {
			
			UI.showInput("                                         ");
			UI.showInput("*************** Main Menu ***************");
			UI.showInput("|                                       |");
			UI.showInput("| You need to pick either 1, 2, 3 or 4  |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			startMenu();
			
		}
	}
	
	/*
	 * the adminMenu(); method also contain the admin-login, so first it run the method validatePassword();
	 * using the ID and password it asked the user for.
	 * If it passes (and the ID is the prefixed adminId, 10), then it wil ask the TUI to display the adminMenu,
	 * and "listen" for the admins next choice.
	 * Else it will tell the user it is a wrong pass or ID and return to the startMenu.
	*/
	private void adminMenu() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your admin-ID          |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		int oprID = Integer.parseInt(UI.getInput());
		
		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your password          |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String password = UI.getInput();
		
		// validating the password (and prefixed ID)
		if (validatePassword(oprID, password) == true && oprID == fixedAdmin) {
			
			UI.showInput("                                         ");
			UI.showInput("************** Admin Menu ***************");
			UI.showInput("|                                       |");
			UI.showInput("|   You now have following options:     |");
			UI.showInput("|                                       |");
			UI.showInput("|  1). Create new operator.             |");
			UI.showInput("|  2). Change an Operators info.        |");
			UI.showInput("|  3). Delete an Operator.              |");
			UI.showInput("|  4). Exit.                            |");
			UI.showInput("|                                       |");
			UI.showInput("|   Pick your choice.                   |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
		} else {
			
			// Alternative flow Use case 2
			UI.showInput("                                         ");
			UI.showInput("************** Admin Menu ***************");
			UI.showInput("|                                       |");
			UI.showInput("|   You have entered a wrong adminID    |");
			UI.showInput("|   or a wrong password.                |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			startMenu();
			
		}
	
		// listen for input and running the corresponding case
		String choiceString = UI.getInput();
		
		if(choiceString.equals("1") || choiceString.equals("2") || choiceString.equals("3") || choiceString.equals("4")) {
			
			
		
			int choice = Integer.parseInt(choiceString);
			
			switch (choice) {
			
				// Use case 3
				case 1: 	createOperator();
				
				// Use case 4
				case 2:		changeOprInfo();
	
				// Use case 5
				case 3:		deleteOprInfo();
							
				case 4:		startMenu();
			
			}
			
		} else {
			
			UI.showInput("                                         ");
			UI.showInput("************** Admin Menu ***************");
			UI.showInput("|                                       |");
			UI.showInput("| You need to pick either 1, 2, 3 or 4  |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}
	}
	
	/* 
	 * validating password by fetching the corresponding Operator and comparing the given password
	 * to the password within the Operator
	*/
	private boolean validatePassword(int oprID, String password) throws DALException {
		
		OperatorDTO opr = oDAO.getOperator(oprID);
		
		if(opr.getPassword().equals(password)) {
			return true;
		}
		return false;
		
	}
	
	/*
	 * createOperator(); get the first name, last name and cpr from the admin.
	 * From the names, it create an oprName containing both names, and initials 
	 * from the first two chars in first and last name.
	 * Then it test if the cpr is already in use (and tell if it is - returning 
	 * the admin to the adminMenu), and ask the OperatorDAO to make this new Operator.
	 * The ID and password will be created in OperatorDAO.
	 * For safety it asks the admin if he is sure he want to create the new Operator, 
	 * returning the admin to adminMenu(); in any cases.
	 */
	private void createOperator() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("| Please enter the Operators first name |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String oprFirstName = UI.getInput();
		
		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("|  Please enter the Oprators last name  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String oprLastName = UI.getInput();	
		
		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("|    Please enter the Oprators cpr.     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String oprCpr = UI.getInput();
		
		// make oprName from the first and last name
		String oprName = oprFirstName + " " + oprLastName;
		// make 4 char initials, from the first two char in first name and last name
		String ini = oprFirstName.substring(0, 2) + oprLastName.substring(0, 2);
		
		// iterating through the list of Operators to check if an Operator with this cpr already exist.
		for (Iterator<OperatorDTO> oprIter = oDAO.getOperatorList().listIterator(); oprIter.hasNext(); ) {
		    OperatorDTO operator = oprIter.next();
		    
		    
		    if (operator.getCpr().contains(oprCpr)) {
		        
		    	UI.showInput("                                         ");
				UI.showInput("****** Add Operator to the system *******");
				UI.showInput("|                                       |");
				UI.showInput("| You have entered a cpr that already   |");
				UI.showInput("| exist in the system. Press enter      |");
				UI.showInput("| to return to the Admin Menu           |");
				UI.showInput("|                                       |");
				UI.showInput("*****************************************");
				UI.showInput("                                         ");
				
				UI.getInput();
				adminMenu();
		        
		    } 
		}
		
		oDAO.createOperator(oprName, ini, oprCpr);
    	
		/*
		 * iterating through the list of Operators, finding the newly created operator, using the cpr. to
		 * get the password and ID for displaying, and asking the admin to confirm.
		 * (we can't use getOperator(opID); as the ID is autogenerated in OperatorDAO, so we iterate).
		 */
    	for (Iterator<OperatorDTO> oprIterForPassAndID = oDAO.getOperatorList().listIterator(); oprIterForPassAndID.hasNext(); ) {
		    OperatorDTO operatorPassID = oprIterForPassAndID.next();
		    
		    if (operatorPassID.getCpr() == oprCpr) {
		    		
		    	UI.showInput("                                         ");
				UI.showInput("****** Add Operator to the system *******");
				UI.showInput("|                                       |");
				UI.showInput("|   You have added:                     |");
				UI.showInput("|   ID: " + operatorPassID.getOprID() + "                              |");
				UI.showInput("|   Name: " + oprName);
				UI.showInput("|   Cpr: " + oprCpr + "                    |");
				UI.showInput("|   Initials: " + ini + "                      |");
				UI.showInput("|   Password: " + operatorPassID.getPassword() + "                  |");
				UI.showInput("|                                       |");
				UI.showInput("|   to the system.                      |");
				UI.showInput("|                                       |");
				UI.showInput("|   Enter \"yes\" to confirm              |");
				UI.showInput("|   Enter \"no\" to abort                 |");
				UI.showInput("|                                       |");
				UI.showInput("*****************************************");
				UI.showInput("                                         ");
				
				if (UI.getInput().contains("yes")) {
					
					adminMenu();
					
				/*
				 *  if the admin does not confirm, the newly created Operator will be deleted again
				 *  and the admin returned to the adminMenu.
				*/	
				} else {
					
					oDAO.deleteOperator(oDAO.getOperator(operatorPassID.getOprID()));
					
					UI.showInput("                                         ");
					UI.showInput("****** Add Operator to the system *******");
					UI.showInput("|                                       |");
					UI.showInput("| You have not entered \"yes\" and the    |");
					UI.showInput("| Operator will not be added. Press     |");
					UI.showInput("| enter to return to the Admin Menu     |");
					UI.showInput("|                                       |");
					UI.showInput("*****************************************");
					UI.showInput("                                         ");
					
					UI.getInput();
					adminMenu();
					
				} 	    	
		    }					    
    	}		    	
	}
	
	// if the admin choose to change some oprInfo, he will be asked what info to change
	private void changeOprInfo() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   You now have following options:     |");
		UI.showInput("|                                       |");
		UI.showInput("|  1). Change an Operators Name.        |");
		UI.showInput("|  2). Change an Operators cpr.         |");
		UI.showInput("|  3). Exit.                            |");
		UI.showInput("|                                       |");
		UI.showInput("|   Pick your choice.                   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");	

		String choiceString = UI.getInput();
		
		if(choiceString.equals("1") || choiceString.equals("2") || choiceString.equals("3")) {

			int choice = Integer.parseInt(choiceString);
			
			switch (choice) {
			
				case 1: 	changeOprName(); // prompt for valid ID
				
				case 2:		changeOprCpr(); // prompt for valid ID
				
				case 3:		adminMenu();
			
			}
			
		} else {
			
			UI.showInput("                                         ");
			UI.showInput("********* Change Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("| You need to pick either 1, 2 or 3     |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			changeOprInfo();
			
		}
	}
	
	/* 
	 * providing a valid oprID the admin can change the Operators name, and will
	 * also be asked to confirm the new name, and/or returning to the adminMenu.
	*/
	private void changeOprName() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");

		oDTO = oDAO.getOperator(Integer.parseInt(UI.getInput()));
		
		if(oDTO == null) {
			
			UI.showInput("                                         ");
			UI.showInput("********* Change Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("|  There is no Operator with that ID.   |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}
		
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  The Operator you want to change is:  |");
		UI.showInput("|  Name: " + oDTO.getOprName());
		UI.showInput("|  Please enter the Operators full Name |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		// saving the old name in case the admin don't confirm the change
		String oldName = oDTO.getOprName();
		oDTO.setOprName(UI.getInput());
		oDAO.updateOperator((OperatorDTO) oDTO); 
		
		// showing the oprInfo to be changed
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  You have changed Operator: " + oDTO.getOprID() + "        |");
		UI.showInput("|  Name: " + oldName);
		UI.showInput("|  To: " + oDTO.getOprName());
		UI.showInput("|                                       |");
		UI.showInput("|   Enter \"yes\" to confirm              |");
		UI.showInput("|   Enter \"no\" to abort                 |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");

		if (UI.getInput().contains("yes")) {
			
			adminMenu();
			
		// if the admin don't confirm, the the new name will be changed back to the old name
		} else {
			
			oDTO.setOprName(oldName);
			oDAO.updateOperator((OperatorDTO) oDTO); 
			
			UI.showInput("                                         ");
			UI.showInput("********* Change Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("| You have not entered \"yes\" and the    |");
			UI.showInput("| Operator will not be changed. Press   |");
			UI.showInput("| enter to return to the Admin Menu     |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}
	}
	
	/* 
	 * providing a valid oprID the admin can change the Operators cpr, and will
	 * also be asked to confirm the new cpr, and/or returning to the adminMenu.
	*/
	private void changeOprCpr() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");

		oDTO = oDAO.getOperator(Integer.parseInt(UI.getInput()));
		
		if(oDTO == null) {
			
			UI.showInput("                                         ");
			UI.showInput("********* Change Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("|  There is no Operator with that ID.   |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}	
		
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  The Operator you want to change is:  |");
		UI.showInput("|  Name: " + oDTO.getOprName());
		UI.showInput("|  and has cpr: " + oDTO.getCpr() + "             |");
		UI.showInput("|  Please enter the Operators new cpr   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		// saving the old cpr in case the admin don't confirm the cpr
		String oldCpr = oDTO.getCpr();
		oDTO.setCpr(UI.getInput());
		oDAO.updateOperator((OperatorDTO) oDTO); 
		
		// showing the oprInfo to be changed
		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  You have changed Operator: " + oDTO.getOprID() + "        |");
		UI.showInput("|  Cpr: " + oldCpr);
		UI.showInput("|  To: " + oDTO.getCpr() + "                      |");
		UI.showInput("|                                       |");
		UI.showInput("|   Enter \"yes\" to confirm              |");
		UI.showInput("|   Enter \"no\" to abort                 |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");

		if (UI.getInput().contains("yes")) {
			
			adminMenu();
		
		// if the admin don't confirm, the the new cpr will be changed back to the old cpr
		} else {
			
			oDTO.setOprName(oldCpr);
			oDAO.updateOperator((OperatorDTO) oDTO); 
			
			UI.showInput("                                         ");
			UI.showInput("********* Change Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("| You have not entered \"yes\" and the    |");
			UI.showInput("| Operator will not be changed. Press   |");
			UI.showInput("| enter to return to the Admin Menu     |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}	
	}
	
	// deleting an Operator containing the ID the admin provides, confirming the deletion.
	private void deleteOprInfo() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");

		oDTO = oDAO.getOperator(Integer.parseInt(UI.getInput()));
		
		if(oDTO == null) {
			
			UI.showInput("                                         ");
			UI.showInput("********* Delete Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("|  There is no Operator with that ID.   |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}
		
		// showing the Operator to be deleted
		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  The Operator you want to delete is:  |");
		UI.showInput("|  ID: " + oDTO.getOprID() + "                               |");
		UI.showInput("|  Name: " + oDTO.getOprName());
		UI.showInput("|  Cpr: " + oDTO.getCpr() + "                     |");
		UI.showInput("|  Initials: " + oDTO.getIni() + "                       |");
		UI.showInput("|                                       |");
		UI.showInput("|   Enter \"yes\" to confirm              |");
		UI.showInput("|   Enter \"no\" to abort                 |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		// deleting the operator IF, and only if, the admin confirm
		if (UI.getInput().contains("yes")) {
			
			oDAO.deleteOperator((OperatorDTO) oDTO); 
			
			UI.showInput("                                         ");
			UI.showInput("********* Delete Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("| You have entered \"yes\" and the        |");
			UI.showInput("| Operator is deleted. Press enter      |");
			UI.showInput("| to return to the Admin Menu           |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		} else {
			
			UI.showInput("                                         ");
			UI.showInput("********* Delete Operator-info **********");
			UI.showInput("|                                       |");
			UI.showInput("| You have not entered \"yes\" and the    |");
			UI.showInput("| Operator will not be deleted. Press   |");
			UI.showInput("| enter to return to the Admin Menu     |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			adminMenu();
			
		}
	}
	
	/* 
	 * providing a valid oprID the operator can change his own password and will
	 * also be asked to confirm the new password, and/or returning to the mainMenu.
	 * The new password will not be checked if it "lives up to the standard".
	*/
	private void changePassword() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your Operator-ID       |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		int oprID = Integer.parseInt(UI.getInput());
		
		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your old password      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String password = UI.getInput();
		
		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your new password      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String newPassword1 = UI.getInput();
		
		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("| Please enter your new password again  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String newPassword2 = UI.getInput();
		
		// check if the ID and password is correspondent
		if (validatePassword(oprID, password) == true) {
			
			// check if the new password is entered even two times
			if (newPassword1 == newPassword2) {
			
				oDTO = oDAO.getOperator(oprID);
				oDTO.setPassword(newPassword1);
				oDAO.updateOperator((OperatorDTO) oDTO);
				
				UI.showInput("                                         ");
				UI.showInput("*********** Change password *************");
				UI.showInput("|                                       |");
				UI.showInput("|   You have changed your password.     |");
				UI.showInput("|   Press enter to return to the        |");
				UI.showInput("|   Main Menu                           |");
				UI.showInput("|                                       |");
				UI.showInput("*****************************************");
				UI.showInput("                                         ");
				
				UI.getInput();
				startMenu();

			} else {
				
				UI.showInput("                                         ");
				UI.showInput("*********** Change password *************");
				UI.showInput("|                                       |");
				UI.showInput("|   You did not enter the same          |");
				UI.showInput("|   password twice.                     |");
				UI.showInput("|   Press enter to try again.           |");
				UI.showInput("|                                       |");
				UI.showInput("*****************************************");
				UI.showInput("                                         ");
				
				UI.getInput();
				changePassword();
				
			}
			
		} else {
			
			// Alternative flow Use case 6
			UI.showInput("                                         ");
			UI.showInput("*********** Change password *************");
			UI.showInput("|                                       |");
			UI.showInput("| You have entered a wrong Operator-ID  |");
			UI.showInput("| or a wrong password.                  |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			startMenu();
			
		}		
	}
	
	/* 
	 * the weight program first ask for a login, then calculate the net-weight from the 
	 * gross-weight and tare, staying in the program until the Operator enter "quit".
	*/
	private void startWeight() throws DALException {
		
		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|     Please enter your Operator-ID     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		int oprID = Integer.parseInt(UI.getInput());
		
		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|     Please enter your password        |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
		String password = UI.getInput();
		
		if (validatePassword(oprID, password) == true) {
			
			UI.showInput("                                         ");
			UI.showInput("************** Weight Menu **************");
			UI.showInput("|                                       |");
			UI.showInput("|       Please enter TARE-weight        |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			double tareWeight = Integer.parseInt(UI.getInput());
			
			UI.showInput("                                         ");
			UI.showInput("************** Weight Menu **************");
			UI.showInput("|                                       |");
			UI.showInput("|       Please enter Gross-weight       |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			double grossWeight = Integer.parseInt(UI.getInput());
			double netWeight = round(grossWeight-tareWeight);
			
			UI.showInput("                                         ");
			UI.showInput("************** Weight Menu **************");
			UI.showInput("|                                       |");
			UI.showInput("|     Your net-weight is:  " + netWeight + "        |");
			UI.showInput("|                                       |");
			UI.showInput("| Enter \"exit\" to exit to the mani menu |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			
			if(UI.getInput().equals("exit")) startMenu();
			
			startWeight();
			
		} else {
			
			UI.showInput("                                         ");
			UI.showInput("************** Weight Menu **************");
			UI.showInput("|                                       |");
			UI.showInput("|   You have entered a wrong ID         |");
			UI.showInput("|   or a wrong password.                |");
			UI.showInput("|                                       |");
			UI.showInput("*****************************************");
			UI.showInput("                                         ");
			
			UI.getInput();
			startMenu();
		}
	}
	
	// round the weight to two digits
	private double round(double weight) {
		
		double rounded = (double) Math.round(weight * 100) / 100;
		
		return rounded;
		
	}
}
