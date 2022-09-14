package exception;

public class VacinaSemResponsavelException extends Exception {

    public VacinaSemResponsavelException(String message, Throwable cause) {
        super(message, cause);
    }

    public VacinaSemResponsavelException(String message) {
        super(message);
    }
}
