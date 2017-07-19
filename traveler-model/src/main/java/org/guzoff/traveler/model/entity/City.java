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
    
    public City(final String name) {
        this.name = name;
    }

    public Station addStation(final StationType stationType) {
        if (stations == null) {
            stations = new HashSet<>();
        }
        Station station = new Station(this, stationType);
        stations.add(station);
        return station;
    }

    public boolean removeStation(final Station station) {
        if (stations != null) {
            return stations.remove(station);
        }
        return false;
    }
    
    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }

    
}
