import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the contact details");
        String st=br.readLine();
        String[] str=st.split(",");
       
        ContactDetail c=new ContactDetail(str[0],str[1],str[2],str[3],str[4]);
        c.setMobileNumber(str[0]);
        c.setAlternateMobileNumber(str[1]);
        c.setLandline(str[2]);
        c.setEmail(str[3]);
        c.setAddress(str[4]);
        
        try{
            ContactDetailBO.validate(str[0],str[1]);
            System.out.println(c.toString());
            
        }
        catch(DuplicateMobileNumberException e){
            System.out.println(e);
        }

 


    
    }
}