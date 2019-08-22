package validationexception;

public class EmptyFileException extends Exception {

    public EmptyFileException(String errorMessage){
        super(errorMessage);
    }
}
