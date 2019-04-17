import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please Enter the DOS Command:");
		String DOS_Command = InputObtainer.keyboardScanner();
		StringBuffer firstWord = StringHandler.getTheFirstWord(DOS_Command);
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
		DOS_Command = FileHandler.generateDOS_Command(fileScanner, firstWord, DOS_Command);
		executeTheCommand(DOS_Command);
	}
	private static void executeTheCommand(String DOS_Command)
	{
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("bash", "-c", DOS_Command);
	}
}
