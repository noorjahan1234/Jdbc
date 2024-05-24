import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Emp1JDBC {

		public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myJDBC";
		String username="root";
		String password="Noor1234@";
		String query="insert into Employees value(?,?,?)";
		try
		{
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter employee id");
			int emp_id=sc.nextInt();
			System.out.println("Enter employee name");
			String emp_name=sc.next();
			System.out.println("Enter employee salary");
			int em_salary=sc.nextInt();
			pstmt.setInt(1,emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, em_salary);
			pstmt.execute();
			System.out.println("row efected");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
  }
}
