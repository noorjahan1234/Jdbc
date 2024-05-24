import java.sql.*;
import java.util.Scanner;

public class JDBCProgram {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myjdbc";
		String username="root";
		String password="Noor1234@";
		String auery="create table Employees1(emp_id int,emp_name varcha(10),emp_salary)";
		Statement stmt=null;
		Connection con=null;
		try
		{
			//connection a established
			 con =DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			
			 stmt=con.createStatement();
			System.out.println("Statement is ready");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: insert(stmt);
			break;
			case 2: update(stmt);
			break; 
			case 3: delete(stmt);
			break;
			case 4: fetchDate(stmt);
			break;
			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void insert(Statement stmt) throws SQLException 
	{
			String query="insert into Employees1 values(1,'rohan',67000),(2,'nilu',32000)";
			stmt.execute(query);
			System.out.println("Row are inserted");
	}
		private static void update(Statement stmt) throws SQLException 
	{
		String query="update Employees1 set name='Anju' where emp_Id=1 ";
		stmt.executeUpdate(query);
		System.out.println("Row are updated");	
	}
		private static void delete(Statement stmt) throws SQLException {
			String query="DELETE FROM Employees1 WHERE emp_Id=2 ";
			stmt.execute(query);
			System.out.println("Row are delect");
	}
		private static void fetchDate(Statement stmt) throws SQLException {
			String query="SELECT * FROM EMPLOYEES1";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
			System.out.println("Row are fetchDate");
	}
}
