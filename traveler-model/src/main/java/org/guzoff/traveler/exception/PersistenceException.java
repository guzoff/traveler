package org.guzoff.traveler.exception;

public class PersistenceException extends AppException {

    private static final long serialVersionUID = 2054310870387491344L;

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

}
