@SuppressWarnings("serial")
public class EventTypeDoesNotExistsException extends Throwable {
       
    public String getMessage(){
        return "EventTypeDoesNotExistsException: No Event type available with the given id";
    }
}