import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please Enter the DOS Command:");
		String DOS_Command = InputObtainer.keyboardScanner();
		StringBuffer sb = StringHandler.getTheFirstWord(DOS_Command);
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
	}

}
