import java.sql.*;
import java.util.Scanner;
public class EmpJDBC {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/myJDBC";
		String username="root";
		String password="Noor1234@";
		String query="insert into Employee value(?,?,?)";
		String query1="Update Employee set emp_name='?' where emp_id=?";
		try
		{
			
			 /* Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("Driver load succesfully");
			  
			  Connection con=DriverManager.getConnection(url, username,password);
			  System.out.println("Connection is established");
			  Statement stmt=con.createStatement(); 
			  stmt.execute(query);
			  System.out.print("Query is executed");*/
			 //connection established
			Connection con1=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con1.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter employee id");
			int emp_id=sc.nextInt();
			System.out.println("Enter Employee name");
			String emp_name=sc.next();
			System.out.println("Enter Emloyee Salary");
			int salary=sc.nextInt();
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, salary);
			System.out.println("usdate table");
			String update=("update Employee set ");
			System.out.println("Rows are inserted");
			
			System.out.println("enter Employee");
			String name=sc.next();
			System.out.println("Enter Employee id");
			int ep_id=sc.nextInt();
			PreparedStatement pstmt1=con1.prepareStatement(query1);
			pstmt1.setString(1,emp_name);
			pstmt1.setInt(2,emp_id);
			pstmt1.executeUpdate();
			System.out.println("update succfully " +emp_id+" "+emp_name+" "+salary);
			pstmt.execute();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
