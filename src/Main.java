import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String DOS_Command = null;
		DOS_Command = scanTheString();
		
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
		
		if(fileScanner == null)
			return;
		
		DOS_Command = FileHandler.generateDOS_Command(fileScanner, DOS_Command);
		
		if(printErrorMessage(DOS_Command))
			return;
		
		ProcessBuilderHandler pbh = new ProcessBuilderHandler();
		pbh.executeTheCommand(DOS_Command);
		pbh.startTheProcess();
		System.out.println(pbh.readOutputFromTheCommand());
		return;
	}
	
	private static String scanTheString()
	{
		System.out.println("Please Enter the DOS Command:");
		return InputObtainer.keyboardScanner();
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
}
