package org.guzoff.traveler.util;

import org.guzoff.traveler.exception.InvalidParameterException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChecksTest {

    @Test
    public void testCheckParameterGetException() {
        try {
            Checks.checkParameter(false, "test");
            assertTrue(false);
        } catch (Exception ex) {
            assertSame(ex.getClass(), InvalidParameterException.class);
            assertEquals(ex.getMessage(), "test");
        }
    }
    
    @Test
    public void testCheckParameterNoException() {
        Checks.checkParameter(true, "test");
        assertTrue(true);
    }
    
}
