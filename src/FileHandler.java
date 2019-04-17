import java.util.Scanner;

public class FileHandler {
	
	public static String generateDOS_Command(Scanner fileScanner, StringBuffer firstWord, String DOS_Command)
	{
		while (fileScanner.hasNext()) {	
			String[] fileLineTokens = extractTokensFromFileLine(fileScanner);
			if (fileLineTokens[0].equalsIgnoreCase(firstWord.toString())) {
				DOS_Command = StringHandler.replaceTheFirstWord(DOS_Command, firstWord.toString(), fileLineTokens[1]);
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
