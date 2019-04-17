import java.util.Scanner;

public class InputObtainer {
	
	public static String keyboardScanner() {
		Scanner keyboardScanner = new Scanner(System.in);
		String keyboardInput = keyboardScanner.nextLine();
		keyboardScanner.close();
		return keyboardInput;
	}
}
