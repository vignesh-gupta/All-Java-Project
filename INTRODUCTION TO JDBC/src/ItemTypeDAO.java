import java.util.*;
import java.sql.*;

 

public class ItemTypeDAO {
    public List<ItemType> getAllItemTypes() {
        List<ItemType> itemTypeList = new ArrayList<>();
       
        try{
            Connection con=DBConnection.getConnection();
            String query="select * from item_type";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                
                
                 itemTypeList.add(new ItemType(rs.getLong(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4)));
            }
        }//try
        catch(Exception e){e.printStackTrace();}
       
       
        return itemTypeList;
    }
}