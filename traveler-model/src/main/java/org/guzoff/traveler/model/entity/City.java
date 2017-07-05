package org.guzoff.traveler.model.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.guzoff.traveler.util.CommonUtil;

public class City extends AbstractEntity {

    @Getter @Setter private String name;
    @Getter @Setter private String district;
    @Getter @Setter private String region;      //top level in the country
    private Set<Station> stations;

    public void addStation(final Station station) {
        Objects.requireNonNull(station, "station parameter is not initialized");
        if (stations == null) {
            stations = new HashSet<>();
        }
        stations.add(station);
        station.setCity(this);
    }

    public void removeStation(final Station station) {
        if (stations != null) {
            stations.remove(station);
        }
    }
    
    public Set<Station> getStations() {
        return CommonUtil.getSafeSet(stations);
    }

    
}
