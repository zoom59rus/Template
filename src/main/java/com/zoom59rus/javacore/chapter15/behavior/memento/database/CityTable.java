package com.zoom59rus.javacore.chapter15.behavior.memento.database;

import com.zoom59rus.javacore.chapter15.behavior.memento.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CityTable implements Table<City> {
    private List<City> cities;

    public CityTable() {
        this.cities = new ArrayList<>();
    }

    private CityTable(CityTable cityTable){
        this.cities = new ArrayList<>(cityTable.cities);
    }

    @Override
    public City getRow(Integer id) {
        return cities.get(id);
    }

    @Override
    public Integer save(City city) {
        Integer id = cities.size();
        if(cities.contains(city)){
            System.out.println("Запись существует.");
            return -1;
        }
        city.setId(id);
        cities.add(id, city);

        return id;
    }

    @Override
    public Map<Integer, City> getAll() {
        return null;
    }

    @Override
    public Table clone(){
        return new CityTable(this);
    }
}
