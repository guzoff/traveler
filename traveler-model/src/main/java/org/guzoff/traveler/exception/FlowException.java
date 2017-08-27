package org.guzoff.traveler.exception;

public class FlowException extends AppException {

    private static final long serialVersionUID = -2902519916112357638L;

    public FlowException(String message) {
        super(message);
    }

    public FlowException(String message, Throwable cause) {
        super(message, cause);
    }

}
