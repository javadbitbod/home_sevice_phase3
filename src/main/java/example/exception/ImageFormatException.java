package example.exception;

public class ImageFormatException extends RuntimeException{
    public ImageFormatException(String message){
        super(message);
    }
}
