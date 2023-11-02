package example.exception;

public class NotFoundTheOfferException extends RuntimeException{
    public NotFoundTheOfferException(String message){
        super(message);
    }
}
