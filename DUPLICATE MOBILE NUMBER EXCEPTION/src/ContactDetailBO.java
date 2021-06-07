public class ContactDetailBO
{
 static void validate(String mobileNumber,String alternateMobileNumber) throws DuplicateMobileNumberException {
     if(Long.parseLong(mobileNumber)==Long.parseLong(alternateMobileNumber)){
         throw new DuplicateMobileNumberException();
     }
 }
}