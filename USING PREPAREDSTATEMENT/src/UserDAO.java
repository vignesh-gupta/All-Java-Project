import java.util.*;
import java.sql.*;
public class UserDAO {
          User user;
          DBConnection db = null;
    public void insertDetails(User u) throws ClassNotFoundException, SQLException{
        try {
            Connection con=DBConnection.getConnection();
            String q = "insert into \"user\"(name, contact_detail, username, password) values (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
           //set values
            pstmt.setString(1, u.getName());
            pstmt.setString(2, u.getContactDetail());
            pstmt.setString(3, u.getUsername());
            pstmt.setString(4, u.getPassword());
          //execute
            pstmt.executeUpdate();
          
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<User> getAllUser()throws Exception  {
    ArrayList<User> list =new ArrayList<User>();
      
        try
        {
            Connection con=DBConnection.getConnection();
            String sql="select * from \"user\" order by id";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
              
                User u=new User(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                list.add(u);
            }
            con.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return list;
}
}