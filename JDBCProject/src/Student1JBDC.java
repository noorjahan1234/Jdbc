
import java.sql.*;

public class Student1JBDC {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="Noor1234@";
		String query="create table Student(rollNo int, name varchar(10),fee int)";
		try
		{
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Succesfuly");*/
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			
		
//	Statement stmt=con.createStatement();
			Statement stm=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
