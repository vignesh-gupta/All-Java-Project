import java.sql.*;

public class InsertTable {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
            System.out.println("Conected with DB");
            Statement st = con.createStatement();
            String str = "insert all "
                        + "into temp values(101,"+"'Priyanshu')"
                        +"into temp values(102,"+"'Ved')"
                        +"into temp values(103,"+"'Liza')"
                        +"select * from dual";
            st.execute(str);
            System.out.println("rows inserted");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

