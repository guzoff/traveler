package org.guzoff.traveler.model.search;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import org.guzoff.traveler.model.entity.StationType;

public class StationCriteria {
    
    @Getter @Setter private String name;
    @Getter @Setter private StationType stationType;
    @Getter @Setter private String address;
    
    public static StationCriteria byName(String name) {
        return new StationCriteria(name);
    }
    
    public StationCriteria() {
    }
    
    private StationCriteria(String name) {
        this.name = Objects.requireNonNull(name);
    }
    
    public StationCriteria(StationType stationType) {
        this.stationType = Objects.requireNonNull(stationType);
    }

}
