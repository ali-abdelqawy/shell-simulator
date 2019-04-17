import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please Enter the DOS Command:");
		String DOS_Command = InputObtainer.keyboardScanner();
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
		DOS_Command = FileHandler.generateDOS_Command(fileScanner, DOS_Command);
		if(printErrorMessage(DOS_Command))
			return;
		executeTheCommand(DOS_Command);
		return;
	}
	private static boolean printErrorMessage(String Command)
	{
		if(Command == null)
		{
			System.err.println("Command not found.");
			return true;
		}
		return false;
	}
	private static void executeTheCommand(String DOS_Command)
	{
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command("bash", "-c", DOS_Command);
	}
}
