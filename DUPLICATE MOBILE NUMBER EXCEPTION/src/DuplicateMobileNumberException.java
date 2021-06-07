@SuppressWarnings("serial")
public class DuplicateMobileNumberException extends Throwable{
    
    public String getMessage(){
        return "Mobile number and alternate mobile number are same";
    }

 

}