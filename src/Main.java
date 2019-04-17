import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		// Message Format: Username@computername:currentDirectory$ 
		String message = StringHandler.formatMessage();
		// Print the message on the screen and scan the command
		String DOS_Command = InputObtainer.scanString(message);
		
		Scanner fileScanner = null;
		fileScanner = InputObtainer.readTheFile(fileScanner);
		
		if(fileScanner == null)
			return;
		
		// Generate the equivalent linux command
		String LinuxCommand = FileHandler.generateLinuxCommand(fileScanner, DOS_Command);
		
		if(printErrorMessage(LinuxCommand))
			return;
		
		// Get the output from the linux command
		String output = ProcessBuilderHandler.getTheOutput(LinuxCommand);
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
