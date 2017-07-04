package org.guzoff.traveler.util;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class CommonUtil {

    private CommonUtil(){
    }
    
    public static <T> Set<T> getSafeSet(Set<T> set) {
        return Collections.unmodifiableSet(Optional.ofNullable(set)
                                            .orElse(Collections.emptySet()));
    }
}
