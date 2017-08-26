package org.guzoff.traveler.service;

import java.util.List;
import org.guzoff.traveler.model.entity.City;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GeographicServiceImplTest {
    
    private GeographicService service;
    
    @Before
    public void setup() {
        service = new GeographicServiceImpl();
    }
    
    @Test
    public void testNoDataReturnedAtStart() {
        List<City> cities = service.findCities();
        assertTrue(cities.isEmpty());
    }
    
    @Test
    public void testSaveNewCitySuccess() {
        City city = new City("Odessa");
        service.saveCity(city);
        
        List<City> cities = service.findCities();
        assertEquals(cities.size(), 1);
        assertEquals(cities.get(0).getName(), "Odessa");
    }
    
}
