import java.sql.DriverManager;

public class StudentJdbc {

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="Noor1234@";
		try
		{
			//load the drive
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Succesfuly");
			//establish connection
			DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
