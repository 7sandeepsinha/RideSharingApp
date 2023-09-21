package exception;

public class InvalidUserDetailsException extends Exception{
    public InvalidUserDetailsException() {
    }

    public InvalidUserDetailsException(String message) {
        super(message);
    }

    public InvalidUserDetailsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserDetailsException(Throwable cause) {
        super(cause);
    }

    public InvalidUserDetailsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
