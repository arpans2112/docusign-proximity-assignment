package validationexception;

public class RangeNotValidException extends Exception{


    public RangeNotValidException(String errorMessage){
        super(errorMessage);
    }

}
