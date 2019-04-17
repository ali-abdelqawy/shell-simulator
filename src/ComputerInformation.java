import java.net.InetAddress;
import java.net.UnknownHostException;

public class ComputerInformation {
	
	public static String getUsername()
	{
		return System.getProperty("user.name");
	}
	
	public static String getComputerName()
	{
		String hostname = "Unknown";
		try
		{
		    InetAddress addr;
		    addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		    return hostname;
		}
		catch (UnknownHostException ex)
		{
		    System.out.println("Hostname can not be resolved");
		}
		return null;
	}
}
