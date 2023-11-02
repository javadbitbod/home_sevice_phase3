package ir.maktab.hwfinal03.exception;

public class SendEmailFailedException extends RuntimeException{
    public SendEmailFailedException(String message){
        super(message);
    }
}
