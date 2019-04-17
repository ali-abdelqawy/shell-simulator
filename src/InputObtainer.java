import java.io.File;
import java.util.Scanner;

public class InputObtainer {
	
	public static String scanString(String Message)
	{
		System.out.printf(Message);
		return InputObtainer.keyboardScanner();
	}
	
	public static String keyboardScanner() {
		Scanner keyboardScanner = new Scanner(System.in);
		String keyboardInput = keyboardScanner.nextLine();
		keyboardScanner.close();
		return keyboardInput;
	}
	
	public static Scanner readTheFile(Scanner fileScanner) {
		try {
			fileScanner = new Scanner(new File("DOS-Commands.txt"));
		}
		catch (Exception e) {
			System.err.println("Couldn't find the file.");
		}
		return fileScanner;
	}
}
