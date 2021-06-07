import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

 

 

 

public class HallDAO {
    
    
    public void saveHall(Hall hall) {
        
        Connection con=null;
        PreparedStatement pmt=null;
        
        try {
            
            con=DBConnection.getConnection();
            String query="insert into hall(name,contact_detail,cost_per_day,owner_id) values(?,?,?,?)";
            
            pmt=con.prepareStatement(query);
            pmt.setString(1, hall.getName());
            pmt.setString(2, hall.getContactNumber());
            pmt.setDouble(3, hall.getCostPerDay());
            pmt.setLong(4, hall.getOwner().getId());
            
            pmt.executeUpdate();
            
        }
        
        catch(ClassNotFoundException c) {
            
            c.printStackTrace();
        }
        
        catch(SQLException s) {
            
            s.printStackTrace();
        }
        
        finally {
            
            try {
                
                if(pmt!=null)
                    pmt.close();
                if(con!=null)
                    con.close();
            }
            
            catch(SQLException s) {
                
                s.printStackTrace();
            }
        }
        
        
    }
    
    public List<Hall> getAllHall() {
        
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;

 

 

 

        List<Hall> list = new ArrayList<>();
        UserDAO udao=new UserDAO();
        
        try {
            
            con=DBConnection.getConnection();
            stmt=con.createStatement();
            String query = "select hall.id,hall.name,hall.contact_detail,hall.cost_per_day,\"user\".username from  hall,\"user\" where hall.owner_id = \"user\".id ";
            rs=stmt.executeQuery(query);
            
            while(rs.next()) {
                User user=udao.getUser(rs.getString(5));
                Hall h=new Hall(rs.getString(2),rs.getString(3),rs.getDouble(4),user);
                list.add(h);
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
        
        return list;
        
        
    }
}