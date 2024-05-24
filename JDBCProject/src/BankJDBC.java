import java.sql.*;
import java.util.Scanner;

public class BankJDBC {

	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/myJDBC";
	String username="root";
	String password="Noor1234@";
	String query1="update Bank set amount=amount-? where Acc_No=1111";
	String query2="update Bank set amount=amount+? where Acc_No=3333";
	//connection establish
	try
	{
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection is Established");
		PreparedStatement ptmt1=con.prepareStatement(query1);
		PreparedStatement ptmt2=con.prepareStatement(query2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be transferd");
		int amount=sc.nextInt();
		ptmt1.setInt(1, amount);
		ptmt2.setInt(1, amount);
		System.out.println("Amount is debited  account number: 1111");
		ptmt1.executeUpdate();
		System.out.println("Amount is creadite account number: 3333");
		ptmt2.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
