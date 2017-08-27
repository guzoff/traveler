package org.guzoff.traveler.exception;

public abstract class AppException extends RuntimeException {

    private static final long serialVersionUID = 8084272634192210720L;

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

}
