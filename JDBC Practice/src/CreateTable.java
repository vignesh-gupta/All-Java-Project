import java.sql.*;
import javax.swing.JOptionPane;


public class CreateTable {
    public static void main(String[] args)
    {
        try
        {
        	 //register the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Establish the connection with the database
            Connection con=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:XE","system","123456");
            
            //create a statement
            Statement st=con.createStatement();
            
            //creating a query
            String str="create table Employees(Id number, Name varchar2(50),Salary number,Age number)";
            //String str="create table person(P_Id number, P_Name varchar2(50),P_Salary number,P_Address varchar2(60))";
            //String str1="DROP table Employees";
            //execute the statement
            st.execute(str);
            //st.execute(str1);
            int a =JOptionPane.showConfirmDialog(null,"Done");
            System.out.println(a);
        }
        
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}