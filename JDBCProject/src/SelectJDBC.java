import java.sql.Connection;
import java.sql.*;

public class SelectJDBC {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myJDBC";
		String username="root";
		String pd="Noor1234@";
		String query="select * from  Employees";
		try
		{
			//connection established
			Connection con=DriverManager.getConnection(url, username,pd);
			System.out.println("Connection established");
			
			//create statement
			Statement stm=con.createStatement();
			
			//executing the query and getting the results 
			ResultSet rs=stm.executeQuery(query);
			//fatching the data using result set
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
