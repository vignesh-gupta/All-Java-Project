import java.sql.*;

public class FetchValue {
	public static void main(String[] args)
    {
	    try
	    {
	    //register the driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            //Establish the connection with the database
	            Connection con=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:XE","system","aditya");
	           
	            Statement st=con.createStatement();
	           
	            String str="select * from person where p_salary between 1000 and 20000 order by P_ID";
	           
	            //ResultSet is an object that contains the result(rows) of executing a SQL
	            //statements on a database
	            ResultSet rs=st.executeQuery(str);
	            //all rows of person are in rs. Now retrive column data from rs and display
	            System.out.print("Person ID"+"\t"+"Person Salary"+"\t"+"Person Name"+"\t"+"Person Address");
	                System.out.println(" ");
	                System.out.print("________________________________________________________________________");
	                System.out.println(" ");
	            while(rs.next())
	            {
	               
	                System.out.print(rs.getInt(1)+"\t"+"\t"+"\t"+rs.getInt(3)+"\t"+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(4));
	                System.out.println(" ");
	            }
	           
	            rs.close();
	            st.close();
	            con.close();          
	    }
	    catch(Exception e)
	    {
	      e.printStackTrace();
	    }
    }
}	
