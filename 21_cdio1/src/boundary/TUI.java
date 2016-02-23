package boundary;

import java.util.Scanner;

public class TUI implements IUI {

	private Scanner scanner;

	// get the input from user when user press enter
	@Override
	public String getInput() {
		scanner = new Scanner(System.in);
		String catched = scanner.nextLine();
		
		if(catched.equals("quit")) {
			endProgram();
		}
		
		return catched;
	}

	// print the info given by the controller
	@Override
	public void showInput(String msg) {
		System.out.println(msg);
	}
	
	public void endProgram() {
		scanner.close();
		System.exit(0);
	}
}

