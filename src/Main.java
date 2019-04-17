import java.util.Scanner;

public class Main {
	
	private static String formatMessage()
	{
		StringBuffer message = new StringBuffer("");
		message.append(ComputerInformation.getUsername());
		message.append("@");
		message.append(ComputerInformation.getComputerName());
		message.append(":");
		message.append(ProcessBuilderHandler.getTheOutput("pwd"));
		message.deleteCharAt(message.indexOf("\n"));
		message.append("$ ");
		return message.toString();
	}
	public static void main(String[] args) {
		
		String message = formatMessage();
		// Username@computername:currentDirectory$ 
		String DOS_Command = InputObtainer.scanString(message);
		
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
		
		if(fileScanner == null)
			return;
		
		DOS_Command = FileHandler.generateDOS_Command(fileScanner, DOS_Command);
		
		if(printErrorMessage(DOS_Command))
			return;
		
		String output = ProcessBuilderHandler.getTheOutput(DOS_Command);
		if(output != null)
			System.out.println(output);
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
}
