package org.guzoff.traveler.model.entity;

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
        boolean removed = city.removeStation(station);
        assertEquals(removed, true);
        assertFalse(containsStation(city, station));
    }
    
    @Test
    public void testRemoveStationFromEmptyStationsSetSuccess() {
        Station station = new Station(new City("Kyiv"), StationType.RAILWAY);
        boolean removed = city.removeStation(station);
        assertEquals(removed, false);
        assertEquals(city.getStations().size(), 0);
    }
    
    @Test(expected = NullPointerException.class)
    public void testAddNullStationFailure() {
        city.addStation(null);
        assertTrue(false);
    }
    
    @Test
    public void testRemoveNullStationResultNoChanges() {
        Station station = city.addStation(StationType.AIRPORT);
        boolean removed = city.removeStation(null);
        assertEquals(removed, false);
        assertTrue(containsStation(city, station));
        assertEquals(city.getStations().size(), 1);
    }
    
    @Test
    public void testAddDuplicateStationResultNoChanges() {
        Station station1 = city.addStation(StationType.BUS);
        Station station2 = city.addStation(StationType.BUS);
        assertTrue(containsStation(city, station1));
        assertTrue(containsStation(city, station2));
        assertEquals(city.getStations().size(), 1);
    }

    private boolean containsStation(City city, Station station) {
        return city.getStations().contains(station);
    }
    
}
