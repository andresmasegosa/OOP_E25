package session8.b_customexceptions;

public class NegativeDepositException extends RuntimeException{

    public NegativeDepositException() {
    }

    @Override
    public String getMessage(){
        return "This is not allowed. It is a negative quantity.";
    }
}
