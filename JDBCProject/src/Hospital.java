import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		//url.username and password connection
		String url="jdbc:mysql://localhost:3306/myJDBC";
		String username="root";
		String password="Noor1234@";
		// insert the query in the table
		String query="insert into Pasent values(?,?,?)";
		
		try {
			//connection established
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connection established");
			
			//Preparing the statement for executing the query with the placeholder
			PreparedStatement ptmt=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter row");
			int row=sc.nextInt();
			for(int i=0; i<=row; i++)
			{
			System.out.println("Enter pasent id "+i);
			int p_id=sc.nextInt();
			System.out.println("Enter pasent name "+i);
			String p_name=sc.next();
			System.out.println("Enter pasent age "+i);
			int p_age=sc.nextInt();
			ptmt.setInt(1,p_id);
			ptmt.setString(2, p_name);
			ptmt.setInt(3, p_age);
			ptmt.addBatch();
			ptmt.execute();
			}
			ptmt.executeBatch();
			System.out.println("Row is efected");
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
