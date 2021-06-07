import java.sql.*;
import java.util.*;

public class UserDAO
{   
    
	 public Boolean deleteUser(String username) throws Exception
	    {
	        Connection con=DBConnection.getConnection();   
	        Statement st=con.createStatement();
	        int i=st.executeUpdate("delete from \"user\" where username='" + username + "'");
	        if(i==0)
	            return false;
	        else
	            return true;
	    }
    
    public List<User> getAllUser() throws Exception
    {
        List<User> userList =new ArrayList<>();
        
        Connection con=DBConnection.getConnection();
        
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select * from \"user\"");
        
        while(rs.next())
        {
            userList.add(new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        
        return userList;
    }
    
}