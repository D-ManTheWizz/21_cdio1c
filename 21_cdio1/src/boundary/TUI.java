package boundary;

import java.util.Scanner;

public class TUI implements IUI {

	private Scanner scanner;

	@Override
	public String getInput() {
		scanner = new Scanner(System.in);
		String catched = scanner.nextLine()/*.trim()*/;
		
		return catched;
	}

	@Override
	public void showInput(String msg) {
		System.out.println(msg);
	}
}

