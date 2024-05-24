package com.Student;

import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args)  {
	String url="jdbc:mysql://localhost:3306/myJDBC";
	String username="root";
	String password="Noor1234@";
	String query="insert into student values(?,?,?)";
	
	try {
		//connection establish
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is established");
       PreparedStatement ptmt=con.prepareStatement(query);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of row");
       int row=sc.nextInt();
       for(int i=1; i<row; i++)
       {
       System.out.println("Enter student rollNo");
       int rollNo=sc.nextInt();
       System.out.println("Enter student name");
       String name=sc.next();
       System.out.println("Enter Student Marks");
       int mark=sc.nextInt();
       Student st=new Student(rollNo, name,mark);
       ptmt=con.prepareStatement(query);
       ptmt.setInt(1, st.rollNo);
       ptmt.setString(2, st.name);
       ptmt.setInt(3, st.mark);
       ptmt.executeUpdate();
       }
       System.out.println("insert Student detailsh");
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	

	}

}
