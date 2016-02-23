package controller;

import boundary.IUI;

public class ControllerText {
	
	IUI UI;
	
	public ControllerText(IUI UI) {
		this.UI = UI;
	}

	public void setMainMenu() {

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
		
	}

	public void setMainMenuWrongChoice() {

		UI.showInput("                                         ");
		UI.showInput("*************** Main Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("| You need to pick either 1, 2, 3 or 4  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAdminMenuAskID() {

		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your admin-ID          |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAdminMenuAskPass() {

		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your password          |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAdminMenu() {

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
		
	}

	public void setAdminMenuWrongID() {

		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("|   You have entered a wrong adminID    |");
		UI.showInput("|   or a wrong password.                |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAdminMenuWrongChoice() {

		UI.showInput("                                         ");
		UI.showInput("************** Admin Menu ***************");
		UI.showInput("|                                       |");
		UI.showInput("| You need to pick either 1, 2, 3 or 4  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAddOperatorAskFirstName() {

		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("| Please enter the Operators first name |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAddOperatorAskLastName() {

		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("| Please enter the Operators Last name  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAddOperatorAskCpr() {

		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("|    Please enter the Oprators cpr.     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAddOperatorCprExist() {

		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("| You have entered a cpr that already   |");
		UI.showInput("| exist in the system. Press enter      |");
		UI.showInput("| to return to the Admin Menu           |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setAddOperatorNotValidated() {

		UI.showInput("                                         ");
		UI.showInput("****** Add Operator to the system *******");
		UI.showInput("|                                       |");
		UI.showInput("| You have not entered \"yes\" and the    |");
		UI.showInput("| Operator will not be added. Press     |");
		UI.showInput("| enter to return to the Admin Menu     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorMenu() {

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
		
	}

	public void setChangeOperatorMenuWrongChoice() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("| You need to pick either 1, 2 or 3     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorNameGetId() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorNameWrongId() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  There is no Operator with that ID.   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorNameNotValidated() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("| You have not entered \"yes\" and the    |");
		UI.showInput("| Operator will not be changed. Press   |");
		UI.showInput("| enter to return to the Admin Menu     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorCprGetId() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorCprWrongId() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  There is no Operator with that ID.   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangeOperatorCprNotValidated() {

		UI.showInput("                                         ");
		UI.showInput("********* Change Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("| You have not entered \"yes\" and the    |");
		UI.showInput("| Operator will not be changed. Press   |");
		UI.showInput("| enter to return to the Admin Menu     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setDeleteOperatorAskID() {

		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter the Operators ID.      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setDeleteOperatorWrongID() {
		
		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("|  There is no Operator with that ID.   |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setDeleteOperatorValidated() {

		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("| You have entered \"yes\" and the        |");
		UI.showInput("| Operator is deleted. Press enter      |");
		UI.showInput("| to return to the Admin Menu           |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setDeleteOperatorNotValidated() {

		UI.showInput("                                         ");
		UI.showInput("********* Delete Operator-info **********");
		UI.showInput("|                                       |");
		UI.showInput("| You have not entered \"yes\" and the    |");
		UI.showInput("| Operator will not be deleted. Press   |");
		UI.showInput("| enter to return to the Admin Menu     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassAskID() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your Operator-ID       |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassAskOldPass() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your old password      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassAskNewPass() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   Please enter your new password      |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassAskNewPassAgain() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("| Please enter your new password again  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassValidated() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   You have changed your password.     |");
		UI.showInput("|   Press enter to return to the        |");
		UI.showInput("|   Main Menu                           |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassNotValidated() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("|   You did not enter the same          |");
		UI.showInput("|   password twice.                     |");
		UI.showInput("|   Press enter to try again.           |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setChangePassWrongID() {

		UI.showInput("                                         ");
		UI.showInput("*********** Change password *************");
		UI.showInput("|                                       |");
		UI.showInput("| You have entered a wrong Operator-ID  |");
		UI.showInput("| or a wrong password.                  |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setWeightAskID() {

		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|     Please enter your Operator-ID     |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setWeightAskPass() {

		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|     Please enter your password        |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setWeightAskTare() {

		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|       Please enter TARE-weight        |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setWeightAskGross() {

		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|       Please enter Gross-weight       |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}

	public void setWeightWrongID() {

		UI.showInput("                                         ");
		UI.showInput("************** Weight Menu **************");
		UI.showInput("|                                       |");
		UI.showInput("|   You have entered a wrong ID         |");
		UI.showInput("|   or a wrong password.                |");
		UI.showInput("|                                       |");
		UI.showInput("*****************************************");
		UI.showInput("                                         ");
		
	}
}
