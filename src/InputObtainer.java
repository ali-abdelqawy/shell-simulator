import java.io.File;
import java.util.Scanner;

public class InputObtainer {
	
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
			System.out.println("Couldn't find the file");
		}
		return fileScanner;
	}
}
