import java.sql.*;
public class Test {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
            System.out.print("Conected with DB");
            con.close();
        }
        
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}