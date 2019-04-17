
public class StringHandler {
	
	public static StringBuffer getTheFirstWord(String str) {
		
		int spaceIndex = getFirstIndexOfSpaceChar(str);
		return generateTheFirstWord(spaceIndex, str);
	}
	
	private static int getFirstIndexOfSpaceChar(String str) {
		
		return str.indexOf(' ');
	}
	private static StringBuffer generateTheFirstWord(int spaceIndex, String str) {
		
		StringBuffer firstWord = new StringBuffer("");
		for(int i = 0; i < spaceIndex; i++)
		{
			firstWord.append(str.charAt(i));
		}
		return firstWord;
	}
}
