package org.guzoff.traveler.exception;

public class ConfigurationException extends AppException {

    private static final long serialVersionUID = -8620910063168872982L;

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
