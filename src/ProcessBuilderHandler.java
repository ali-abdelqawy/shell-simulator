import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessBuilderHandler {
	
	ProcessBuilder processBuilder;
	
	public ProcessBuilderHandler()
	{
		processBuilder = new ProcessBuilder();
	}
	
	public void executeTheCommand(String LinuxCommand)
	{
		processBuilder.command("bash", "-c", LinuxCommand);
	}
	
	public Process startTheProcess() throws Exception
	{
		return processBuilder.start();
	}
	
	public String readOutputFromTheCommand() throws Exception {
		Process process = startTheProcess();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		return generateOutput(reader);
	}
	
	private String generateOutput(BufferedReader reader) throws Exception {
		StringBuffer output = new StringBuffer();
		String line;
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}
		return output.toString();
	}
	
	public static String getTheOutput(String LinuxCommand)
	{
		try
		{
			ProcessBuilderHandler pbh = new ProcessBuilderHandler();
			pbh.executeTheCommand(LinuxCommand);
			pbh.startTheProcess();
			return pbh.readOutputFromTheCommand();
		}
		catch(Exception e)
		{
			System.err.println("Some error(s) occurred.");
		}
		return null;
	}
}
