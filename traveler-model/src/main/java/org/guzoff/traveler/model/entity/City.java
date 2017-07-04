package org.guzoff.traveler.model.entity;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;

public class City extends AbstractEntity {

    @Getter @Setter private String name;
    @Getter @Setter private String district;
    @Getter @Setter private String region;      //top level in the country
    @Getter @Setter private Set<Station> stations;
}
