import java.util.Scanner;

public class FileHandler {
	
	public static String generateLinuxCommand(Scanner fileScanner, String DOS_Command)
	{
		String firstWord = StringHandler.getTheFirstWord(DOS_Command);
		
		while (fileScanner.hasNext()) {
			// line example: mem@free
			String[] fileLineTokens = extractTokensFromFileLine(fileScanner);
			if (fileLineTokens[0].equalsIgnoreCase(firstWord)) {
				DOS_Command = StringHandler.replaceTheFirstWord(DOS_Command, firstWord, fileLineTokens[1]);
				return DOS_Command;
			}
		}
		return null;
	}
	
	private static String[] extractTokensFromFileLine(Scanner fileScanner)
	{
		return fileScanner.nextLine().split("@");
	}

}
