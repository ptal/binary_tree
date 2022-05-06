package ds;

public class NullKeyException extends RuntimeException {

    @Override
    public String getMessage() {
        return "The key is null";
    }

}
