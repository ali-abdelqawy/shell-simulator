
public class StringHandler {
	
	public static String getTheFirstWord(String str) {
		int spaceIndex = getFirstIndexOfSpaceChar(str);
		return generateTheFirstWord(spaceIndex, str);
	}
	
	private static int getFirstIndexOfSpaceChar(String str) {
		int spaceIndex = str.indexOf(' ');
		// If the string doesn't have any spaces
		if(spaceIndex == -1)
			return str.length();
		return spaceIndex;
	}
	
	private static String generateTheFirstWord(int spaceIndex, String str) {
		StringBuffer firstWord = new StringBuffer("");
		for(int i = 0; i < spaceIndex; i++)
		{
			firstWord.append(str.charAt(i));
		}
		return firstWord.toString();
	}
	
	public static String replaceTheFirstWord(String str, String oldWord, String newWord)
	{
		return str.replace(oldWord, newWord);
	}
	
	public static String formatMessage()
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
}
