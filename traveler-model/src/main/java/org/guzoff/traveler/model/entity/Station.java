package org.guzoff.traveler.model.entity;

import lombok.Getter;
import lombok.Setter;

public class Station extends AbstractEntity {

    @Getter @Setter private City city;
    @Getter @Setter private Address address;
    @Getter @Setter private String phone;
    @Getter @Setter private GeoLocation location;
    @Getter @Setter private StationType type;
}
