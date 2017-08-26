package org.guzoff.traveler.service;

import java.util.List;
import org.guzoff.traveler.model.entity.City;

interface GeographicService {
    
    List<City> findCities();
    
    void saveCity(City city);
    
}
