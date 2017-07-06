package org.guzoff.traveler.model.entity;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

public class Station extends AbstractEntity {

    @Getter private City city;
    @Getter @Setter private Address address;
    @Getter @Setter private String phone;
    @Getter @Setter private GeoLocation geoLocation;
    @Getter private StationType stationType;
    
    //should be called by City object
    Station(City city, StationType stationType) {
        this.city = Objects.requireNonNull(city);
        this.stationType = Objects.requireNonNull(stationType);
    }
}
