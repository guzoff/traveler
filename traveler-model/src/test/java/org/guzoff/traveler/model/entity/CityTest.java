package org.guzoff.traveler.model.entity;

import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CityTest {
    
    private City city;
    
    @Before
    public void setup() {
        city = new City("Minsk");
    }
    
    @Test
    public void testAddValidStationSuccess() {
        Station station = city.addStation(StationType.BUS);
        assertTrue(containsStation(city, station));
        assertEquals(city, station.getCity());
    }
    
    @Test
    public void testRemoveValidStationSuccess() {
        Station station = city.addStation(StationType.RAILWAY);
        city.removeStation(station);
        assertFalse(containsStation(city, station));
    }
    
    @Test
    public void testRemoveStationFromEmptyStationsSetSuccess() {
        Station station = new Station(new City("Kyiv"), StationType.RAILWAY);
        city.removeStation(station);
        assertEquals(city.getStations().size(), 0);
    }
    
    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);
        assertTrue(false);
    }
    
    @Test
    public void testRemoveNullStationResultsNoChanges() {
        city.addStation(StationType.AIRPORT);
        Set stations = city.getStations();
        city.removeStation(null);
        assertEquals(stations, city.getStations());
    }
    
    @Test
    public void testAddDuplicateStationFailure() {
        city.addStation(StationType.BUS);
        city.addStation(StationType.BUS);
        assertEquals(city.getStations().size(), 1);
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
    
}
