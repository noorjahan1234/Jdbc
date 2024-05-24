import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BankBalence {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/myJDBC";
		String username="root";
		String password="Noor1234@";
		Connection con = null;
		String query1="update Bank1 set amount=amount-? where Acc_No=1111";
		String query2="update Bank1 set amount=amount+? where Acc_No=3333";
		//connection establish
		try
		{
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is Established");
			
			//setting the auto commit status false
			con.setAutoCommit(false);
			
			PreparedStatement ptmt1=con.prepareStatement(query1);
			PreparedStatement ptmt2=con.prepareStatement(query2);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amount to be transferd");
			int amount=sc.nextInt();
			ptmt1.setInt(1, amount);
			ptmt2.setInt(1, amount);
			ptmt1.executeUpdate();
			System.out.println("Amount is debited  account number: 1111");
			ptmt2.executeUpdate();
			System.out.println("Amount is creadite account number: 3333");
		
			//commit the change
			con.commit();
		}
		catch(Exception e)
		{
			try
			{
				//if any problem  occurs rollback changes
				con.rollback();
				System.out.println("Change are rollback");
			}
			catch(Exception e1)
			{
			e1.printStackTrace();
			}
		}


	}

}
