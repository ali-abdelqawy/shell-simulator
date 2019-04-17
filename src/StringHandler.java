
public class StringHandler {
	
	public static StringBuffer getTheFirstWord(String str) {
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
	private static StringBuffer generateTheFirstWord(int spaceIndex, String str) {
		StringBuffer firstWord = new StringBuffer("");
		for(int i = 0; i < spaceIndex; i++)
		{
			firstWord.append(str.charAt(i));
		}
		return firstWord;
	}
	public static String replaceTheFirstWord(String str, String oldWord, String newWord)
	{
		return str.replace(oldWord, newWord);
	}
}
