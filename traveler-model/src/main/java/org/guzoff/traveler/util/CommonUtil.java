package org.guzoff.traveler.util;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.guzoff.traveler.model.entity.City;

public class CommonUtil {

    private CommonUtil(){
    }
    
    public static <T> Set<T> getSafeSet(Set<T> set) {
        return Collections.unmodifiableSet(Optional.ofNullable(set)
                                            .orElse(Collections.emptySet()));
    }

    public static List<City> getSafeList(List<City> cities) {
        return Collections.unmodifiableList(Optional.ofNullable(cities)
                                            .orElse(Collections.emptyList()));
    }
}
