package org.guzoff.traveler.exception;

public class CommunicationException extends AppException {

    private static final long serialVersionUID = -6463350177205709119L;

    public CommunicationException(String message) {
        super(message);
    }

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }

}
