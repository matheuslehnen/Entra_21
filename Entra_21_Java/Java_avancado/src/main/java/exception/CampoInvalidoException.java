package exception;

public class CampoInvalidoException extends Throwable {

    public CampoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CampoInvalidoException(String message) {
        super(message);
    }
}
