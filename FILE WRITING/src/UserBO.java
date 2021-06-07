import java.util.*;
import java.io.*;
public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception { 
    	 for (User det: userList) {
             bw.append(det.toString());
             bw.newLine();
         }
  
         bw.close();
    }
}