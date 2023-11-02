package example.exception;

public class UserConfirmationException extends RuntimeException{
    public UserConfirmationException(String message){
        super(message);
    }
}
