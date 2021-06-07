@SuppressWarnings("serial")
public class UserBO extends Throwable {
        
    static void validate(User u)throws WeakPasswordException{
        
            int d=0,a=0,s=0;
            boolean is=true;
        if(u.getPassword().length()>=8 && u.getPassword().length()<=20){
            for(int i=0; i<u.getPassword().length(); i++){
                if(Character.isDigit(u.getPassword().charAt(i))){
                    d++;
                }
            else if(Character.isAlphabetic(u.getPassword().charAt(i))){
                          a++; 
                       }
            else {
                s++;
            }
                
            }
            if(a<1 || d<1 || s<1){
                is=false;
            }
            
        }
        else is=false;
        
        
            if(is){}
                
                
            else throw new WeakPasswordException("Your password is weak");
    }
        
}