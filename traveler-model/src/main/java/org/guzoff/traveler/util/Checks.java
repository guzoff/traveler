package org.guzoff.traveler.util;

import org.guzoff.traveler.exception.InvalidParameterException;

public class Checks {

    public static void checkParameter(boolean check, String message) 
                                        throws InvalidParameterException {
        if (!check) {
            throw new InvalidParameterException(message);
        }
    }

}
