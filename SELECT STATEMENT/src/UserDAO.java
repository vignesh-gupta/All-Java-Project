import java.sql.*;
import java.util.*;

public class UserDAO {
	public List<User> getAllUsers(){
		List<User> userList = new ArrayList<User>();
		try
		{
            Connection con=DBConnection.getConnection();
            String query="select * from \"user\"";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
            	userList.add(new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
        }
        catch(Exception e){e.printStackTrace();}
		return userList;
	}
}
