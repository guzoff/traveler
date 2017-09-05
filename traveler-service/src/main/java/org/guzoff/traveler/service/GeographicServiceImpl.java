package org.guzoff.traveler.service;

import java.util.ArrayList;
import java.util.List;
import org.guzoff.traveler.model.entity.City;
import org.guzoff.traveler.util.CommonUtil;

class GeographicServiceImpl implements GeographicService {

    private final List<City> cities;
    
    public GeographicServiceImpl() {
        cities = new ArrayList<>();
    }

    @Override
    public List<City> findCities() {
        return CommonUtil.getSafeList(cities);
    }

    @Override
    public void saveCity(City city) {
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }

}
