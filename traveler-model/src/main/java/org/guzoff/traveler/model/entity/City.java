package org.guzoff.traveler.model.entity;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.guzoff.traveler.util.CommonUtil;

public class City extends AbstractEntity {

    @Getter @Setter private String name;
    @Getter @Setter private String district;
    @Getter @Setter private String region;      //top level in the country
    private Set<Station> stations;

    void addStation(Station station) {
        if (stations == null) {
            stations = new HashSet();
        }
        stations.add(station);
        station.setCity(this);
    }

    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }
    
}
