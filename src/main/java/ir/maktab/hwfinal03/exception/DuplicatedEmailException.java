package ir.maktab.hwfinal03.exception;

public class DuplicatedEmailException extends RuntimeException{
    public DuplicatedEmailException(String message){
        super(message);
    }
}