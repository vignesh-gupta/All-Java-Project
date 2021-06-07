package Pratice;

import java.sql.*;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
//		    System.out.print("Conected with DB");
		    Statement st=con.createStatement();
		    Scanner sc = new Scanner(System.in);
		    
		    	System.out.println("Enter Your ID : ");
			    int id =sc.nextInt();
			    System.out.println("Enter Your Name : ");
			    String name = sc.next();
			    System.out.println("Enter Salary : ");
			    int salary = sc.nextInt();
			    System.out.println("Enter Age : ");
			    int age = sc.nextInt();
			    
		    	String s = "insert into Employees values("+id+" , "+name+" , "+salary+" , "+age+");";
//		    	st.execute(s);
		    	System.out.println(s);
		    	
		    	sc.close();
		    	st.close();
		    	
		}
		catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}
