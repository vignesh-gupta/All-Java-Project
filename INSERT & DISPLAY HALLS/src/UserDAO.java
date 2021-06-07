import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

 

 

public class UserDAO {
    
    public User getUser(String username) {
        

 

 

 

        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        
            
        User u=new User();
        
        try {
            
            con=DBConnection.getConnection();
            stmt=con.createStatement();
            String query="select * from \"user\" where username='" + username + "'";
            rs=stmt.executeQuery(query);
        
            
        if ( rs.next() ) {
            
             u=new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
             
        
        } else {
            
            return null;
            
        }
            
        }
        catch(ClassNotFoundException c) {
            
            c.printStackTrace();
        }
        
        catch(SQLException s) {
            
            s.printStackTrace();
        }
        
        finally {
            
            try {
                
                if(stmt!=null)
                    stmt.close();
                if(rs!=null)
                    rs.close();
                if(con!=null)
                    con.close();
            }
            
            catch(SQLException s) {
                
                s.printStackTrace();
            }
        }
        
        return u;
    }
}