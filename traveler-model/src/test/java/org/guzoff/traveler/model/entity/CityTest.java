package org.guzoff.traveler.model.entity;

import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CityTest {
    
    private City city;
    private Station station;
    
    @Before
    public void setup() {
        city = new City();
        station = new Station();
    }
    
    @Test
    public void testAddValidStationSuccess() {
        city.addStation(station);
        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }
    
    @Test
    public void testRemoveValidStationSuccess() {
        city.addStation(station);
        city.removeStation(station);
        assertFalse(containsStation(city, station));
    }
    
    @Test
    public void testRemoveStationFromEmptyStationsSuccess() {
        city.removeStation(station);
        assertFalse(containsStation(city, station));
    }
    
    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);
        assertTrue(false);
    }
    
    @Test
    public void testRemoveNullStationResultsNoChanges() {
        city.addStation(station);
        Set stations = city.getStations();
        city.removeStation(null);
        assertEquals(stations, city.getStations());
    }
    
    @Test
    public void testAddDuplicateStationFailure() {
        city.addStation(station);
        city.addStation(station);
        assertEquals(city.getStations().size(), 1);
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
    
}
