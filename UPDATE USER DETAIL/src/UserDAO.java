import java.sql.*;
import java.util.*;

 

public class UserDAO
{
    
    public void updateUser(User user) throws Exception
    {
        
        Connection con=DBConnection.getConnection();
        
        Statement st=con.createStatement();
        
        st.executeUpdate("update \"user\" set contact_detail='" + user.getContactDetail() + "' where id=" + user.getId());
        
    }
    
    public User findUserByUsername(String username) throws Exception
    {
        try
        {
            Connection con=DBConnection.getConnection();
            
            Statement st=con.createStatement();

 

            ResultSet rs=st.executeQuery("select * from \"user\" where username='" + username +"'");
            User user=null;
            while(rs.next())
            {
                user = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }
            return user;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    public List<User> getAllUsers() throws Exception
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