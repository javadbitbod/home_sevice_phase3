package ir.maktab.hwfinal03.exception;

public class WalletBalanceException extends RuntimeException {
    public WalletBalanceException(String message){
        super(message);
    }
}
