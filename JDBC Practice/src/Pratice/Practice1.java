package Pratice;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
            System.out.println("Conected with DB");
            Statement st=con.createStatement();
            Scanner sc = new Scanner(System.in);
            
            
            char ans;
            //creating a query
            //String str="create table Employees(Id number, Name varchar2(50),Salary number,Age number)";
            //String str1="DROP table person";
            //st.execute(str);
            
            do{
            	System.out.println("Enter Your ID : ");
                int id =sc.nextInt();
                System.out.println("Enter Your Name : ");
                String name = sc.next();
                System.out.println("Enter Salary : ");
                int salary = sc.nextInt();
                System.out.println("Enter Age : ");
                int age = sc.nextInt();
                
                
            	String s = "insert into Employees values("+id+" ,'"+name+"', "+salary+" , "+age+")";
            	st.execute(s);
            	System.out.println("Press \"Y\" to continue.");
            	ans=sc.next().charAt(0);
            }while(ans=='Y' || ans=='y');
            
            
            int chk = JOptionPane.showConfirmDialog(null, "Data Inserted. Do you want to display the table?");
            
            if(chk==0)
            {
            	String str="select * from Employees";
	            ResultSet rs=st.executeQuery(str);
	            //all rows of person are in rs. Now retrive column data from rs and display
	            System.out.print("ID"+"\t"+"Name"+"\t"+"Salary"+"\t"+"Age");
	                System.out.println(" ");
	                System.out.print("________________________________________________________________________");
	                System.out.println(" ");
	            while(rs.next())
	            {
	               
	                System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
	                System.out.println(" ");
	            }
            }
            
            con.close();
            sc.close();
            st.close();
        }
        
        
//        catch(SQLException e)
//        {
//            System.out.println("Not Connected");
//        }
		catch(Exception e)
        {
            e.printStackTrace();
        }
		
	}

}
