package org.guzoff.traveler.model.entity;

import org.junit.Test;
import static org.junit.Assert.*;

public class CityTest {
    
    @Test
    public void testAddValidStationSuccess() {
        Station station = new Station();
        City city = new City();
        city.addStation(station);
        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
    
}
